package com.rtejos.calculadora;
import java.util.Scanner;

import com.rtejos.calduladora2.*;


public class CalculatorTest {

	public static void main(String[] args) {
		
		//CalculadoraI();	
		CalculadoraII();

	}
	
	
	
	public static void CalculadoraI() {
		
		Calculator calculadora1 = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el primer Numero : ");
		calculadora1.setFirstNumber(scan.nextDouble());
		System.out.println("Ingrese el operador : ");
		calculadora1.setOperator(scan.next());
		System.out.println("Ingrese el segundo numero : ");
		calculadora1.setSecondNUmber(scan.nextDouble());
		scan.close();
		System.out.println("\nEl resultado es " + calculadora1.getResult(calculadora1));		
	}
	
	
	public static void CalculadoraII()  {
		Scanner scan1 = new Scanner(System.in);
		String aa = "";
		CalculatorII calculadora2 = new CalculatorII();
		
		int opcion=0;
	//	do {
			
			String menu = "***********************************\n";
			menu += "**    Seleccione una opcion      **\n";
			menu += "**                               **\n";
			menu += "** 1. Operacion Como Calculadora **\n";
			menu += "** 2. Operacion Matematica       **\n";
			menu += "** 3. Salir del Sistema          **\n";
			menu += "**                               **\n";
			menu += "***********************************\n";
			
			System.out.println(menu);	
			//if(scan1.hasNextInt()) {
				 opcion = scan1.nextInt();
		//	}else {
			//	opcion = 0;
			//}
		
			if(opcion == 1) {
				aa = calculadora2.getOperations2();
			}else if (opcion == 2) {			
				aa = calculadora2.getOperations1();
			}
			
	//	} while(opcion != 3);
		scan1.close();
		
		System.out.println(aa);
	}
	
	
	
	
	// polimorfismo
	// es cuando un metodo adapta muchas formas de hacer lo mismo
	
	//metodo abstracto no se implementa en la clase abstracta
	// la clase abstracta puede tener metodos normales y abstractos, y los metodos abstractos pueden o ser utilizados

}
