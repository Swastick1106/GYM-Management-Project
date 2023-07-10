package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>The Fitness World</title>\n");
      out.write("</head>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Baloo+Bhai&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<style>\n");
      out.write("    /* CSS Reset */\n");
      out.write("    body {\n");
      out.write("        font-family: 'Baloo Bhai', cursive;\n");
      out.write("        color: white;\n");
      out.write("        margin:0px;\n");
      out.write("        padding:0px;\n");
      out.write("        background-image: url('bgpic');\n");
      out.write("        background-size: cover;\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-attachment:fixed;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .left {\n");
      out.write("        display: inline-block;\n");
      out.write("        /* border: 2px solid red; */\n");
      out.write("        position: absolute;\n");
      out.write("        left: 60px;\n");
      out.write("        top: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .left img {\n");
      out.write("        width: 136px;\n");
      out.write("        filter: invert(100%);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .left div {\n");
      out.write("        line-height: 19px;\n");
      out.write("        font-size: 26px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .mid {\n");
      out.write("        display: block;\n");
      out.write("        width: 36%;\n");
      out.write("        margin: 29px auto;\n");
      out.write("        /* border: 2px solid green; */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .right {\n");
      out.write("        position: absolute;\n");
      out.write("        right: 34px;\n");
      out.write("        top: 43px;\n");
      out.write("        display: inline-block;\n");
      out.write("        /* border: 2px solid yellow; */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .navbar {\n");
      out.write("        display: inline-block;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .navbar li {\n");
      out.write("        display: inline-block;\n");
      out.write("        font-size: 25px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .navbar li a {\n");
      out.write("        color: white;\n");
      out.write("        text-decoration: none;\n");
      out.write("        padding: 34px 23px;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .navbar li a:hover,\n");
      out.write("    .navbar li a.active {\n");
      out.write("        text-decoration: underline;\n");
      out.write("        color: grey;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn {\n");
      out.write("        font-family: 'Baloo Bhai', cursive;\n");
      out.write("        margin: 0px 9px;\n");
      out.write("        background-color: black;\n");
      out.write("        color: white;\n");
      out.write("        padding: 4px 14px;\n");
      out.write("        border: 2px solid grey;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        font-size: 20px;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn:hover {\n");
      out.write("        background-color: rgb(31, 30, 30);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {      \n");
      out.write("        margin: 106px 80px;\n");
      out.write("        padding: 75px;\n");
      out.write("        width: 33%;       \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group input {\n");
      out.write("        font-family: 'Baloo Bhai', cursive;\n");
      out.write("        text-align: center;\n");
      out.write("        display: block;\n");
      out.write("        width: 508px;\n");
      out.write("        padding: 1px;\n");
      out.write("        border: 2px solid black;\n");
      out.write("        margin: 11px auto;\n");
      out.write("        font-size: 25px;\n");
      out.write("        border-radius: 8px;\n");
      out.write("    }\n");
      out.write("    .nextpage{\n");
      out.write("        font-family: 'Baloo Bhai', cursive;\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 25px;\n");
      out.write("    }\n");
      out.write("    .link{\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container h1 {\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container button {\n");
      out.write("        display: block;\n");
      out.write("        width: 74%;\n");
      out.write("        margin: 20px auto;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <!-- Left box for logo -->\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <img src=\"\" alt=\"\">\n");
      out.write("            <div>The Fitness Emporium</div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Mid box for navbar -->\n");
      out.write("        <div class=\"mid\">\n");
      out.write("            <ul class=\"navbar\">\n");
      out.write("                <li><a href=\"#\" class=\"active\">Home</a></li>\n");
      out.write("                <li><a href=\"#\">About Us</a></li>\n");
      out.write("                <li><a href=\"#\">Fitness Calculator</a></li>\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Right box for buttons -->\n");
      out.write("        <div class=\"right\">\n");
      out.write("            <button class=\"btn\">Call Us Now</button>\n");
      out.write("            <button class=\"btn\">Email Us</button>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Join the best gym of Mysuru now</h1>\n");
      out.write("        <form action=\"registrationServ\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Enter your Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"age\" placeholder=\"Enter your Age\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"gender\" placeholder=\"Enter your Gender\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"locality\" placeholder=\"Enter your Locality\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Enter your Email Id\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"phno\" placeholder=\"Enter your Phone Number\">\n");
      out.write("            </div>\n");
      out.write("            <button class=\"btn\">Submit</button>\n");
      out.write("            <div>\n");
      out.write("                <P class =\"nextpage\">If already a member then click for <a class = \"link\" href='registration.html'>Login</a></P>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
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
