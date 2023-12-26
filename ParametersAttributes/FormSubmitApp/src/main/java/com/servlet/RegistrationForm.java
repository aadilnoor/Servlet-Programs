package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("user_name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course");

		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Name :" + name + "</h1>");
		writer.print("<h1>Email :" + email + "</h1>");
		writer.print("<h1>Password :" + password + "</h1>");
		writer.print("<h1>Course :" + course + "</h1>");
	}

}
