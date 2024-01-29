
package adminServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;


/**
 * Servlet implementation class UpdatePackage1
 */
@WebServlet("/UpdatePackage1")
public class UpdatePackage1 extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		String days = request.getParameter("days");
		String packageCost = request.getParameter("packageCost");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("update package set packagename =?,place=?,packageCost=?,days=? where packagename='"+packagename+"'and place='"+place+"'");
			ps.setString(1,packagename );
			ps.setString(2,place );
			ps.setString(3,packageCost );
			ps.setString(4,days );
                        System.out.println(packagename);
			System.out.println(place);
			System.out.println(packageCost);
                        System.out.println(days);
			ps.executeUpdate();
			
			out.println("Package "+packagename+" modified Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
