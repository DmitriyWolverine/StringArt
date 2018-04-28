package by.sda.stringart.web.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.sda.stringart.commands.BaseCommand;
import by.sda.stringart.commands.CommandManager;

import static by.sda.stringart.web.controller.util.ServletConstants.SERVLET_ACTION;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
    	System.out.println("Hello from MainServlet");
    	
    }
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter(SERVLET_ACTION);
		BaseCommand currentAction = CommandManager.getManager().defineServerAction(action);
		try {
			String actionResult = currentAction.doAction(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher(actionResult);
			dispatcher.forward(request, response);
		}
		catch(ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
    @Override
	public void init() throws ServletException {
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doGet");
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doPost");
		processRequest(request, response);
		
	}

}

