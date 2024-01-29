package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdatePackage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Admin/Header.jsp");
    _jspx_dependants.add("/Admin/Aside.jsp");
    _jspx_dependants.add("/Admin/../Footer.jsp");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">\n");
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
      out.write("        <title>Update Package</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('#button').click(function(){\n");
      out.write("\t\tvar packagename = $('#packagename').val();\n");
      out.write("\t\tvar place = $('#place').val();\n");
      out.write("\t\tvar days = $('#days').val();\n");
      out.write("\t\tvar packageCost = $('#packageCost').val();\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype:'POST',\n");
      out.write("\t\t\tdata:{ packagename:packagename, place:place, days:days, packageCost:packageCost},\n");
      out.write("\t\t\turl:'../UpdatePackage1',\n");
      out.write("\t\t\tsuccess: function(result){\n");
      out.write("\t\t\t\t$('#validation').html(result);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
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
      out.write("        <header>\n");
      out.write("<nav class = \"top-nav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"../home/Login.jsp\">Log Out</a></li>\n");
      out.write("\t\t\t\t<li><a>Hello Admin</a></li>\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("    <!-- HEADER -->\n");
      out.write("\t<div id=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("        \t<div align=\"left\">\n");
      out.write("\t\t\t\t<font size=\"7\">\n");
      out.write("\t\t\t\t\t<p id=\"title\">Tourism</p>\n");
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
      out.write("        <title>aside</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"aside\">\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li><a href=\"Admin.jsp\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"Package.jsp\">Add Package</a></li>\n");
      out.write("\t\t\t<li><a href=\"Hotel.jsp\">Add Hotel</a></li>\n");
      out.write("\t\t\t<li><a href=\"Room.jsp\">Add Room</a></li>\n");
      out.write("\t\t\t<li><a href=\"Food.jsp\">Add Food</a></li>\n");
      out.write("\t\t\t<li><a href=\"Transport.jsp\">Add Transport</a></li>\n");
      out.write("\t\t\t<li><a href=\"Discount.jsp\">Add Discount</a></li>\n");
      out.write("\t\t\t<li><a href=\"ModifyPackage.jsp\">Modify / Delete Package</a></li>\n");
      out.write("\t\t\t<li><a href=\"ModifyRoom.jsp\">Modify / Delete Room</a></li>\n");
      out.write("\t\t\t<li><a href=\"ModifyFood.jsp\">Modify / Delete Food</a></li>\n");
      out.write("\t\t\t<li><a href=\"ModifyTransport.jsp\">Modify / Delete Transport</a></li>\n");
      out.write("\t\t\t<li><a href=\"ModifyDiscount.jsp\">Modify / Delete Discount</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\t<section class=\"section\">\n");
      out.write("\t\t<div class=\"sectiondev\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t  <h2>Update Package</h2>\n");
      out.write("\t\t\t  <div class=\"panel col-sm-8\">\n");
      out.write("\t\t\t    <div class=\"panel-body\">\n");
      out.write("\t\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t    \t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t    \t\t\t<form>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\tPackage Name:\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\t\t<input class=\"form-control\" type=\"text\" value=\"");
      out.print(session.getAttribute("packagename") );
      out.write("\" id=\"packagename\" name=\"packagename\" readonly>\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\tEnter Package Place:\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\t\t<input class=\"form-control\" type=\"text\" value=\"");
      out.print(session.getAttribute("place") );
      out.write("\" id=\"place\" name=\"place\" required=\"true\">\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\tEnter Number Of Days:\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\t\t<input class=\"form-control\" type=\"text\" value=\"");
      out.print(session.getAttribute("days") );
      out.write("\" id=\"days\" name=\"days\" required=\"true\">\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\tEnter Cost:\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\t\t<input class=\"form-control\" type=\"text\" value=\"");
      out.print(session.getAttribute("packageCost") );
      out.write("\" id=\"packageCost\" name=\"packageCost\" required=\"true\">\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t\t\t<div class=\"text-right\"> \n");
      out.write("\t\t\t    \t\t\t\t\t\t<input type=\"button\" id=\"button\" value=\"Update Package\" class=\"btn btn-primary\">\n");
      out.write("\t\t\t    \t\t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t    \t\t\t\t<div id=\"validation\"></div>\n");
      out.write("\t\t\t    \t\t\t</form>\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"home/Home.css\">\n");
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
