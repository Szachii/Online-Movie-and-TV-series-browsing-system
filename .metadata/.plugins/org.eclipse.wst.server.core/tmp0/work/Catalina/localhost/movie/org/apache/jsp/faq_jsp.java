/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-15 02:02:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/tharu/Desktop/OOP%20CRUD%201.1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/movie/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1727111026837L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>ReelVibe - FAQ</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("            background-color: #121212;\r\n");
      out.write("            color: #e0e0e0;\r\n");
      out.write("            line-height: 1.6;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            padding: 20px 5%;\r\n");
      out.write("            background-color: #1f1f1f;\r\n");
      out.write("            position: sticky;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            z-index: 100;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav h1 {\r\n");
      out.write("            font-size: 32px;\r\n");
      out.write("            color: #00e6e6;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav ul {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav ul li {\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav ul a {\r\n");
      out.write("            color: #e0e0e0;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            transition: color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav ul a:hover {\r\n");
      out.write("            color: #00e6e6;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .faq_content {\r\n");
      out.write("            padding: 60px 5%;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            background-color: #1e1e1e;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin: 50px auto;\r\n");
      out.write("            width: 80%;\r\n");
      out.write("            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .faq_content h2 {\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #e8e9e9;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .accordion {\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            background-color: #252525;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            transition: max-height 0.4s ease;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .accordion-header {\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            color: #00e6e6;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .accordion-header:hover {\r\n");
      out.write("            background-color: #00e6e6;\r\n");
      out.write("            color: #1e1e1e;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .accordion-content {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #2a2a2a;\r\n");
      out.write("            color: #ccc;\r\n");
      out.write("            display: none;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            line-height: 1.8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .active .accordion-content {\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            background-color: #1f1f1f;\r\n");
      out.write("            padding: 20px 0;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #e0e0e0;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer p {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Navigation -->\r\n");
      out.write("    <nav>\r\n");
      out.write("        <h1>ReelVibe</h1>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">Trending</a></li>\r\n");
      out.write("            <li><a href=\"#\">Movies</a></li>\r\n");
      out.write("            <li><a href=\"#\">TV Series</a></li>\r\n");
      out.write("            <li><a href=\"#\">Top Rated</a></li>\r\n");
      out.write("            <li><a href=\"#\">Genres</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"login.jsp\">LOGIN</a></li>\r\n");
      out.write("            <li>|</li>\r\n");
      out.write("            <li><a href=\"register.jsp\">REGISTER</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- FAQ Content -->\r\n");
      out.write("    <div class=\"faq_content\">\r\n");
      out.write("        <h2>Frequently Asked Questions</h2>\r\n");
      out.write("\r\n");
      out.write("        <!-- Display each FAQ dynamically using JSTL -->\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>&copy; 2024 ReelVibe - Your Movie & TV Series Destination</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        const accordions = document.querySelectorAll('.accordion-header');\r\n");
      out.write("        \r\n");
      out.write("        accordions.forEach(accordion => {\r\n");
      out.write("            accordion.addEventListener('click', () => {\r\n");
      out.write("                const parent = accordion.parentElement;\r\n");
      out.write("                parent.classList.toggle('active');\r\n");
      out.write("                \r\n");
      out.write("                const content = parent.querySelector('.accordion-content');\r\n");
      out.write("                if (parent.classList.contains('active')) {\r\n");
      out.write("                    content.style.display = 'block';\r\n");
      out.write("                } else {\r\n");
      out.write("                    content.style.display = 'none';\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /faq.jsp(153,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("faq");
      // /faq.jsp(153,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/faq.jsp(153,8) '${faqList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${faqList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("            <div class=\"accordion\">\r\n");
            out.write("                <div class=\"accordion-header\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faq.question}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("                <div class=\"accordion-content\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${faq.answer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("            </div>\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}