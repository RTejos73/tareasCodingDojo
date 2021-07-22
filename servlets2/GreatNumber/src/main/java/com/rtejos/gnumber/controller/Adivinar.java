package com.rtejos.gnumber.controller;

import java.io.IOException;
import java.util.Random;

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
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public int Aleatorio() {
    	int alea2 = (int)Math.floor(Math.random()*(100-1)+1);
    	
		return	alea2;			

    	
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int userNumber = Integer.parseInt(request.getParameter("numeroElegido"));
		int numeroAleatorio;
		int dificultad = Integer.parseInt(request.getParameter("dificultad"));
		int intentos = 1;
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("numeroElegido") == null) {
			
  //esto si 			
			session.setAttribute("numero", userNumber );
			numeroAleatorio = (int) Aleatorio();
			session.setAttribute("numeroAleatorio", numeroAleatorio);
			
			
		}else {
			numeroAleatorio = (int) session.getAttribute("numeroAleatorio");
			session.setAttribute("numeroAleatorio", userNumber);
		
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
