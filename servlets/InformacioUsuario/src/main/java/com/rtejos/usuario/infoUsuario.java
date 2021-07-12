package com.rtejos.usuario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class infoUsuario
 */

@WebServlet("/infoUsuario")
public class infoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infoUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String favoriteLanguage = request.getParameter("favoriteLanguage");
	String homeTown = request.getParameter("homeTown");
	if (firstName == null) firstName = "Unkown";
	if (lastName == null) lastName = "Unkown";
	if (favoriteLanguage == null) favoriteLanguage = "Unkown";
	if (homeTown == null) homeTown = "Unkown";
	PrintWriter out2 = response.getWriter();
	out2.write("<h1>Welcome, " + firstName + " " + lastName  + "</h1>");
	out2.write("<h2>Your favorite languaje is :  " + favoriteLanguage +  "</h2>");
	out2.write("<h2>Your fhometown is :  " + homeTown + "</h2>");
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
