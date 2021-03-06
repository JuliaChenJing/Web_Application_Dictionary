package mum.cs472;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	static final long serialVersionUID = 0;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("------Inside GET---");
		Student[] table = new Student[] { new Student("bob", 23), new Student("jill", 33), new Student("kim", 18) };
		request.setAttribute("students", table);
		RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
		dispatcher.forward(request, response);
	}
}