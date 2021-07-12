package com.rtejos.calculadora;

public class Calculator implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	double firstNumber;
	double secondNUmber;
	String operator = "";
	
	public Calculator() {
		
	}
	
	
		
	public String performOperation() {
		
		
		return null;
		
	}
	
	public double getResult(Calculator calcular) {
		
		double respuesta = 0;
		
		if(calcular.operator.equalsIgnoreCase("+")) {
			
			respuesta = calcular.getFirstNumber() + calcular.getSecondNUmber();	
			
		}else if (calcular.operator.equalsIgnoreCase("-")) {
			
			respuesta = calcular.getFirstNumber() - calcular.getSecondNUmber();	
			
		}else if (calcular.operator.equalsIgnoreCase("*")) {			
			
			respuesta = calcular.getFirstNumber() * calcular.getSecondNUmber();
			
		}else if (calcular.operator.equalsIgnoreCase("/")) {
			
			if(calcular.getSecondNUmber() == 0) {
				System.out.println("\nNo se Puede dividir por 0");
				respuesta = 0;
				
			}else {
				
				respuesta = calcular.getFirstNumber() / calcular.getSecondNUmber();
				
			}
		}		
		
		return respuesta;
		
	}
	
	
	
	

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNUmber() {
		return secondNUmber;
	}

	public void setSecondNUmber(double secondNUmber) {
		this.secondNUmber = secondNUmber;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
	
	

}
