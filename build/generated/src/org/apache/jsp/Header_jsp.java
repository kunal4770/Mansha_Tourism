package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <header>\n");
      out.write("    <!-- HEADER -->\n");
      out.write("    <nav class = \"top-nav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"home/Login.jsp\">LogIn</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home/AdminLogin.jsp\">Admin</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
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
      out.write("\t\t\t\t<li><a href=\"Home.jsp\" >Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home/About.jsp\" >About</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home/Services.jsp\">Services</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home/Contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("</div>\n");
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