package com.rtejos.palabras.controller;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.rtejos.palabras.models.Aleatorio;
/**
 * Servlet implementation class Random
 */
@WebServlet("/Random")
public class Random extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Random() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int contador = 1;
		HttpSession session = request.getSession();
		if(session.getAttribute("aleatorio") == null) {
			session.setAttribute("aleatorio", contador);			
		} else {
			int valorActual = (int) session.getAttribute("aleatorio");
			valorActual++;
			session.setAttribute("aleatorio",valorActual);
		}

		Aleatorio aleatorio = new Aleatorio();
		String palabraAleatoria = aleatorio.creaPalabra();
		
		Date ultimaFecha = new Date();
		
		
		int valorActual2 = (int) session.getAttribute("aleatorio");
		request.setAttribute("contador", valorActual2);
		request.setAttribute("palabra", palabraAleatoria);
		request.setAttribute("ultimaFecha", ultimaFecha);
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
