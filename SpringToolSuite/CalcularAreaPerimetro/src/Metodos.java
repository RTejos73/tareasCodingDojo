import java.util.Scanner;



public class Metodos {
	
	
	public void calcularArea() {
		double pi = 3.141592654;
		boolean salir = true;
		
		while(salir) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Seleccione el producto para Calcular el Area ");
			System.out.println("1. Circulo");
			System.out.println("2. Triangulo");
			System.out.println("3. Rectangulo");
			System.out.println("4. Salir");
			int area = entrada.nextInt();
			switch (area) {
			
				case 1: 
						System.out.println("Favor ingrese el Radio del Circulo ");
						double radio = entrada.nextDouble();
						System.out.println("El Area del Circulo es : " + (pi*(radio*radio)));
						System.out.println("*****************************************");
						break;
				case 2: 
						System.out.println("Favor ingrese el valor de la base del Triangulo ");
						double base = entrada.nextDouble();
						System.out.println("Favor ingrese el valor de la altura del Triangulo ");
						double altura = entrada.nextDouble();
						System.out.println("El Area del Triangulo es : " + ((base*altura)/2));
						System.out.println("*****************************************");
					break;
				case 3: 
						System.out.println("Favor ingrese el valor del lado A del Rectangulo");
						double ladoA = entrada.nextDouble();
						System.out.println("Favor ingrese el valor del lado B del Rectangulo ");
						double ladoB = entrada.nextDouble();
						System.out.println("El Area del Triangulo es : " + (ladoA * ladoB));
						System.out.println("*****************************************");;
						break;
				case 4:
						salir = false;
						entrada.close();
						break;			
			}			
		}		
	}
	
	
	
	public void calcularPerimetro() {
		
		double pi = 3.141592654;
		boolean salir = true;
		
		while(salir) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Seleccione el producto para Calcular el Perimetro ");
			System.out.println("1. Circulo");
			System.out.println("2. Triangulo");
			System.out.println("3. Rectangulo");
			System.out.println("4. Salir");
			int area = entrada.nextInt();
			switch (area) {
			
				case 1: 
						System.out.println("Favor ingrese el Radio del Circulo ");
						double radio = entrada.nextDouble();
						System.out.println("El Perimetro del Circulo es : " + (2*pi*radio));
						System.out.println("*****************************************");
						break;
				case 2: 
						System.out.println("Favor ingrese el valor del primer lado del Triangulo ");
						double lado1 = entrada.nextDouble();
						System.out.println("Favor ingrese el valor del segundo lado del Triangulo ");
						double lado2 = entrada.nextDouble();
						System.out.println("Favor ingrese el valor del tercer lado del Triangulo ");
						double lado3 = entrada.nextDouble();
						System.out.println("El Perimetro del Triangulo es : " + (lado1+lado2+lado3));
						System.out.println("*****************************************");
					break;
				case 3: 
						System.out.println("Favor ingrese el valor del lado A del Rectangulo ");
						double ladoA = entrada.nextDouble();
						System.out.println("Favor ingrese el valor del lado B del Rectangulo");
						double ladoB = entrada.nextDouble();
						System.out.println("El Perimetro del Triangulo es : " + (2*(ladoA+ladoB)));
						System.out.println("*****************************************");;
						break;
				case 4:
						salir = false;
						entrada.close();
						//System.out.println("Ha salido del Systema.");
						break;			
			}			
		}		
	}
	
	
	

}
