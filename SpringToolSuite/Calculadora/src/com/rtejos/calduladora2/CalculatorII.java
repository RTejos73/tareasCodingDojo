package com.rtejos.calduladora2;

import javax.swing.JOptionPane;

public class CalculatorII implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public double numberOne = 0.0;
	public double numberTwo = 0.0;
	public double result = 0.0;
	public String operator = "";
	public boolean salida = false;
	
	
	public double result() {
	
		
		
		do {				
			
			String seleccion = JOptionPane.showInputDialog(
					   null,
					   "Ingrese el Valor ",
					   JOptionPane.QUESTION_MESSAGE);
			
			
			String seleccion2 = JOptionPane.showInputDialog(
					   null,
					   "Ingrese el operador ",
					   JOptionPane.QUESTION_MESSAGE);
			operator = seleccion2;
			
			if(operator.contentEquals("+")) {
				if (numberOne == 0.0) {
					numberOne = Double.parseDouble(seleccion);
				}else {
					result = Double.parseDouble(seleccion) + numberOne;
				}
			} else if(operator.contentEquals("-")) {
				if (numberOne == 0.0) {
					numberOne = Double.parseDouble(seleccion);
				}else {
					result = Double.parseDouble(seleccion) - numberOne;
				}
				
			}
		
			
				
			
	
			
			
		} while (salida);
		
		
		
		
		
		
		
		
		
		
		
		return 0.0;
	}
	
	
	
	

}
