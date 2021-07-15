package com.rtejos.mascotas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rtejos.mascotas.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet(name = "dogs", urlPatterns = { "/dogs" })
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dogs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// seteo variables recibidas desde la url por metodo get
		String nameDogs = request.getParameter("name");
		String breedDogs = request.getParameter("breed");
		double weightDogs = Double.parseDouble(request.getParameter("weight"));		
	
		Dog perro = new Dog();
		
		perro.setName(nameDogs);
		perro.setBreed(breedDogs);
		perro.setWeight(weightDogs);		
		perro.showAffection();
		
		request.setAttribute("theDogs", perro);
		request.getRequestDispatcher("/WEB-INF/view/dog.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
