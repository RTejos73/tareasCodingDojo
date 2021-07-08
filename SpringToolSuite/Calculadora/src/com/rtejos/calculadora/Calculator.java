package com.rtejos.calculadora;

public class Calculator implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double firstNumber;
	double secondNUmber;
	String operator;
	
	public Calculator() {
		
	}
	
	
	public Calculator(double primerNumero, double segundoNumero, String operador) {
		this.firstNumber = primerNumero;
		this.secondNUmber = segundoNumero;
		this.operator = operador;				
	}
	
	
	public String performOperation() {
		
		
		return null;
		
	}
	
	public double getResult(Calculator calcular) {
		
		double primero = calcular.getFirstNumber();
		double segundo = calcular.getSecondNUmber();
		String operador = calcular.getOperator();
		double resultado;
		
		switch(operador) {
		
		case "+" :
				resultado = primero + segundo;
				break;
			
		case "-" :
				resultado = primero - segundo;
				break;
		case "*" :
				resultado = primero * segundo;
				break;
		case "/" :
				resultado = primero / segundo;
				break;
		default :
				resultado = 0.0;
				break;
		}
		
		return resultado;
		
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
