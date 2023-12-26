package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {
	
	ServletConfig con;
	
	@Override
	public void destroy() {
		System.out.println("destroy method call");

	}

	@Override
	public ServletConfig getServletConfig() {

		return con;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println("init method call ");
		con=config;
	}

	@Override
	public String getServletInfo() {

		return "My first program";
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service mthod call");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("Welcome to servlet");
		writer.println("Today" + new Date().toString());
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());

	}

}
