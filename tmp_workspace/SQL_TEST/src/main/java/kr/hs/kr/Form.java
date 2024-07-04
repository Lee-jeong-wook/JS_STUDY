package kr.hs.kr;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Servlet implementation class Form
 */
@WebServlet("/a01Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		//js에서는 id, jsp는 name
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String baseball = request.getParameter("baseball");
		String[] four = request.getParameterValues("four");
		String[] five = request.getParameterValues("five");
		System.out.println(name);
		System.out.println(id);
		System.out.println(password);
		System.out.println(baseball);
		System.out.println(Arrays.toString(four));
		System.out.println(Arrays.toString(five));
		
		//풀력을 브라우저로 만들기
		//한글
		response.setContentType("text/html charset='UTF-8'");
		//출력 스트림
		PrintWriter out = response.getWriter();
		//출력
		out.print("<html><head><title>확인</title></head>");
		out.print("<body>");
		out.print("<h3>이름" + name + "</h3>");
		out.print("<h3>아이디" + id + "</h3>");
		out.print("<h3>비번" + password + "</h3>");
		out.print("<h3>야구" + baseball + "</h3>");
		for(String bn : four)
			out.print("<h3>4강" + bn + "</h3>");
		for(String bn : five)
			out.print("<h3>4강1팀" + bn + "</h3>");
		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
