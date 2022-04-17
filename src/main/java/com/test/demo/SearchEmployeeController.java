package com.test.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.demo.dao.EmployeeDAO;
import com.test.demo.vo.EmployeeVO;

/**
 * Servlet implementation class SearchEmployeeController
 */
public class SearchEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자에게 보내는 방식을 결정
		response.setCharacterEncoding("UTF-8");
		// Content 해석 방식을 알려줌
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		/*
		String empName = request.getParameter("empName");
		System.out.println("INPUT empName => " + empName);
		*/
		int empNo = Integer.parseInt(request.getParameter("empNo"));
		/*
		System.out.println("INPUT empNo => " + empNo);
		request.setAttribute("empNo", empNo);
		*/
		/*
		HttpSession session = request.getSession();
		session.setAttribute("empNo", empNo);
		*/
		// response.sendRedirect("searchEmployeeView.jsp");
		
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeVO vo = dao.searchEmployee(empNo);
		// EmployeeVO vo = new EmployeeVO();
		// HttpSession session = request.getSession();
		// session.setAttribute("vo", vo);
		request.setAttribute("vo", vo);
		// response.sendRedirect("searchEmployeeView.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("searchEmployeeView.jsp");
		rd.forward(request, response);
		
		/*
		PrintWriter out = response.getWriter();
		out.println("Welcome " + vo);
		// doGet(request, response);
		*/
	}

}
