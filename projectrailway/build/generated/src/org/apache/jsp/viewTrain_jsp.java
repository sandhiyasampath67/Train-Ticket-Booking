package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;

public final class viewTrain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("  <title> View Trains</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>\n");
      out.write("  <link href=\"//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("    <body style=\"background-color:#C75089;\">\n");
      out.write("    \n");
      out.write("<div style=\"float: right;margin-right: 300px;\">\n");
      out.write("\t\t\t<div class=\"del\">\n");
      out.write("\t\t\t  <h1>View Train</h1>\n");
      out.write("\t\t\t \n");
      out.write("\t    <table class=\"table table-hover\" style=\"margin-top: 350px;\">\n");
      out.write("\t        <thead>\n");
      out.write("\t            <tr>\n");
      out.write("\t            \t<th><b>TrainNO</b></th>\n");
      out.write("\t                <th><b>TrainName</b></th>\n");
      out.write("                        <th><b>Source</b></th>\n");
      out.write("                        <th><b>Destination</b></th>\n");
      out.write("                        <th><b>Availability</b></th>\n");
      out.write("\t                <th><b>Fare</b></th>\n");
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
	                String query="select * from admintrain";
	                ResultSet rs = null;
	                rs = stmt.executeQuery(query);
	                while(rs.next()){
	            
      out.write("\n");
      out.write("\t            <tr>\n");
      out.write("\t                ");

	                    String no = rs.getString("Trainno");
	                    String name= rs.getString("Trainname");
                            String source = rs.getString("source");
	                    String desti = rs.getString("Destination");
	                    String Availability = rs.getString("Avalaibility");
	                    String fare = rs.getString("Fare");
	                
	                
      out.write("\n");
      out.write("\t                <td>");
      out.print(no );
      out.write("</td>\n");
      out.write("\t                <td>");
      out.print(name );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(source );
      out.write("</td>\n");
      out.write("\t                <td>");
      out.print(desti );
      out.write("</td>\n");
      out.write("\t                <td>");
      out.print(Availability );
      out.write("</td>\n");
      out.write("\t                <td>");
      out.print(fare );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("\t            </tr>               \n");
      out.write("\n");
      out.write("\t            ");
      
	                }
	            
      out.write("\n");
      out.write("\n");
      out.write("\t        </tbody>\n");
      out.write("\t    </table>\n");
      out.write("    </div>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t</div>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("   \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <style>\n");
      out.write("      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */\n");
      out.write("body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset, input, textarea, p, blockquote, th, td { \n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("  background: url(\"Images/screen 2.jpg\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("body,\n");
      out.write("input,\n");
      out.write("textarea,\n");
      out.write("select {\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: white;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  font-size: 32px;\n");
      out.write("  font-weight: 300;\n");
      out.write("  color: #4c4c4c;\n");
      out.write("  text-align: center;\n");
      out.write("  padding-top: 9px;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testbox1, .testbox2, .testbox3 {\n");
      out.write("  /*margin: 20px auto;*/\n");
      out.write("  width: 300px; \n");
      out.write("  /*height: 330px;*/ \n");
      out.write("  -webkit-border-radius: 8px/7px; \n");
      out.write("  -moz-border-radius: 8px/7px; \n");
      out.write("  border-radius: 8px/7px; \n");
      out.write("  background-color: #ebebeb; \n");
      out.write("  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n");
      out.write("  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n");
      out.write("  box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n");
      out.write("  border: solid 1px red;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testbox1{\n");
      out.write("\theight: 330px; \n");
      out.write("}\n");
      out.write(".testbox2{\n");
      out.write("\theight: 290px; \n");
      out.write("}\n");
      out.write(".testbox3{\n");
      out.write("\theight: 185px; \n");
      out.write("}\n");
      out.write("form{\n");
      out.write("  margin: 0 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text],input[type=password]{\n");
      out.write("  width: 200px; \n");
      out.write("  height: 39px; \n");
      out.write("  -webkit-border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; \n");
      out.write("  -moz-border-radius: 0px 4px 4px 0px/0px 0px 4px 4px; \n");
      out.write("  border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; \n");
      out.write("  background-color: #fff; \n");
      out.write("  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n");
      out.write("  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n");
      out.write("  box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n");
      out.write("  border: solid 1px #cbc9c9;\n");
      out.write("  margin-left: -5px;\n");
      out.write("  margin-top: 13px; \n");
      out.write("  padding-left: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=password]{\n");
      out.write("  margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</html>");
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
