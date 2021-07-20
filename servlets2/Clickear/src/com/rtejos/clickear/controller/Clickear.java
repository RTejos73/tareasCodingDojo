package com.rtejos.clickear.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Clickear
 */
@WebServlet("/Clickear")
public class Clickear extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clickear() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int contador = 1;
		HttpSession session = request.getSession();
		if(session.getAttribute("entrada") == null) {
			session.setAttribute("entrada", contador);			
		}else {
			int valorActual = (int) session.getAttribute("entrada");
			valorActual++;
			session.setAttribute("entrada",valorActual);
		}	
		int valorActual2 = (int) session.getAttribute("entrada");
		request.setAttribute("laSession", valorActual2);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
