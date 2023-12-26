package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name1 = req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1> Name : "+name1+"</h1>");
		writer.print("<a href='servlet2?username = '"+name1+">Servlet 2</a>");

	}
}
