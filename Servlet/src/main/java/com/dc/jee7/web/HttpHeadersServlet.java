package com.dc.jee7.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = false, name = "HeaderInformation", urlPatterns = {"/HeaderInformation"})
public class HttpHeadersServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public HttpHeadersServlet(){
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE HTML");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Showing All Request Headers</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>All Requested Headers</h1>");
		
		writer.println("<p><b>Request Method 	: </b>"+request.getMethod());
		writer.println("<p><b>Request URI 		: </b>"+request.getRequestURI());
		writer.println("<p><b>Request URL 		: </b>"+request.getRequestURL());
		writer.println("<p><b>Request Protocol	: </b>"+request.getProtocol());
		
		Enumeration<String> headers = request.getHeaderNames();
		
		while (headers.hasMoreElements()) {
			String headersName = (String) headers.nextElement();
			writer.println("<p><b>" + headersName + ":</b>" + request.getHeader(headersName) + "</p>");
		}
		
		
		
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
