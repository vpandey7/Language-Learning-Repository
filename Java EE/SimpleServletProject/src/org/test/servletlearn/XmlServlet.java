package org.test.servletlearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("XML Servlet called");
		String username = request.getParameter("userName");
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		writer.println("Hello from GET method "+username);
			}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("XML Servlet called");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		writer.println("Hello from POST Method "+userName + " Your full Name is " +fullName);
		String prof = request.getParameter("prof");
		writer.println("By Profession you are a " +prof);
		//String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		writer.println("You are at "+location.length +" places");
		
		for(int i=0;i<location.length;i++){
			writer.println(location[i]);
			
		}
		
		//writer.println("You live in:  " +location);
		
			}
	

}
