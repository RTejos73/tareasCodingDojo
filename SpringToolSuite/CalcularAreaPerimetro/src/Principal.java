import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		boolean salir = true;
		Metodos metodo1 = new Metodos();
		Metodos metodo2 = new Metodos();
		
		while(salir) {
			
			System.out.println("Seleccione que desea calcular");
			System.out.println("1. Area");
			System.out.println("2. Perímetro");
			System.out.println("3. Salir");
			
			int seleccion = scan1.nextInt();
			
			switch (seleccion) {
			case 1:
					metodo1.calcularArea();
					//scan1.close();
					break;
			case 2:
					metodo2.calcularPerimetro();
					//scan1.close();
					break;
			
			case 3:
					System.out.println("Ha salido del Sistema");
					System.out.println("© Rene Tejos");
					scan1.close();
					salir = false;
					break;
			}
			
		}
		

	}

}
