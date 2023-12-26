package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1> Name = " + name + "</h1>");
		HttpSession session = req.getSession();
		session.setAttribute("username", name);
	
		writer.println("<a href = 'servlet2'>Servlet 2</a>");

	}

}
