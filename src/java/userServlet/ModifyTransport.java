
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
 * Servlet implementation class ModifyTransport
 */
@WebServlet("/ModifyTransport")
public class ModifyTransport extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String transportType = request.getParameter("transportType");
		String vehicleType = request.getParameter("vehicleType");
		String vehicleName = request.getParameter("vehicleName");
		String packagename = request.getParameter("packagename");
		String place = request.getParameter("place");
		HttpSession session = request.getSession();
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("select * from booktransport where transportType ='"+transportType +"' and vehicleType='"+vehicleType+"'and vehicleName='"+vehicleName+"'and email='"+session.getAttribute("email")+"'and packagename='"+packagename+"'and place='"+place+"'");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				
				session.setAttribute("transportType1", rs.getString(1));
				session.setAttribute("vehicleType1", rs.getString(2));
				session.setAttribute("vehicleName1", rs.getString(3));
				session.setAttribute("vehicleCost1", rs.getInt(4));
				session.setAttribute("vehicleDate", rs.getString(5));
				session.setAttribute("packagename", rs.getString(7));
				session.setAttribute("place", rs.getString(8));
				
					response.sendRedirect("User/UpdateTransport.jsp");

			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
