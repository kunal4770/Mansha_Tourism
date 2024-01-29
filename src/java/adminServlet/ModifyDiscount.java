/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class ModifyDiscount
 */
@WebServlet("/ModifyDiscount")
public class ModifyDiscount extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packagename = request.getParameter("packagename");
		String type = request.getParameter("type");
		String discount = request.getParameter("discount");
		PrintWriter out = response.getWriter();
		
		if(type.equals("modify")){
			try{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
                                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
				PreparedStatement ps = con.prepareStatement("select discount from discount where packagename ='"+packagename+"'");
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
				out.println(rs.getString(1));
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(type.equals("update")){
			try{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
                                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
				PreparedStatement ps = con.prepareStatement("update discount set discount=? where packagename ='"+packagename+"'");
				ps.setString(1, discount);
				ps.executeUpdate();
				out.println("Discount updated successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(type.equals("deleteDiscount")){
			try{
				Class.forName("org.apache.derby.jdbc.ClientDriver");
                                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
				PreparedStatement ps = con.prepareStatement("delete from discount where packagename ='"+packagename+"'");

				ps.executeUpdate();
				out.println(packagename+" discount deleted successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
