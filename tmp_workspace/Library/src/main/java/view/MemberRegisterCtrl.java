package view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

import java.io.IOException;
import java.sql.Date;

import dao.MemberDAO;

/**
 * Servlet implementation class MemberRegisterCtrl
 */
public class MemberRegisterCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberRegisterCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberVO vo = new MemberVO();
		vo.setCust_no(Integer.parseInt(request.getParameter("cust_no")));
		vo.setCust_name(request.getParameter("cust_name"));
		vo.setAddress(request.getParameter("address"));
		vo.setJoindate(Date.valueOf(request.getParameter("join_date")));
		vo.setPhone(request.getParameter("phone"));
		vo.setStat_fg(request.getParameter("stat_fg"));
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(vo);
		
		response.sendRedirect("Member");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
