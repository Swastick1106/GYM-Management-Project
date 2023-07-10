package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Cool Login form | By Code Info</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("   <!-- Font Awesome Cdn Link -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap\"/>\n");
      out.write("   <style>\n");
      out.write("*{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-family: \"Poppins\", sans-serif;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    background: tomato;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    width: 100%;\n");
      out.write("    display: flex;\n");
      out.write("    max-width: 850px;\n");
      out.write("    background: #fff;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    box-shadow: 0 10px 15px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write(".login{\n");
      out.write("    width: 400px;\n");
      out.write("}\n");
      out.write("form{\n");
      out.write("    width: 250px;\n");
      out.write("    margin: 60px auto;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("    margin: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: bolder;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p{\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 10px;\n");
      out.write("}\n");
      out.write("hr{\n");
      out.write("    border-top: 2px solid tomato;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pic img{\n");
      out.write("    width: 450px;\n");
      out.write("    height: 100%;\n");
      out.write("    border-top-right-radius: 15px;\n");
      out.write("    border-bottom-right-radius: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form label{\n");
      out.write("    display: block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    padding: 5px;\n");
      out.write("}\n");
      out.write("input{\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 2px;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    padding: 8px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    border: 1px solid gray;\n");
      out.write("}\n");
      out.write("button{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    padding: 8px;\n");
      out.write("    width: 252px;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background: tomato;\n");
      out.write("}\n");
      out.write("button:hover{\n");
      out.write("    background: rgba(214, 86, 64, 1);\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("    margin: 20px;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    color: black;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("   </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form action=\"LoginValidation2.jsp\">\n");
      out.write("                <h1>Login</h1>\n");
      out.write("                <hr>\n");
      out.write("                <p>Explore the World of Fitness!</p>\n");
      out.write("                <label>Email</label>\n");
      out.write("                <input type=\"text\" placeholder=\"abc@exampl.com\" name=\"email\">\n");
      out.write("                <label>Password</label>\n");
      out.write("                <input type=\"password\" placeholder=\"enter your password!\" name=\"password\">\n");
      out.write("                <button>Submit</button>\n");
      out.write("                <p>\n");
      out.write("                    <a href=\"#\"></a>\n");
      out.write("                </p>\n");
      out.write("            <closeform></closeform></form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"pic\">\n");
      out.write("            <img src=\"https://wallpapercave.com/wp/wp2957853.jpg\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
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
