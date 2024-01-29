
package userServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyPackage1
 */
@WebServlet("/ModifyPackage1")
public class ModifyPackage1 extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		String days = request.getParameter("days");
		String packageCost = request.getParameter("packageCost");
		String persons = request.getParameter("persons");
		int totalcost = Integer.parseInt(request.getParameter("totalCost"));
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		if(persons.equals("")||persons.equals("0")){
			out.println("Please enter no of persons");
		}else{
			
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("update bookpackage set noofPersons =?,totalcost=? where packagename='"+packagename+"'and place='"+place+"' and email='"+session.getAttribute("email")+"'");
			ps.setString(1,persons );
			ps.setInt(2,totalcost );
			ps.executeUpdate();
			
			out.println("Package "+packagename+" modified Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
