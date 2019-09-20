package com.revature.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class home extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) {
		System.out.println("init was called");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("service method was called: "+request.getMethod()+" to "+request.getRequestURI());
		if("POST".equals(request.getMethod())){
			response.setStatus(201);
		} else if ("DELETE".equals(request.getMethod())) {
			response.setStatus(405);
		} else {
		
			PrintWriter pw = response.getWriter();
			pw.print("Hello World");
		}
		
	}
	
	public void destroy() {
		System.out.println("destroy method was called");
	}
	
	
}
