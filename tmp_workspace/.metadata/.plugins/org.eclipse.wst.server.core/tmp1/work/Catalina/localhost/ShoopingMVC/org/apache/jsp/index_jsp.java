/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-06-03 09:21:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1715843364991L));
    _jspx_dependants.put("/nav.jsp", Long.valueOf(1717406467347L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1715843361433L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("* {margin: 0; padding: 0; list-style:none; text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("html, body {width:100%; height:100%}\r\n");
      out.write("\r\n");
      out.write("header {width:100%; height: 100px; position:relative;\r\n");
      out.write("		background: #0000ff; color:#ffffff; \r\n");
      out.write("		text-align: center; line-height: 100px;}\r\n");
      out.write("\r\n");
      out.write("nav 	{width:100%; height: 50px; position:relative;\r\n");
      out.write("		background: lightgray; color:black; \r\n");
      out.write("		line-height: 50px;	}\r\n");
      out.write("		\r\n");
      out.write("nav ul {display: flex;}\r\n");
      out.write("\r\n");
      out.write("nav li {margin:0px 3.5%; line-height: 50px;}\r\n");
      out.write("			 \r\n");
      out.write("section { width: 100%; height: calc(100% - 200px); }\r\n");
      out.write("\r\n");
      out.write("footer {width:100%; height: 50px;\r\n");
      out.write("		background: #0000ff; color:#ffffff; \r\n");
      out.write("		text-align: center; line-height: 50px;}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<h1>쇼핑몰 회원관리 ver1.0</h1>\r\n");
      out.write("	</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("* {margin: 0; padding: 0; list-style:none; text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("html, body {width:100%; height:100%}\r\n");
      out.write("\r\n");
      out.write("header {width:100%; height: 100px; position:relative;\r\n");
      out.write("		background: #0000ff; color:#ffffff; \r\n");
      out.write("		text-align: center; line-height: 100px;}\r\n");
      out.write("\r\n");
      out.write("nav 	{width:100%; height: 50px; position:relative;\r\n");
      out.write("		background: lightgray; color:black; \r\n");
      out.write("		line-height: 50px;	}\r\n");
      out.write("		\r\n");
      out.write("nav ul {display: flex;}\r\n");
      out.write("\r\n");
      out.write("nav li {margin:0px 3.5%; line-height: 50px;}\r\n");
      out.write("			 \r\n");
      out.write("section { width: 100%; height: calc(100% - 200px); }\r\n");
      out.write("\r\n");
      out.write("footer {width:100%; height: 50px;\r\n");
      out.write("		background: #0000ff; color:#ffffff; \r\n");
      out.write("		text-align: center; line-height: 50px;}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li><a href=\"Register\">회원등록</a></li>\r\n");
      out.write("			<li><a href=\"GetMember\">회원목록조회</a></li>\r\n");
      out.write("			<li><a href=\"Money\">회원매출조회</a></li>\r\n");
      out.write("			<li><a href=\"NewFile.jsp\">홈으로</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("	<h3>쇼핑몰 회원관리 프로그램</h3>\r\n");
      out.write("	<p>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</p>\r\n");
      out.write("	<p>프로그램 작성 순서</p>\r\n");
      out.write("	<p>1. 회원정보 테이블을 생성한다.<br>\r\n");
      out.write("	2. 매출정보 테이블을 생성한다.<br>\r\n");
      out.write("	3. 회원정보, 매출정보 테이블에 제시된 문제지와 참조데이터를 추가 생성합니다.<br>\r\n");
      out.write("	4. 회원정보 입력 화면프로그램을 작성한다.<br>\r\n");
      out.write("	5. 회원정보 조회 프로그램을 작성한다.<br>\r\n");
      out.write("	6. 회원매출정보 조회 프로그램을 작성한다.</p>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("* {margin: 0; padding: 0; list-style:none; text-decoration: none;}\r\n");
      out.write("\r\n");
      out.write("html, body {width:100%; height:100%}\r\n");
      out.write("\r\n");
      out.write("header {width:100%; height: 100px; position:relative;\r\n");
      out.write("		background: #0000ff; color:#ffffff; \r\n");
      out.write("		text-align: center; line-height: 100px;}\r\n");
      out.write("\r\n");
      out.write("nav 	{width:100%; height: 50px; position:relative;\r\n");
      out.write("		background: lightgray; color:black; \r\n");
      out.write("		line-height: 50px;	}\r\n");
      out.write("		\r\n");
      out.write("nav ul {display: flex;}\r\n");
      out.write("\r\n");
      out.write("nav li {margin:0px 3.5%; line-height: 50px;}\r\n");
      out.write("			 \r\n");
      out.write("section { width: 100%; height: calc(100% - 200px); }\r\n");
      out.write("\r\n");
      out.write("footer {width:100%; height: 50px;\r\n");
      out.write("		background: #0000ff; color:#ffffff; \r\n");
      out.write("		text-align: center; line-height: 50px;}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<footer>\r\n");
      out.write("	<p>HRDKorea copyright &copy; 2016 All right reserved. Human Resources Development Service of Korea</p>\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
