package view;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.ReturnVO;

import java.io.IOException;
import java.sql.Date;

import dao.RentDAO;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("rent_rent"));
		ReturnVO vo = new ReturnVO();
		vo.setRent_book(request.getParameter("rent_book"));
		vo.setRent_rent(Integer.parseInt(request.getParameter("rent_rent")));
		vo.setReturn_fg("0");
//		vo.setRent_ymd(Date.valueOf(request.getParameter("rent_ymd")));
//		vo.setClose_ymd(Date.valueOf(request.getParameter("rent_ymd") + 7));
		RentDAO dao = new RentDAO();
		int result = dao.register(vo);
		
		response.sendRedirect("register.jsp");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
