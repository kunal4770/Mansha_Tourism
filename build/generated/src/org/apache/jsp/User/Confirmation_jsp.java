package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Confirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/User/Header.jsp");
    _jspx_dependants.add("/User/Aside.jsp");
    _jspx_dependants.add("/User/../home/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../home/Aside.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../home/Home.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Confirmation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Home.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class = \"top-nav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"../home/Login.jsp\">Log Out</a></li>\n");
      out.write("\t\t\t\t<li><a>Hello ");
      out.print(session.getAttribute("email") );
      out.write("</a></li>\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("    <!-- HEADER -->\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("        \t<div align=\"left\">\n");
      out.write("\t\t\t\t<font size=\"7\">\n");
      out.write("\t\t\t\t\t<p id=\"title\">Mansha Tourism</p>\n");
      out.write("\t\t\t\t</font>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</header>\n");
      out.write("<div id=\"navbar\">\n");
      out.write("\t<nav class=\"navbar navbar-default\" role=\"navigation\" >\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li><a>Welcome to Tourism Management System</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"home/Aside.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"home/Home.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Aside</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <aside class=\"aside\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li><a href=\"User.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Profile.jsp\">Profile</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Package.jsp\">Select Package</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Room.jsp\">Select Room</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Food.jsp\">Select Food</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Transport.jsp\">Select Transport</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"ModifyPackage.jsp\">Modify/ Delete Package</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"ModifyRoom.jsp\">Modify/ Delete Room</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"ModifyFood.jsp\">Modify/ Delete Food</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"ModifyTransport.jsp\">Modify/ Delete Transport</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Confirmation.jsp\">Confirmation</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\n");
      out.write("\t</aside>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\t<section class=\"section\">\n");
      out.write("\t\t<div class=\"sectiondev\">\n");
      out.write("\t\t\t<h2>Confirmation Details</h2>\n");
      out.write("\t\t\t");

			String packagename="";
			String place="";
			String packageCost =""  ;
			int foodcost=0;
			String roomCost="";
			int transportcost=0;
			int totalcost=0;
			String email = (String) session.getAttribute("email");
			System.out.println(email);
			
			
      out.write("\n");
      out.write("\t\t\t<table class=\"table table-striped\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Package</th>\n");
      out.write("\t\t\t\t\t\t<th>Place</th>\n");
      out.write("\t\t\t\t\t\t<th>Package Cost</th>\n");
      out.write("\t\t\t\t\t\t<th>Room Cost</th>\n");
      out.write("\t\t\t\t\t\t<th>Food Cost</th>\n");
      out.write("\t\t\t\t\t\t<th>Transport Cost</th>\n");
      out.write("\t\t\t\t\t\t<th>Total Cost</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t");
try{
							Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
							PreparedStatement ps = con.prepareStatement("select * from bookpackage where email='"+email+"'");
							ResultSet rs = ps.executeQuery();
							while(rs.next()){
								packagename = rs.getString(1);
								place = rs.getString(2) ;
								packageCost= rs.getString(3);
								
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(packagename );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(place);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(packageCost );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t");

								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps1 = con1.prepareStatement("select SUM(roomCost) from bookroom where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs1 = ps1.executeQuery();
								while(rs1.next()){
									roomCost =rs1.getString(4);
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(roomCost );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");

								}
								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con2=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps2 = con2.prepareStatement("select SUM(totalCost) from bookfood where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs2 = ps2.executeQuery();
								while(rs2.next()){
									foodcost = rs2.getInt(1);
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(foodcost );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 
								}
								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con3=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps3 = con3.prepareStatement("select SUM(vehicleCost) from booktransport where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs3 = ps3.executeQuery();
								while(rs3.next()){
									transportcost =rs3.getInt(5);
									
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(transportcost );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 
								}
								Class.forName("org.apache.derby.jdbc.ClientDriver");
                                                                Connection con4=DriverManager.getConnection("jdbc:derby://localhost:1527/Tourism","app","app");
								PreparedStatement ps4 = con4.prepareStatement("select packageCost from bookpackage where email='"+email+"' and packagename = '"+packagename+"' and place='"+place+"'");
								ResultSet rs4 = ps4.executeQuery();
								while(rs4.next()){
									packageCost= rs4.getString(3);
								}
								totalcost = foodcost+transportcost;
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(totalcost );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><a href=\"Payment.jsp?totalcost=");
      out.print(totalcost );
      out.write("&packagename=");
      out.print(packagename);
      out.write("&place=");
      out.print(place);
      out.write("\">Pay</a><td>\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
						}
						catch(Exception e){
							e.printStackTrace();
						}
						
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Home.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t  <div>\n");
      out.write("\t\t    <div class=\"panel-body\" align=\"Center\">©Mansha tourism| All Rights Reserved</div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
