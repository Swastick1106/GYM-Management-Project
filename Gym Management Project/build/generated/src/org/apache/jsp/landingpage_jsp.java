package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class landingpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>FitNess - Home | By Code Info</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Font Awesome Iocns cdn link -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Philosopher:wght@700&family=Poppins:wght@300;400;500&display=swap\"/>\n");
      out.write("    <style>\n");
      out.write("*{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  outline: none;\n");
      out.write("  border: none;\n");
      out.write("  text-decoration: none;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  transition: 0.2s linear;\n");
      out.write("  text-transform: capitalize;\n");
      out.write("  font-family: \"Poppins\", sans-serif;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("  background: #000;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("  margin-top: 2rem;\n");
      out.write("  width: 150px;\n");
      out.write("  padding: 12px;\n");
      out.write("  color: #fff;\n");
      out.write("  background: tomato;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".btn:hover{\n");
      out.write("  background: rgba(212, 48, 48, 0.76);\n");
      out.write("  transition: 0.4s;\n");
      out.write("}\n");
      out.write("/* Header */\n");
      out.write(".header{\n");
      out.write("  position: fixed;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  z-index: 1000;\n");
      out.write("  padding: 1.5rem 8%;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  color: #fff;\n");
      out.write("  justify-content: space-between;\n");
      out.write("}\n");
      out.write(".header .logo{\n");
      out.write("  font-size: 22px;\n");
      out.write("  font-weight: bolder;\n");
      out.write("  color: #fff;\n");
      out.write("  padding-right: 10px;\n");
      out.write("  margin-right: 20rem;\n");
      out.write("}\n");
      out.write(".header .logo i{\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 0.5rem;\n");
      out.write("}\n");
      out.write(".header .navbar a{\n");
      out.write("  font-size: 1.1rem;\n");
      out.write("  margin: 0 1rem;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".header .navbar a:hover{\n");
      out.write("  color: #baa6cf;\n");
      out.write("}\n");
      out.write(".header .btn{\n");
      out.write("  background: transparent;\n");
      out.write("  color: tomato;\n");
      out.write("  border: 1px solid tomato;\n");
      out.write("  font-size: 12px;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Home Section */\n");
      out.write(".max-width{\n");
      out.write("  max-width: 1300px;\n");
      out.write("  padding: 0 80px;\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write("section{\n");
      out.write("  padding: 50px 0 50px 0;\n");
      out.write("}\n");
      out.write(".home{\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write(".home .max-width{\n");
      out.write("  width: 100%;\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write(".home .home-content{\n");
      out.write("  width: 50%;\n");
      out.write("  padding: 2rem;\n");
      out.write("}\n");
      out.write(".home h3{\n");
      out.write("  color: #fff;\n");
      out.write("  margin-top: 6rem;\n");
      out.write("  font-size: 5rem;\n");
      out.write("  font-family: 'Philosopher', sans-serif;\n");
      out.write("}\n");
      out.write(".home p{\n");
      out.write("  color: rgb(194, 191, 191);\n");
      out.write("  margin-top: 1rem;\n");
      out.write("  font-size: 12px;\n");
      out.write("}\n");
      out.write(".home .home-image{\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write(".home .home-image img{\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <a href=\"#\" class=\"logo\">\n");
      out.write("            <i class=\"fas fa-dumbbell\"></i>Gym Emporium\n");
      out.write("        </a>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a href=\"#\">Home</a>\n");
      out.write("            <a href=\"#\">Services</a>\n");
      out.write("            <a href=\"#\">Contact</a>\n");
      out.write("            <a href=\"#\">Pricing</a>\n");
      out.write("            <a href=\"#\">|</a>\n");
      out.write("            <a href=\"login.jsp\">Login</a>\n");
      out.write("            <a href=\"registration.html\" class=\"btn\">Sign Up</a>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"home\">\n");
      out.write("        <div class=\"max-width\">\n");
      out.write("            <div class=\"home-content\">\n");
      out.write("                <h3>help for ideal <br> body fitness</h3>\n");
      out.write("                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta, numquam, sequi assumenda nam, vel nihil repudiandae omnis eveniet est excepturi atque molestias at dolores fugit!</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"home-image\">\n");
      out.write("                <img src=\"https://img.freepik.com/free-photo/young-fitness-man-studio_7502-5007.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
