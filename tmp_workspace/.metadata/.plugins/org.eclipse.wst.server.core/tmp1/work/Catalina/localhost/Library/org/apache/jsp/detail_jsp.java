/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-06-19 13:35:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import vo.MemberVO;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1718011366784L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1718269906943L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("vo.MemberVO");
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
MemberVO vo = (MemberVO)request.getAttribute("vo"); 
	System.out.println(vo.getStat_fg());

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
      out.write("*{\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("header, nav, footer, header>a{\r\n");
      out.write("color: #fff;\r\n");
      out.write("}\r\n");
      out.write("	header {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		background-color: blue;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("		align-items: center; \r\n");
      out.write("		height: 100px;\r\n");
      out.write("	}\r\n");
      out.write("	nav{\r\n");
      out.write("		display: flex;\r\n");
      out.write("		gap: 30px;\r\n");
      out.write("		height: 80px;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("		background-color: #b9b9fa;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<h2>도서대여관리 ver 1.0</h2>\r\n");
      out.write("	</header>\r\n");
      out.write("	<nav>\r\n");
      out.write("		<a href=\"register.jsp\">대여도서등록</a>\r\n");
      out.write("		<a href=\"Member\">회원정보관리</a>\r\n");
      out.write("		<a href=\"\">보유도서관리</a>\r\n");
      out.write("		<a href=\"\">도서대여현황</a>\r\n");
      out.write("		<a href=\"\">홈으로</a>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<form action=\"DetailCtrl\">\r\n");
      out.write("	<table>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>회원번호</td>\r\n");
      out.write("			<td><input name=\"cust_no\" readonly=\"readonly\" value=");
      out.print(vo.getCust_no() );
      out.write("></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>회원성명</td>\r\n");
      out.write("			<td><input name=\"cust_name\" value=");
      out.print(vo.getCust_name() );
      out.write("></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>핸드폰번호</td>\r\n");
      out.write("			<td><input name=\"phone\" value=");
      out.print(vo.getPhone() );
      out.write("></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>주소</td>\r\n");
      out.write("			<td><input name=\"address\" value=");
      out.print(vo.getAddress() );
      out.write("></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>가입일자</td>\r\n");
      out.write("			<td><input name=\"join_date\" disabled=\"disabled\" value=");
      out.print(vo.getJoindate() );
      out.write("></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>상태구분</td>\r\n");
      out.write("			<td>\r\n");
      out.write("				<select name=\"stat_fg\">\r\n");
      out.write("				");
switch(vo.getStat_fg()){ 
					case "0" :
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("					<option value=\"0\" selected>정상</option>\r\n");
      out.write("					<option value=\"1\">휴면</option>\r\n");
      out.write("					<option value=\"2\">탈퇴</option>\r\n");
      out.write("				");
 	break;
					case "1" :
				
      out.write("\r\n");
      out.write("					<option value=\"0\">정상</option>\r\n");
      out.write("					<option value=\"1\" selected>휴면</option>\r\n");
      out.write("					<option value=\"2\">탈퇴</option>\r\n");
      out.write("				");
 	break;
					case "2" :
				
      out.write("\r\n");
      out.write("					<option value=\"0\">정상</option>\r\n");
      out.write("					<option value=\"1\">휴면</option>\r\n");
      out.write("					<option value=\"2\" selected>탈퇴</option>\r\n");
      out.write("				");

					break;
				} 
      out.write("\r\n");
      out.write("				</select>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td><button>등록</button><button>조회</button></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
