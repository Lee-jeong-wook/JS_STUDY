/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-04-04 09:05:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class getBoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//request 인코딩
	request.setCharacterEncoding("UTF-8");
	if(session.getAttribute("ID") == null){
		response.sendRedirect("login.jsp");
	}
	//화면의 검색 조건을 가져오기
	String searchCondition = request.getParameter("searchCondition");
	String searchKeyword = request.getParameter("searchKeyword");
	
	//만약에 처음 화면으로 들어오는 경우에는 사람이 검색조건을 입력하지 않으므로 빈문자가 넘어옴
	if(searchCondition == null)
		searchCondition = "TITLE";
	//1. 드라이버 로드
	Class.forName("oracle.jdbc.OracleDriver");
	//2. 연결설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "hr", "1234");
	//3. 질의문 준비
	String sql = "select * from board ";
	if(searchCondition.equals("TITLE")){
		sql += "where title like '%'||?||'%'"; //물음표가 ''에 있으면 문자에 해당하고 sql 세팅을 하시 위한 ?가 되지 않는다
	} else{
		sql = "where content like '%'||?||'%'"; 
	}
	PreparedStatement stmt = conn.prepareStatement(sql);
	
	stmt.setString(1, searchKeyword);
	ResultSet rs = stmt.executeQuery();
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css\">\r\n");
      out.write("<title>글 목록</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div align=\"center\" style=\"margin: auto auto\">\r\n");
      out.write("		<h1>글 목록</h1>\r\n");
      out.write("		<h3>\r\n");
      out.write("			");
      out.print(session.getAttribute("name") );
      out.write("님 환영합니다...... <a href=\"logoutCtrl.jsp\">Log-out</a>\r\n");
      out.write("		</h3>\r\n");
      out.write("\r\n");
      out.write("		<!-- 검색 시작 -->\r\n");
      out.write("		<form method=\"post\">\r\n");
      out.write("			<table class=\"table\" style=\"width: 800px\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"right\">\r\n");
      out.write("					<select name=\"searchCondition\">\r\n");
      out.write("							<option value=\"TITLE\">제목\r\n");
      out.write("							<option value=\"CONTENT\">내용\r\n");
      out.write("					</select>\r\n");
      out.write("					<input name=\"searchKeyword\" type=\"text\" />\r\n");
      out.write("					<input type=\"submit\" value=\"검색\" /></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("		<!-- 검색 종료 -->\r\n");
      out.write("\r\n");
      out.write("		<table class=\"table\" style=\"width: 800px\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th width=\"100\">번호</th>\r\n");
      out.write("				<th width=\"200\">제목</th>\r\n");
      out.write("				<th width=\"150\">작성자</th>\r\n");
      out.write("				<th width=\"150\">등록일</th>\r\n");
      out.write("				<th width=\"100\">조회수</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
 
			while(rs.next()){ 
			
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td> <a href=\"getBoard.jsp?seq=");
      out.print( rs.getString("seq") );
      out.write('"');
      out.write('>');
      out.print( rs.getString("seq") );
      out.write("</a></td>\r\n");
      out.write("				<td> ");
      out.print( rs.getString("title") );
      out.write("</td>\r\n");
      out.write("				<td> ");
      out.print( rs.getString("nickname") );
      out.write("</td>\r\n");
      out.write("				<td> ");
      out.print( rs.getDate("regdate") );
      out.write("</td>\r\n");
      out.write("				<td> ");
      out.print( rs.getString("cnt") );
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
} 
			
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		<br> <a href=\"addBoard.jsp\">새글 등록</a>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
