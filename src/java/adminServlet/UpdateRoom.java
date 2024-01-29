
package adminServlet;

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
 * Servlet implementation class UpdateRoom
 */
@WebServlet("/UpdateRoom")
public class UpdateRoom extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hotelName = request.getParameter("hotelName");
		String roomType = request.getParameter("roomType");
		String roomSize = request.getParameter("roomSize");
		String type = request.getParameter("type");
		
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("select * from room where hotelName ='"+hotelName +"' and roomType='"+roomType+"'and roomSize='"+roomSize+"'");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				HttpSession session = request.getSession();
				session.setAttribute("hotelName", rs.getString(1));
				session.setAttribute("roomType", rs.getString(2));
				session.setAttribute("roomSize", rs.getString(3));
				session.setAttribute("roomCost", rs.getString(4));

				if(type.equals("update")){
				response.sendRedirect("Admin/UpdateRoom.jsp");
				}else{
					response.sendRedirect("User/BookRoom.jsp");
				}

			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
