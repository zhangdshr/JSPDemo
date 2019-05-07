package edu.mum.cs545;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChooseServlet
 */
@WebServlet("/ChooseServlet")
public class ChooseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RadioState radioState = new RadioState();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChooseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
		 dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		if (request.getParameter("radioJSPCool") != null) {
			String choice = request.getParameter("radioJSPCool");
			 System.out.println ("radioJSPCool choice= "+ choice);
			 if (choice.equalsIgnoreCase("1")) {
				 RadioState.yesCheckRadioJSPCool = "checked";
				 RadioState.noCheckRadioJSPCool = "";
			 } else if (choice.equalsIgnoreCase("0")) {
				 RadioState.noCheckRadioJSPCool = "checked";
				 RadioState.yesCheckRadioJSPCool = ""; 
			 }
		} 
		
		if (request.getParameter("JSFwayCool") != null) {
			String choice = request.getParameter("JSFwayCool");
			System.out.println ("JSFwayCool choice= "+ choice);
			 if (choice.equalsIgnoreCase("1")) {
				 RadioState.yesCheckJSFwayCool = "checked";
				 RadioState.noCheckJSFwayCool = "";
			 } else if (choice.equalsIgnoreCase("0")) {
				 RadioState.noCheckJSFwayCool = "checked";
				 RadioState.yesCheckJSFwayCool = "";
			 }
		} 
		
		if (request.getParameter("moonCheese") != null) {
			String choice = request.getParameter("moonCheese");
			System.out.println ("moonCheese choice= "+ choice);
			 if (choice.equalsIgnoreCase("1")) {
				 RadioState.yesCheckMoonCheese = "checked";
				 RadioState.noCheckMoonCheese = "";
			 } else if (choice.equalsIgnoreCase("0")) {
				 RadioState.noCheckMoonCheese = "checked";
				 RadioState.yesCheckMoonCheese = "";
			 }
		} 
		
		else 
		 System.out.println("No choice made");
		 RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
		 dispatch.forward(request, response);
	}

}
