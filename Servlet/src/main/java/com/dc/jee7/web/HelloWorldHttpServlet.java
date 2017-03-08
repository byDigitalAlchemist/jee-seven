package com.dc.jee7.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(asyncSupported = false, name = "HelloWorldHttpServlet", urlPatterns = {"/HelloWorldHttpServlet"})
public class HelloWorldHttpServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public HelloWorldHttpServlet() {
		super();
		System.out.println(" Constructor ");
	}
	@Override
	public void init() throws ServletException {
		System.out.println(" Init ");
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		resp.setContentType("text/html");
		resp.getWriter().append("served at: ").append(request.getContextPath());
		
		String firstName 	= request.getParameter("firstName");
		String secondName 	= request.getParameter("lastName");
		
		writer.println("<h3>Reading querystring data using 'String getParameter(String name)' method : </h3>");
		writer.println("<div>");
		writer.println("<p>First Name : "+ firstName + "</p>");
		writer.println("<p>Last Name : "+ secondName + "</p>");
		writer.println("</div>");
		
		
		writer.println("<h3>Reading querystring data Enumeration 'Enumeration getParameterNames()' method : </h3>");
		writer.println("<div>");
		Enumeration<String> enumParameters = request.getParameterNames();
		while (enumParameters.hasMoreElements()) {
			String paramName = enumParameters.nextElement();
			String paramValue = request.getParameter(paramName);
			
			writer.println("<p>" + paramName + ": "+ paramValue);
		}
		writer.println("</div>");
		
		writer.println("<h3>Reading querystring data Enumeration 'Enumeration getParameterNames()' method : </h3>");
		writer.println("<div>");
		Map<String, String[]> mapParameters = request.getParameterMap();
		for (Entry<String, String[]> entry : mapParameters.entrySet()) {
            String[] values = entry.getValue();
            
            writer.println("<p> paramName "+entry.getKey());
            for (int i = 0; i < values.length; i++) {
            	writer.println("<p>"+ i + " value : "+values[i] + "</p>");
			}
            writer.println("</p>");
            
        }
		writer.println("</div>");
		
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
