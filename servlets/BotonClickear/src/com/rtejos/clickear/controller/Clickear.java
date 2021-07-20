package com.rtejos.clickear.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rtejos.clickear.models.Contador;

/**
 * Servlet implementation class Clickear
 */
@WebServlet(name = "clickear", urlPatterns = { "/clickear" })
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
		HttpSession miSession = request.getSession();
		String elNombre = request.getParameter("contador");
		PrintWriter pw= response.getWriter();
		pw.write(elNombre);
		
		
		String name = (String) miSession.getAttribute("contador");
		pw.println(name);
//		if(name == null) {
//			pw.println(name);
//		}
		
		
		
		
		
		Contador contando = new Contador();
		miSession.setAttribute("contador", contando);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
