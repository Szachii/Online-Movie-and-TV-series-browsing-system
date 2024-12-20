/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-14 02:49:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Model.CommentModel;
import Model.AddUserModel;
import Model.MovieModel;

public final class comment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("Model.CommentModel");
    _jspx_imports_classes.add("Model.MovieModel");
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

      out.write('\r');
      out.write('\n');


// Fetch the list of comments for the movie
List<CommentModel> comments = (List<CommentModel>) request.getAttribute("comments");

      out.write('\r');
      out.write('\n');

    // Fetch the logged-in user's details from the session
    AddUserModel loggedInUser = (AddUserModel) session.getAttribute("loggedInUser");

    if (loggedInUser == null) {
        // If no user is logged in, redirect to the login page
        response.sendRedirect("login.jsp");
        return;
    }

    // Retrieve the movie details from the request
    MovieModel movie = (MovieModel) request.getAttribute("movie");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>ReelVibe - Comments</title>\r\n");
      out.write("<style>\r\n");
      out.write("/* Add your CSS styles */\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("	background-color: #007bff;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: none;\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("	background-color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>\r\n");
      out.write("		Comments for\r\n");
      out.write("		");
      out.print(request.getParameter("movieName"));
      out.write("</h2>\r\n");
      out.write("\r\n");
      out.write("	");

	if (comments != null && !comments.isEmpty()) {
	
      out.write("\r\n");
      out.write("	<ul>\r\n");
      out.write("		");

		for (CommentModel comment : comments) {
		
      out.write("\r\n");
      out.write("		<li><strong>User ID ");
      out.print(comment.getUserId());
      out.write(":\r\n");
      out.write("		</strong> ");
      out.print(comment.getComment());
      out.write(' ');

 if (loggedInUser != null && loggedInUser.getUsername() == comment.getUserId()) {
 
      out.write("\r\n");
      out.write("			<!-- Show Edit and Delete options for the logged-in user's comments -->\r\n");
      out.write("			<form action=\"EditCommentServlet\" method=\"post\"\r\n");
      out.write("				style=\"display: inline;\">\r\n");
      out.write("				<input type=\"hidden\" name=\"commentId\"\r\n");
      out.write("					value=\"");
      out.print(comment.getCommentId());
      out.write("\">\r\n");
      out.write("				<button type=\"submit\">Edit</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			<form action=\"DeleteCommentServlet\" method=\"post\"\r\n");
      out.write("				style=\"display: inline;\">\r\n");
      out.write("				<input type=\"hidden\" name=\"commentId\"\r\n");
      out.write("					value=\"");
      out.print(comment.getCommentId());
      out.write("\">\r\n");
      out.write("				<button type=\"submit\">Delete</button>\r\n");
      out.write("			</form> ");

 }
 
      out.write("</li>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("	</ul>\r\n");
      out.write("	");

	} else {
	
      out.write("\r\n");
      out.write("	<p>No comments yet.</p>\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	if (loggedInUser != null) {
	
      out.write("\r\n");
      out.write("	<h3>Add a Comment</h3>\r\n");
      out.write("\r\n");
      out.write("	<form action=\"AddCommentServlet\" method=\"post\">\r\n");
      out.write("		<textarea name=\"comment\" placeholder=\"Enter your comment here...\" required></textarea>\r\n");
      out.write("		<input type=\"hidden\" name=\"movieName\" value=\"");
      out.print(movie.getTitle());
      out.write("\">\r\n");
      out.write("		<button type=\"submit\">Enter Comment</button>\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("	");

	} else {
	
      out.write("\r\n");
      out.write("	<p>You need to log in to comment.</p>\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
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
