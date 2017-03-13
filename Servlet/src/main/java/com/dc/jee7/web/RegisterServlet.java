package com.dc.jee7.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = false, name = "Register", urlPatterns = {"/Register"})
public class RegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public RegisterServlet(){
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String userName 	=	request.getParameter("txtUserName");
		String userPass 	=	request.getParameter("txtPass");
		String userGender 	=	request.getParameter("radioGender");
		
		String[] userHobbies 	= request.getParameterValues("checkBoxHobbies");
		String userCountry 		= request.getParameter("selectCountry");
		String[] userKids 		= request.getParameterValues("selectKids");

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<div>");
		writer.println("<p> Username : "+ userName + "</p>");
		writer.println("<p> Password : "+ userPass + "</p>");
		writer.println("<p> Gender	 : "+ userGender + "</p>");
		writer.println("<p> Hobbies	 : "+ Arrays.toString(userHobbies) + "</p>");
		writer.println("<p> Country	 : "+ userCountry + "</p>");
		writer.println("<p> Kids	 : "+ Arrays.toString(userKids) + "</p>");
		writer.println("</div>");
		
		
		Map<String, ? extends ServletRegistration> servletRegistrations = request.getServletContext().getServletRegistrations();

		for (Entry<String, ? extends ServletRegistration> element : servletRegistrations.entrySet()) {
		
			writer.println("<p>key : " + element.getKey() + " Values : "+ element.getValue().getClassName() + "</p></br>");
			
			
		}
		
		writer.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
