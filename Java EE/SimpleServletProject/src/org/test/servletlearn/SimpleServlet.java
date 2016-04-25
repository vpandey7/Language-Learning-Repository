package org.test.servletlearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServlet" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("XML Servlet called");
		String username = request.getParameter("userName");
		PrintWriter writer = response.getWriter();
		// response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (username != "" && username != null) {
			session.setAttribute("savedUserName", username);
			context.setAttribute("savedUserName", username);
		}

		writer.println("Request parameter has username as  " + username);
		writer.println("Session parameter has username as  "
				+ (String) session.getAttribute("savedUserName"));
		writer.println("Context parameter has username as  "
				+ (String) context.getAttribute("savedUserName"));
	}

}
