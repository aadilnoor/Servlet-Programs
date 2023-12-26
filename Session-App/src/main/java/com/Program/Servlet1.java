package com.Program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();

		Cookie ck = new Cookie("name", name);
		resp.addCookie(ck);
		
		writer.print("<h1>Welcome to servlet1, Name =" + name + "</h1>");
		writer.print("<br> <a href='servlet2'> Servlet2 </a>");

	}

}
