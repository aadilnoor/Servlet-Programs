package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class First extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String em = req.getParameter("email");
		String ps = req.getParameter("password");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();

		RequestDispatcher rd;

		if ("demo123@gmail.com".equals(em) && "demo".equals(ps)) {

			// redirect home page
			rd = req.getRequestDispatcher("/servlet2");

			rd.forward(req, resp);

		} else {
			// redirect login page
			writer.print("<h4>Invalid Email & Password</h4>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
