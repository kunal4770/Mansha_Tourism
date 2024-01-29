
package userServlet;

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
 * Servlet implementation class SelectPlace
 */
@WebServlet("/SelectPlace")
public class SelectPlace extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename =  request.getParameter("packagename");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("select place from bookpackage where packagename ='"+packagename+"' and email='"+session.getAttribute("email")+"'");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
			out.println("<option value='"+rs.getString(1)+"'>"+rs.getString(1)+"</option>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
