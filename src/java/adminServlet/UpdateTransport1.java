
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
 * Servlet implementation class UpdateTransport1
 */
@WebServlet("/UpdateTransport1")
public class UpdateTransport1 extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String transportType = request.getParameter("transportType");
		String vehicleType = request.getParameter("vehicleType");
		String vehicleName = request.getParameter("vehicleName");
		String vehicleCost = request.getParameter("vehicleCost");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		try{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
			PreparedStatement ps = con.prepareStatement("update transport set transportType =?,vehicleType=?,vehicleName=?, vehicleCost=? where transportType='"+transportType+"'and vehicleType='"+vehicleType+"'and vehicleName='"+vehicleName+"'");
			ps.setString(1,transportType );
			ps.setString(2,vehicleType );
			ps.setString(3,vehicleName );
			ps.setString(4,vehicleCost );
			ps.executeUpdate();
			
			out.println("vehicle "+vehicleName+" modified Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
