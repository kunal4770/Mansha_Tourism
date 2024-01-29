
package userServlet;

import java.io.IOException;
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
 * Servlet implementation class CancelPackage
 */
@WebServlet("/CancelPackage")
public class CancelPackage extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		HttpSession session = request.getSession();
		
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("delete from bookpackage where packagename='"+packagename+"'and place='"+place+"'and email='"+session.getAttribute("email")+"'");
			ps.executeUpdate();
			PreparedStatement ps1 = con.prepareStatement("delete from bookfood where packagename='"+packagename+"'and place='"+place+"'and email='"+session.getAttribute("email")+"'");
			PreparedStatement ps2 = con.prepareStatement("delete from bookroom where packagename='"+packagename+"'and place='"+place+"'and email='"+session.getAttribute("email")+"'");
			PreparedStatement ps3 = con.prepareStatement("delete from booktransport where packagename='"+packagename+"'and place='"+place+"'and email='"+session.getAttribute("email")+"'");
			ps1.executeUpdate();
			ps2.executeUpdate();
			ps3.executeUpdate();
			response.sendRedirect("User/ModifyPackage.jsp");
			
			} catch (Exception e) {
			e.printStackTrace();
			}
	}

}