package com.rtejos.gnumber.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Adivinar
 */
@WebServlet("/Adivinar")
public class Adivinar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adivinar() {
    	
    }
    
    
    public int Aleatorio() {
    	int alea2 = (int)Math.floor(Math.random()*(100-1)+1);
    	return	alea2;	
}
    
    public String validateNumber(int randomNumber, int userNumber) {
		String validator = "";
		if ( randomNumber < userNumber ) {
			validator = "Too high!";
		}else if ( randomNumber > userNumber ) {
			validator = "Too low!";
		}else {
			validator = randomNumber + " was the number";
		}
		System.out.println(validator);
		return validator;
	}
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int userNumber = Integer.parseInt(request.getParameter("numeroElegido"));
		int numeroAleatorio;
		
		int intentos = 1;
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("numeroElegido") == null) {
			int difficult = Integer.parseInt(request.getParameter("difficult"));
			session.setAttribute("numero", userNumber );
			numeroAleatorio = (int) Aleatorio();
			session.setAttribute("numeroAleatorio", numeroAleatorio);
			session.setAttribute("difficult", difficult);
			session.setAttribute("attemps", intentos);			
		}else {
			numeroAleatorio = (int) session.getAttribute("numeroAleatorio");
			session.setAttribute("numeroAleatorio", userNumber);		
			int temp = (int) session.getAttribute("attemps");
			temp++;
			session.setAttribute("attemps", temp);
		}
		System.out.println(numeroAleatorio);
		System.out.println(session.getAttribute("difficult"));
		System.out.println(session.getAttribute("attemps"));
		
		if ( (int) session.getAttribute("attemps") == (int) session.getAttribute("difficult") ) {	
			session.setAttribute("attemps", null);
			session.setAttribute("difficult", null);
			session.setAttribute("userNumber", null);
			session.setAttribute("randomNumber", null);
			session.invalidate();
		} else {
			int userNumberSession = (int) session.getAttribute("number");
			
			session.setAttribute("randomNumber", numeroAleatorio);
			String validator = (String) validateNumber(numeroAleatorio , userNumberSession);
			session.setAttribute("validator", validator);
			
			RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
			rq.forward(request, response);	
		}
		
		
	
		
		String numElegido = request.getParameter("numeroElegido");
		System.out.println(numElegido);
		
		
		
		
		
		if(request.getParameter("numeroInicial") == null) {
			System.out.println("nulo");
			//session.setAttribute("entrada", contador);			
		}
		

		
		if(request.getParameter("numElegido").equals(null) ) {
			response.sendRedirect("/index.jsp");
		}
		
		
		
		//Integer numInicial = Integer.parseInt(request.getParameter("numeroInicial"));
	//	Integer numFinal = Integer.parseInt(request.getParameter("numeroFinal"));
		//if(numInicial.equals("null") || numFinal.equals("null")) {
	//		response.sendRedirect("/index.jsp");
	//	}
		
		
		
	}

}
