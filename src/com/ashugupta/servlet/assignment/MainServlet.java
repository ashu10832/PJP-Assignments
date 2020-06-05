package com.ashugupta.servlet.assignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String routePath = request.getServletPath();
		System.out.println(routePath);
		
		
		switch (routePath) {
		case "/getEmps": {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("emps.jsp");
			requestDispatcher.forward(request, response);
			return;
		}
		case "/getCustomers":{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("customers.jsp");
			requestDispatcher.forward(request, response);
			return;
		}
		case "/getProducts":{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("products.jsp");
			requestDispatcher.forward(request, response);
			return;
		}
		default:
			response.getWriter().write("home");
			return;
		}
	}

}
