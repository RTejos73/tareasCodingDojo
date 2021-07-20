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
		String nameDogs;
		String breedDogs;
		double weightDogs = 0.0;
		
		
		// seteo variables recibidas desde la url por metodo get
		if(request.getParameter("name") == null) {
			nameDogs = "empyti";
		} else {
			nameDogs = request.getParameter("name");
		}
		
		if(request.getParameter("breed") == null) {
			breedDogs = "empyti";
		} else {
			breedDogs = request.getParameter("breed");
		}
		
		if(request.getParameter("weight").isEmpty()) {
			weightDogs = 0.0;
		} else {
			weightDogs = Double.parseDouble(request.getParameter("weight"));
			
		}
		
	
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
