/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-15 01:59:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Admin Page - ReelVibe</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Global Styling */\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            font-family: 'Roboto', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: #f0f3f5;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header {\r\n");
      out.write("            background-color: #1f2937;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .system-name {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 20px;\r\n");
      out.write("            transform: translateY(-50%);\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            color: #FF6F61;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header h1 {\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            font-size: 26px;\r\n");
      out.write("            letter-spacing: 2px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav a {\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            margin: 0 15px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            transition: color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav a:hover {\r\n");
      out.write("            color: #ff6f61;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Main Container */\r\n");
      out.write("        main {\r\n");
      out.write("            max-width: 1200px;\r\n");
      out.write("            margin: 50px auto;\r\n");
      out.write("            padding: 0 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #374785;\r\n");
      out.write("            font-size: 2.5em;\r\n");
      out.write("            margin-bottom: 40px;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            letter-spacing: 1px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-container {\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            border-radius: 12px;\r\n");
      out.write("            box-shadow: 0 8px 24px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-section {\r\n");
      out.write("            margin-bottom: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-section h3 {\r\n");
      out.write("            font-size: 1.75em;\r\n");
      out.write("            color: #374785;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            padding-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-section h3::after {\r\n");
      out.write("            content: \"\";\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 3px;\r\n");
      out.write("            background-color: #ff6f61;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-section button {\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            background-color: #FF6F61;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            transition: background-color 0.3s, transform 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-section button:hover {\r\n");
      out.write("            background-color: #e65550;\r\n");
      out.write("            transform: translateY(-2px);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Forms Styling */\r\n");
      out.write("        .admin-form {\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-form label {\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            margin-bottom: 8px;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-form input,\r\n");
      out.write("        .admin-form textarea {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            transition: border 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-form input:focus,\r\n");
      out.write("        .admin-form textarea:focus {\r\n");
      out.write("            border-color: #FF6F61;\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-form button {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px;\r\n");
      out.write("            background-color: #374785;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s, transform 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .admin-form button:hover {\r\n");
      out.write("            background-color: #2c3e50;\r\n");
      out.write("            transform: translateY(-2px);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #1f2937;\r\n");
      out.write("            color: white;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Smooth show/hide transitions */\r\n");
      out.write("        .form-container {\r\n");
      out.write("            display: none;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            transition: opacity 0.3s ease-in-out;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-container.show {\r\n");
      out.write("            display: block;\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Responsive design */\r\n");
      out.write("        @media (max-width: 768px) {\r\n");
      out.write("            .admin-section button {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav a {\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h2 {\r\n");
      out.write("                font-size: 2em;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"system-name\">ReelVibe</div>\r\n");
      out.write("        <h1>Admin Dashboard</h1>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <a href=\"home.html\">Home</a>\r\n");
      out.write("            <a href=\"admin.html\">Admin Page</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("        <section class=\"admin-container\">\r\n");
      out.write("            <h2>Admin Panel</h2>\r\n");
      out.write("\r\n");
      out.write("            <!-- Manage Movies Section -->\r\n");
      out.write("            <div class=\"admin-section\">\r\n");
      out.write("                <h3>Manage Movies</h3>\r\n");
      out.write("                <button onclick=\"toggleForm('add-movie-form')\">Add Movie</button>\r\n");
      out.write("                <button onclick=\"toggleForm('update-movie-form')\">Update Movie</button>\r\n");
      out.write("                <button onclick=\"toggleForm('delete-movie-form')\">Delete Movie</button>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"add-movie-form\" class=\"form-container\">\r\n");
      out.write("                    <h4>Add New Movie</h4>\r\n");
      out.write("                    <form class=\"admin-form\">\r\n");
      out.write("                        <label for=\"movie-title\">Title:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"movie-title\" required>\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"movie-genre\">Genre:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"movie-genre\" required>\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"movie-year\">Release Year:</label>\r\n");
      out.write("                        <input type=\"number\" id=\"movie-year\" required>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\">Submit</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"update-movie-form\" class=\"form-container\">\r\n");
      out.write("                    <h4>Update Movie</h4>\r\n");
      out.write("                    <form class=\"admin-form\">\r\n");
      out.write("                        <label for=\"movie-id-update\">Movie ID:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"movie-id-update\" required>\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"movie-title-update\">Title:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"movie-title-update\">\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"movie-genre-update\">Genre:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"movie-genre-update\">\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"movie-year-update\">Release Year:</label>\r\n");
      out.write("                        <input type=\"number\" id=\"movie-year-update\">\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\">Submit</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"delete-movie-form\" class=\"form-container\">\r\n");
      out.write("                    <h4>Delete Movie</h4>\r\n");
      out.write("                    <form class=\"admin-form\">\r\n");
      out.write("                        <label for=\"movie-id-delete\">Movie ID:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"movie-id-delete\" required>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\">Delete</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Manage FAQs Section -->\r\n");
      out.write("            <div class=\"admin-section\">\r\n");
      out.write("                <h3>Manage FAQs</h3>\r\n");
      out.write("                <button onclick=\"toggleForm('add-faq-form')\">Add Question</button>\r\n");
      out.write("                <button onclick=\"toggleForm('edit-faq-form')\">Edit Question</button>\r\n");
      out.write("                <button onclick=\"toggleForm('delete-faq-form')\">Delete Question</button>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"add-faq-form\" class=\"form-container\">\r\n");
      out.write("                    <h4>Add New Question</h4>\r\n");
      out.write("                    <form class=\"admin-form\" method=\"post\" action=\"AddQA\">\r\n");
      out.write("                        <label for=\"faq-id-add\">FAQ ID:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"faq-id-add\" name=\"id\" required>\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"faq-question\">Question:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"faq-question\" name=\"que\"  required>\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"faq-answer\">Answer:</label>\r\n");
      out.write("                        <textarea id=\"faq-answer\" rows=\"5\"  name=\"ans\" required></textarea>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\">Submit</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"edit-faq-form\" class=\"form-container\">\r\n");
      out.write("                    <h4>Edit Question</h4>\r\n");
      out.write("                    <form class=\"admin-form\"  method=\"post\" action=\"UpdateQA\">\r\n");
      out.write("                        <label for=\"faq-id-edit\">FAQ ID:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"faq-id-edit\" name=\"id\" required>\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"faq-question-edit\">New Question:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"faq-question-edit\" name=\"newque\">\r\n");
      out.write("\r\n");
      out.write("                        <label for=\"faq-answer-edit\">New Answer:</label>\r\n");
      out.write("                        <textarea id=\"faq-answer-edit\" rows=\"5\" name=\"newans\"></textarea>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\">Submit</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"delete-faq-form\" class=\"form-container\">\r\n");
      out.write("                    <h4>Delete Question</h4>\r\n");
      out.write("                    <form class=\"admin-form\" method=\"post\" action=\"DeleteQA\">\r\n");
      out.write("                        <label for=\"faq-id-delete\">FAQ ID:</label>\r\n");
      out.write("                        <input type=\"text\" id=\"faq-id-delete\" name=\"id\" required>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\">Delete</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>&copy; 2024 ReelVibe. All rights reserved.</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function toggleForm(formId) {\r\n");
      out.write("            const forms = document.querySelectorAll('.form-container');\r\n");
      out.write("            forms.forEach(form => form.classList.remove('show'));\r\n");
      out.write("\r\n");
      out.write("            const selectedForm = document.getElementById(formId);\r\n");
      out.write("            selectedForm.classList.add('show');\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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