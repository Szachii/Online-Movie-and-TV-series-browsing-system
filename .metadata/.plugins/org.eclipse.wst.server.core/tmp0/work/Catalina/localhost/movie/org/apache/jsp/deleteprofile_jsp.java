/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-14 07:53:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.AddUserModel;

public final class deleteprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("Model.AddUserModel");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 
    // Fetch the logged-in user's details from the session
    AddUserModel loggedInUser = (AddUserModel) session.getAttribute("loggedInUser");

    if (loggedInUser == null) {
        // If no user is logged in, redirect to login page
        response.sendRedirect("login.jsp");
        return;
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>ReelVibe - Delete Profile</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Global Styles */\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #1c1c1c;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            line-height: 1.6;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("        }\r\n");
      out.write("        a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #ff6f61;\r\n");
      out.write("        }\r\n");
      out.write("        a:hover {\r\n");
      out.write("            color: #e65c50;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Navigation Bar */\r\n");
      out.write("        .profile_nav {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            padding: 20px 5%;\r\n");
      out.write("            background-color: #2c2c2c;\r\n");
      out.write("        }\r\n");
      out.write("        .profile_nav h1 {\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            color: #ff6f61;\r\n");
      out.write("        }\r\n");
      out.write("        .profile_nav_list {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("        .profile_nav_list li {\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .profile_nav_list a {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("        .profile_nav_list a:hover {\r\n");
      out.write("            color: #ff6f61;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Form Content */\r\n");
      out.write("        .delete_profile_content {\r\n");
      out.write("            padding: 50px 5%;\r\n");
      out.write("            background-color: #121212;\r\n");
      out.write("            flex: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .delete_profile_form {\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .delete_profile_form h2 {\r\n");
      out.write("            color: #ff6f61;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form_group {\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form_group input {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            background-color: #444;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form_group button {\r\n");
      out.write("            background-color: #e74c3c;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form_group button:hover {\r\n");
      out.write("            background-color: #c0392b;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Footer */\r\n");
      out.write("        footer {\r\n");
      out.write("            background-color: #2c2c2c;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 20px 0;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            margin-top: auto;\r\n");
      out.write("        }\r\n");
      out.write("        footer p {\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Navigation Bar -->\r\n");
      out.write("    <nav class=\"profile_nav\">\r\n");
      out.write("        <h1>ReelVibe</h1>\r\n");
      out.write("        <ul class=\"profile_nav_list\">\r\n");
      out.write("            <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">Movies</a></li>\r\n");
      out.write("            <li><a href=\"#\">TV Series</a></li>\r\n");
      out.write("            <li><a href=\"#\">Top Rated</a></li>\r\n");
      out.write("            <li><a href=\"watchlist.jsp\">Watchlist</a></li>\r\n");
      out.write("            <li><button class=\"logout_button\" onclick=\"window.location.href='");
      out.print(request.getContextPath());
      out.write("/LogoutServlet'\">Logout</button></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Delete Profile Content -->\r\n");
      out.write("    <div class=\"delete_profile_content\">\r\n");
      out.write("        <form class=\"delete_profile_form\" action=\"DeleteUserServlet\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("            <h2>Delete Profile</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form_group\">\r\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form_group\">\r\n");
      out.write("                <button type=\"submit\">Delete</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>&copy; 2024 ReelVibe - Your Movie & TV Series Destination</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}