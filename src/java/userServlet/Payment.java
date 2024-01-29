
package userServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Payment", urlPatterns = {"/Payment"})
public class Payment extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String packagename = request.getParameter("packagename");
		String cost = request.getParameter("packagecost");
		String place = request.getParameter("place");
		String email = request.getParameter("email");
		String cardName = request.getParameter("cardname");
		String cardNumber = request.getParameter("cardnumber");
		String cvv = request.getParameter("cvv");
		
			try{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
                                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
				PreparedStatement ps = con.prepareStatement("select packagename from payment where packagename='"+packagename+"' and place='"+place+"' and email='"+email+"'");
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					out.println("Already Paid");
				}else if(cvv.equals("")||cardNumber.equals("")||cardName.equals("")){
					out.println("Invalid details");
				}else{
					PreparedStatement p = con.prepareStatement("insert into payment values(?,?,?,?,?,?,?)");
					p.setString(1, packagename);
					p.setString(2, place);
					p.setString(3, cost);
					p.setString(4, email);
					p.setString(5, cardName);
					p.setString(6, cardNumber);
					p.setString(7, cvv);
					p.executeUpdate();
					out.print("Payment Successfull");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
