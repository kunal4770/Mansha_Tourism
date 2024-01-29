
package adminServlet;

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
 * Servlet implementation class UpdateRoom1
 */
@WebServlet("/UpdateRoom1")
public class UpdateRoom1 extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hotelName = request.getParameter("hotelName");
		String roomType = request.getParameter("roomType");
		String roomSize = request.getParameter("roomSize");
		String roomCost = request.getParameter("roomCost");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("update room set hotelName =?,roomType=?,roomSize=?,roomCost=? where hotelName='"+hotelName+"'and roomType='"+roomType+"'and roomSize='"+roomSize+"'");
			ps.setString(1,hotelName );
			ps.setString(2,roomType );
			ps.setString(3,roomSize );
			ps.setString(4,roomCost );
			ps.executeUpdate();
			
			out.println("Room "+hotelName+" modified Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
