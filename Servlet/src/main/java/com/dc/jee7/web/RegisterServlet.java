package com.dc.jee7.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
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
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
