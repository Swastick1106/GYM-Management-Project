package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gymPackages_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <head>\n");
      out.write("        <title>Emporium Packages</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-image: url(\"https://media.istockphoto.com/id/953047628/photo/gym-background-with-equipment.jpg?s=612x612&w=0&k=20&c=fPGr6b3T0Lh6LNPqdtTNMdyGEt5ocqM1qtI1GfdsWF0=\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: none;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .mainDiv{\n");
      out.write("                background-color: white;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                border-radius: 10px 10px 10px 10px;\n");
      out.write("                margin: 10%;\n");
      out.write("                height: 2000px;\n");
      out.write("            }\n");
      out.write("            .headingDiv{\n");
      out.write("\n");
      out.write("                background-image: url(\"https://t4.ftcdn.net/jpg/01/13/65/71/360_F_113657105_Bktota7BzQ5cEUcZb4l0D4qSD2Sw08P2.jpg\");\n");
      out.write("                background-size: cover ;\n");
      out.write("                width: 97.5%;\n");
      out.write("                height: 15%;\n");
      out.write("                margin-left: 15px;\n");
      out.write("\n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("            #headingMessage{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 270px;\n");
      out.write("                left: 245px;\n");
      out.write("                font-family: 'Poppins medium';\n");
      out.write("                font-size: 55px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            hr{\n");
      out.write("\n");
      out.write("                position: absolute;\n");
      out.write("                margin-top: 16%;\n");
      out.write("                margin-left: 5%;\n");
      out.write("                border: 2px solid rgb(255, 255, 255);\n");
      out.write("                box-shadow: 1px 1px 1px 1px white;\n");
      out.write("                width: 47%;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                padding: 5px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                margin-top: 3%;\n");
      out.write("                width: 85%;\n");
      out.write("            }\n");
      out.write("            .one{\n");
      out.write("                font-family: 'Times New Roman', Times, serif; \n");
      out.write("            }\n");
      out.write("            .two{\n");
      out.write("                font-family: 'Times New Roman', Times, serif; ;\n");
      out.write("                text-align: center;\n");
      out.write("                display: block;\n");
      out.write("                width: 508px;\n");
      out.write("                padding: 1px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("            }\n");
      out.write("            .button{\n");
      out.write("                display: block;\n");
      out.write("                width: 30%;\n");
      out.write("                 margin: 22px auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mainDiv\">\n");
      out.write("            <div class=\"headingDiv\">\n");
      out.write("                <h1 id=\"headingMessage\">Welcome to The Best Gym Of Mysore</h1>\n");
      out.write("                <i class=\"fa-duotone fa-cars fa-bounce\"></i>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("            <<h3 align=\"center\" style=\"font-family: 'Poppins Light'; font-size: 20px\">Check out our various services and book now</h3>\n");
      out.write("            <table border=\"1\" align=\"center\" style=\"font-family: 'Poppins Light'; padding: 2px; border: 2px solid black;\">\n");
      out.write("                <tr style=\" background-color:  rgba(0, 6, 86, 0.885);color:white;\" id=\"row\">\n");
      out.write("                    <th>Package Name</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Duration</th>\n");
      out.write("                    <th>Fees(Monthly)</th>                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>NEWBIE</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>1 Months</td>\n");
      out.write("                        <td>Rs 500</td>    \n");
      out.write("                </tr>\n");
      out.write("                   <tr>\n");
      out.write("                   \n");
      out.write("                        <td>NOVICE</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>3 Months</td>\n");
      out.write("                        <td>Rs 700</td>    \n");
      out.write("                </tr>\n");
      out.write("                    <tr>\n");
      out.write("                   \n");
      out.write("                        <td>BEGINNER</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>6 Months</td>\n");
      out.write("                        <td>Rs 900</td>    \n");
      out.write("                </tr>\n");
      out.write("                    <tr>\n");
      out.write("                   \n");
      out.write("                        <td>ADVANCED BEGINNER</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>8 Months</td>\n");
      out.write("                        <td>Rs 1000</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>INTERMEDIATE</td>\n");
      out.write("                        <td>ADVANCED</td>\n");
      out.write("                        <td>12 Months</td>\n");
      out.write("                        <td>Rs 1200</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>ADVANCED</td>\n");
      out.write("                        <td>ADVANCED</td>\n");
      out.write("                        <td>18 Months</td>\n");
      out.write("                        <td>Rs 1500</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>PRO</td>\n");
      out.write("                        <td>ADVANCED</td>\n");
      out.write("                        <td>24 Months</td>\n");
      out.write("                        <td>Rs 1800</td>    \n");
      out.write("                </tr>\n");
      out.write("                <!--<tr>\n");
      out.write("                   \n");
      out.write("                        <td>The Newbie</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>6 Months</td>\n");
      out.write("                        <td>Rs 5000</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>The Newbie</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>6 Months</td>\n");
      out.write("                        <td>Rs 5000</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>The Newbie</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>6 Months</td>\n");
      out.write("                        <td>Rs 5000</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>The Newbie</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>6 Months</td>\n");
      out.write("                        <td>Rs 5000</td>    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                        <td>The Newbie</td>\n");
      out.write("                        <td>Beginners</td>\n");
      out.write("                        <td>6 Months</td>\n");
      out.write("                        <td>Rs 5000</td>    \n");
      out.write("                </tr> -->\n");
      out.write("                </tr>\n");
      out.write("            </table> <br><br>\n");
      out.write("            <center>\n");
      out.write("      <form action=\"packageSelected.jsp\">\n");
      out.write("      <div>\n");
      out.write("        <h1 class=\"one\">Register</h1>\n");
      out.write("        <p class=\"two\">Kindly fill in this form to register & join the gym</p>\n");
      out.write("        <p class=\"two\">You can pay the fees in gym</p>\n");
      out.write("        <label for=\"username\" class=\"two\"><b>Username</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Your Name\"  name=\"username\" class=\"two\"required /><br><br>\n");
      out.write("        \n");
      out.write("        <label for=\"email\" class=\"two\"><b>Email</b></label>\n");
      out.write("        <input type=\"text\"placeholder=\"Enter Email\"name=\"email\" class=\"two\"required/> <br><br>\n");
      out.write("        \n");
      out.write("        <label for=\"pwd\" class=\"two\"><b>Package Name</b></label>\n");
      out.write("        <input  type=\"text\" placeholder=\"Enter Package Name\" name=\"package\" class=\"two\"required /> <br>\n");
      out.write("\n");
      out.write("        <button type=\"submit\" class=\"button\">Register</button>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("                </center>\n");
      out.write("        </div>\n");
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
