
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
 * Servlet implementation class BookRoom
 */
@WebServlet("/BookRoom")
public class BookRoom extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hotelName = request.getParameter("hotelName");
		String roomType = request.getParameter("roomType");
		String roomSize = request.getParameter("roomSize");
		int roomCost = Integer.parseInt(request.getParameter("roomCost"));
		String roomDate = request.getParameter("roomDate");
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		HttpSession session = request.getSession();
		String email =(String) session.getAttribute("email");
		PrintWriter out = response.getWriter();
		
	if(packagename.equals("select")||place.equals("select")||roomDate.equals("")){
		out.println("Please enter correct details");
	}else{
		
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
				PreparedStatement p = con.prepareStatement("insert into bookroom values(?,?,?,?,?,?,?,?)");
				p.setString(1, hotelName);
				p.setString(2, roomType);
				p.setString(3, roomSize);
				p.setInt(4, roomCost);
				p.setString(5, roomDate);
				p.setString(6, email);
				p.setString(7, packagename);
				p.setString(8, place);
				p.executeUpdate();
				out.print("Hotel name "+hotelName+" Booked Successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

}
