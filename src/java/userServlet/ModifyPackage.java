
package userServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyPackage
 */
@WebServlet("/ModifyPackage")
public class ModifyPackage extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		HttpSession session = request.getSession();
		
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("select * from bookpackage where packagename ='"+packagename +"' and place='"+place+"'and email='"+session.getAttribute("email")+"'");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				session.setAttribute("packagename", rs.getString(1));
				session.setAttribute("place", rs.getString(2));
				session.setAttribute("packagecost", rs.getString(3));
				session.setAttribute("days", rs.getString(4));
				session.setAttribute("noofpersons", rs.getString(5));
				session.setAttribute("totalcost", rs.getInt(6));
				response.sendRedirect("User/UpdatePackage.jsp");

			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
