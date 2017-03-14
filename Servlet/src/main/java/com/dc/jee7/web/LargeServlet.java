package com.dc.jee7.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dc.jee7.web.utility.GzipUtility;

@WebServlet(asyncSupported = false, name = "LargeServlet", urlPatterns = { "/LargeServlet" })
public class LargeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LargeServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer;
		
		if(GzipUtility.isGzipSupported(request) && !GzipUtility.isGzipDisabled(request)){
			writer = GzipUtility.getGzipWriter(response);
			response.setHeader("Content-Encoding","gzip");
		}
		else{
			writer = response.getWriter();
		}
		
		final String dummyText = "What is Lorem Ipsum? Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
				+ "Why do we use it? "
				+ "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."
				+ "";
		
		writer.println("<!DOCTYPE HTML");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Demo : Large Request Headers</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>All Requested Headers</h1>");
		
		writer.println("<p><b>Request Method 	: </b>"+request.getMethod());
		writer.println("<p><b>Request URI 		: </b>"+request.getRequestURI());
		writer.println("<p><b>Request URL 		: </b>"+request.getRequestURL());
		writer.println("<p><b>Request Protocol	: </b>"+request.getProtocol());
		
		for (int i = 0; i < 10000; i++) {
			writer.println(dummyText);
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
