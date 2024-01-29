
package adminServlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class Package
 */
@WebServlet("/Package")
public class Package extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		String days = request.getParameter("days");
		String packageCost = request.getParameter("packageCost");
		PrintWriter out = response.getWriter();
		
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("select packagename from package where packagename ='"+packagename +"' and place='"+place+"'");
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				out.println("Package "+packagename +" with place "+place+" alredy Exist. Please enter another package");
			}else if(packagename.equals("")||place.equals("")||days.equals("")||packageCost.equals("")){
				out.println("Invalid details");
			
			}else{
				PreparedStatement p = con.prepareStatement("insert into package values(?,?,?,?)");
				p.setString(1, packagename);
				p.setString(2, place);
				p.setString(3, packageCost);
				p.setString(4, days);
				p.executeUpdate();
				out.print("Package name "+packagename+" Added Successfully");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
