
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
 * Servlet implementation class ModifyFood
 */
@WebServlet("/ModifyFood")
public class ModifyFood extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String foodName = request.getParameter("foodName");
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		HttpSession session = request.getSession();
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("select * from bookfood where type ='"+type+"' and foodName='"+foodName+"'and email='"+session.getAttribute("email")+"'and packagename='"+packagename+"'and place='"+place+"'");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				session.setAttribute("type", rs.getString(1));
				session.setAttribute("foodName", rs.getString(2));
				session.setAttribute("foodCost", rs.getString(3));
				session.setAttribute("quantity", rs.getString(4));
				session.setAttribute("totalCost", rs.getInt(5));
				session.setAttribute("packagename", rs.getString(7));
				session.setAttribute("place", rs.getString(8));
				

					response.sendRedirect("User/UpdateFood.jsp");

			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
