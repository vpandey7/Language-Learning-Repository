package org.vish.loginservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.vish.loginservlets.dto.User;
import org.vish.loginservlets.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId,password;
		
		// to catch the parameter input from user on the login page
		
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		// Business logic to authenticate password and user Id
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, password);
		
		// to redirect to another page we would use response object
		if(result == true){
			
			User user = loginService.getUserDetails(userId);
			// success.jsp is 2nd call.Since it is different request we need to save the results in session
			//request.getSession().setAttribute("user", user);
			
			//we may have a business case to persist the request parameters
			//response.sendRedirect("success.jsp");
			//we can do the Redirect on the server side itself by using Request Dispatcher.
			// we are dispatching the request to success.jsp
			//now we can save directly the attribute to the request object.
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		else{
			response.sendRedirect("login.jsp");
		}
		
		
		
		
		
	}

}
