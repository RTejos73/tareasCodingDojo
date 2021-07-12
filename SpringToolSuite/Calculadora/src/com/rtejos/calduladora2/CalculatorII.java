package com.rtejos.calduladora2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalculatorII implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public double numberOne = 0.0;
	public double numberTwo = 0.0;
	public double result = 0.0;
	public String operator = "";
	public boolean salida = false;
	List<Object> operacion = new ArrayList<Object>();
	List<Object> operacion2 = new ArrayList<Object>();
	
	
	public String getOperations1() {
		Scanner scan = new Scanner(System.in);
		String operador = "";
		
		do {
			System.out.println("Ingrese un Numero : ");
			double num = scan.nextDouble();
			operacion.add(num);
			System.out.println("Ingrese el operador : ");
			operador = scan.next();
			operacion.add(operador);
		} while (!operador.equalsIgnoreCase("="));
		scan.close();
		
		for(Object objeto : operacion) {
			
			System.out.print("\n" + objeto + " | ");
			
		}
		
		return result1();
	}
	
	public String getOperations2() {
		
		Scanner scan = new Scanner(System.in);
		String operador = "";
		
		do {
			System.out.println("Ingrese un Numero : ");
			double num = scan.nextDouble();
			operacion2.add(num);
			System.out.println("Ingrese el operador : ");
			operador = scan.next();
			operacion2.add(operador);
		} while (!operador.equalsIgnoreCase("="));
		scan.close();
		
			
		return result2();
	}
	
	
	
	
	public String result1() {		
		
		List<Object> operacionDividir = calcularDividir(operacion);
		List<Object> operacionMultiplicar = calcularMultiplicacion(operacionDividir);
		List<Object> operacionSumar = calcularSumar(operacionMultiplicar);
		List<Object> operacionRestar = calcularRestar(operacionSumar);
		
		return "El resultado es " + operacionRestar.get(0);
	}

	public String result2() {
		
		List<Object> nueva = new ArrayList<Object>();
		int contador1 = 0, contador2=0;
		boolean encontro = false;
		System.out.println("operacion 2");
		for(Object object : operacion2) {	
			if(!encontro) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String oper = (String)object;
					if(oper.equalsIgnoreCase("*")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						contador2--;
						nueva.remove(contador2);
						nueva.add(numeroAnterior * numeroSiguiente);
						encontro = true;
					} else if (oper.equalsIgnoreCase("/")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						contador2--;
						nueva.remove(contador2);
						nueva.add(numeroAnterior / numeroSiguiente);
						encontro = true;
					} else if (oper.equalsIgnoreCase("+")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						contador2--;
						nueva.remove(contador2);
						nueva.add(numeroAnterior + numeroSiguiente);
						encontro = true;
					} else if (oper.equalsIgnoreCase("-")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						contador2--;
						nueva.remove(contador2);
						nueva.add(numeroAnterior - numeroSiguiente);
						encontro = true;
					}
				}
				contador2++;
		
			}else {
				encontro = false;
			}
			contador1++;
		
		}
		
		return "El resultado es " + nueva.get(0);
	}

	private List<Object> calcularMultiplicacion(List<Object> operacion2) {
		
		List<Object> nueva = new ArrayList<Object>();
		int contador1 = 0, contador2 = 0;
		boolean multiplicar = false;
		for(Object object : operacion2) {
			if(!multiplicar) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String oper = (String)object;
					if(oper.equalsIgnoreCase("*")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						contador2--;
						nueva.remove(contador2);
						nueva.add(numeroAnterior * numeroSiguiente);
						multiplicar = true;
						
					}else {
						nueva.add(object);
					}
					
				}
				contador2++;	
			} else {
				multiplicar = false;
			}
			contador1++;
			
		}
				
		return nueva;
	}
	
	private List<Object> calcularDividir(List<Object> operacion2) {
		
		List<Object> nueva = new ArrayList<Object>();
		int contador1 = 0, contador2 = 0;
		boolean dividir = false;
		for(Object object : operacion2) {
			if(!dividir) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String oper = (String)object;
					if(oper.equalsIgnoreCase("/")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						contador2--;
						nueva.remove(contador2);
						nueva.add(numeroAnterior / numeroSiguiente);
					//	contador2--;
						dividir = true;
					}else {
						nueva.add(object);
					}
				}
				contador2++;			
			}else {
				dividir = false;
			}
			contador1++;
		}
			
		return nueva;
	}
	
	private List<Object> calcularSumar(List<Object> operacion2) {
		
		List<Object> nueva = new ArrayList<Object>();
		int contador1 = 0, contador2 = 0;
		boolean sumar = false;
		for(Object object : operacion2) {
			if(!sumar) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String oper = (String)object;
					if(oper.equalsIgnoreCase("+")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						nueva.remove(contador2-1);
						nueva.add(numeroAnterior + numeroSiguiente);
						sumar = true;
						contador2--;
					}else {
						nueva.add(object);
					}
				}
				contador2++;
			} else {
				sumar = false;
			}
			contador1++;
		}
			
		return nueva;
	}
	
	
	private List<Object> calcularRestar(List<Object> operacion2) {
		
		List<Object> nueva = new ArrayList<Object>();
		int contador1 = 0, contador2 = 0;
		boolean restar = false;
		for(Object object : operacion2) {
			if(!restar) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String oper = (String)object;
					if(oper.equalsIgnoreCase("-")) {
						double numeroAnterior = (double)nueva.get(contador2-1);
						double numeroSiguiente = (double)operacion2.get(contador1+1);
						nueva.remove(contador2-1);
						nueva.add(numeroAnterior - numeroSiguiente);
						restar = true;
						contador2--;
					}else {
						nueva.add(object);
					}
				}
				contador2++;
			} else {
				restar = false;
			}
			contador1++;
		}
				
		return nueva;
	}
		
}