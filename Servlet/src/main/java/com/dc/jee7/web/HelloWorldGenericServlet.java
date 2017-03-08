package com.dc.jee7.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/HelloWorld")
public class HelloWorldGenericServlet extends GenericServlet{

	private static final long serialVersionUID = 1L;

	public HelloWorldGenericServlet() {
		super();
		System.out.println("Generic Servlet");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("Welcome to service method GenericServlet");
	}
}
