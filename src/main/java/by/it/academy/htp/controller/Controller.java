package by.it.academy.htp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.it.academy.htp.bean.User;

public class Controller extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(request.getRequestURL());
		out.println(request.getServerPort());
		Enumeration<String> e = request.getHeaderNames();

		while (e.hasMoreElements()) {
			String name = e.nextElement();
			String value = request.getHeader(name);
			out.println(name + "=" + value);

		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		final String name = request.getParameter("name");
		final String surname = request.getParameter("surname");
		final String age = request.getParameter("age");
		final String language = request.getParameter("language");
		final String[] framework = request.getParameterValues("framework");

		User user = new User(name, surname, Integer.parseInt(age), language, framework);
		System.out.println(user);
		request.setAttribute("user1", user);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);

	}

}
