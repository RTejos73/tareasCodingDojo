package com.rtejos.mascotas.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rtejos.mascotas.models.Cat;

/**
 * Servlet implementation class Cats
 */
@WebServlet(name = "cats", urlPatterns = { "/cats" })
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cats() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nameCats = request.getParameter("name");
		String breedCats = request.getParameter("breed");
		double weightCats = Double.parseDouble(request.getParameter("weight"));
		
		Cat cat = new Cat();
		
		cat.setName(nameCats);
		cat.setBreed(breedCats);
		cat.setWeight(weightCats);		
		cat.showAffection();
		
		request.setAttribute("theCats", cat);
		request.getRequestDispatcher("/WEB-INF/view/cat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
