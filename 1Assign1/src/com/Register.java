package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("t3");
		String address = request.getParameter("t4");
		String Phone_Number = request.getParameter("t5");
		String uname = request.getParameter("t1");
		String pwd = request.getParameter("t2");

		PrintWriter out = response.getWriter();
		JbeanDb db = new JbeanDb();

		db.insert(name, address, Phone_Number, uname, pwd);

		{

			// request.setAttribute("name", name);

			// RequestDispatcher rd =request.getRequestDispatcher("l");
			RequestDispatcher rd = request.getRequestDispatcher("RegSucces.jsp");
			rd.forward(request, response);
			// out.println("<h1>");
			// out.println("Welcome : "+name);
			// out.println("</h1>");
		}

	}

}
