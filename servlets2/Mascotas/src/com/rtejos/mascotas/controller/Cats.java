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
@WebServlet("/Cats")
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
		
		String nameCats;
		String breedCats;
		double weightCats = 0.0;
		
		
		// seteo variables recibidas desde la url por metodo get
		if(request.getParameter("name") == null) {
			nameCats = "empyti";
		} else {
			nameCats = request.getParameter("name");
		}
		
		if(request.getParameter("breed") == null) {
			breedCats = "empyti";
		} else {
			breedCats = request.getParameter("breed");
		}
		
		if(request.getParameter("weight").isEmpty()) {
			weightCats = 0.0;
		} else {
			weightCats = Double.parseDouble(request.getParameter("weight"));
			
		}
		
	
		Cat gato = new Cat();
		
		gato.setName(nameCats);
		gato.setBreed(breedCats);
		gato.setWeight(weightCats);		
		gato.showAffection();
		
		request.setAttribute("theCats", gato);
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
