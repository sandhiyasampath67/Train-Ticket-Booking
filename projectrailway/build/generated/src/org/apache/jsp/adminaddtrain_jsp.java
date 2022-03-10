package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;

public final class adminaddtrain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-top: 6px;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h3><b>ADD TRAINS</b></h3>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form action=\"adminadd\" method=\"POST\">\n");
      out.write("    <label for=\"tno\">Train Number</label>\n");
      out.write("    <input type=\"text\" id=\"Trainno\" name=\"Trainno\" placeholder=\"Train Number....\">\n");
      out.write("\n");
      out.write("    <label for=\"tname\">Train Name</label>\n");
      out.write("    <input type=\"text\" id=\"Trainname\" name=\"Trainname\" placeholder=\"Train Name..\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      <label for=\"source\">Source</label>\n");
      out.write("    <input type=\"text\" id=\"source\" name=\"source\" placeholder=\"source..\">\n");
      out.write("    \n");
      out.write("      <label for=\"Destination\">Destination</label>\n");
      out.write("    <input type=\"text\" id=\"Destination\" name=\"Destination\" placeholder=\"Destination..\">\n");
      out.write("    \n");
      out.write("      <label for=\"Availability\">Availability</label>\n");
      out.write("    <input type=\"text\" id=\"Availability\" name=\"Availability\" placeholder=\"Available?..\">\n");
      out.write("    \n");
      out.write("    <label for=\"Fare\">Fare</label>\n");
      out.write("    <input type=\"text\" id=\"Fare\" name=\"Fare\" placeholder=\"Fare..\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("    <div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <br />\n");
      out.write("\t        \t<br />\n");
      out.write("\t    <table class=\"table table-hover\" style=\"margin-top: 350px;\">\n");
      out.write("\t        <thead>\n");
      out.write("\t            <tr>\n");
      out.write("\t            \t<th><b>TRAIN NO</b></th>\n");
      out.write("\t                <th><b>TRAIN NAME</b></th>\n");
      out.write("                        <th><b>SOURCE</b></th>\n");
      out.write("                        <th><b>DESTINATION</b></th>\n");
      out.write("                        <th><b>AVAILABILITY</b></th>\n");
      out.write("\t                <th><b>FARE</b></th>\n");
      out.write("\t            </tr>\n");
      out.write("\t        </thead>\n");
      out.write("\t        <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t            ");

	                Class.forName("com.mysql.jdbc.Driver");
	                Connection conn = null;
	                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "san100");
	                Statement stmt = null;
	                stmt = conn.createStatement();
	                String query = " insert into admintrain(Trainno, Trainname, source, Destination,Availability,Fare)" + " values (?, ?, ?, ?,?,?);";
	                ResultSet rs = null;
	                rs = stmt.executeQuery(query);
	                while(rs.next()){
	            
      out.write("\n");
      out.write("\t            <tr>\n");
      out.write("\t                ");

	                    String no=rs.getString("Trainno");
	                    String name = rs.getString("Trainname");
	                    String fare = rs.getString("Fare");
	                
	                
      out.write("\n");
      out.write("\t                <td>");
      out.print(no);
      out.write("</td>\n");
      out.write("\t                <td>");
      out.print(name );
      out.write("</td>\n");
      out.write("\t                <td>");
      out.print(fare );
      out.write("</td>\n");
      out.write("\t            </tr>               \n");
      out.write("\n");
      out.write("\t            ");
      
	                }
	            
      out.write("\n");
      out.write("\n");
      out.write("\t        </tbody>\n");
      out.write("\t    </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </form>\n");
      out.write("</div>\n");
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
