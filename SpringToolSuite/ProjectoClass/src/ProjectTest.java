import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectTest {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Project> projects = new ArrayList();
	
	
	public static void main(String[] args) {
		
		
		creaProjecto();
	//	mostrarProjectos();
		getPortfolioCost();
		showPorfolio();

	}
	
	
	
	public static void creaProjecto() {
		String nom,desc;
		int n;
		double ini;
		Project aux;
		do {
			System.out.println("Cuantos Projectos desea crear ");
			n = sc.nextInt();
		}while(n<0);
		
		sc.nextLine();  // esto limpia el intro
		
		for(int i=1; i<=n; i++) {
			System.out.print("Ingrese el nombre del projecto " + i + " ");
			nom = sc.nextLine();
			System.out.print("Ingrese la descripcion ");
			desc = sc.nextLine();
			System.out.println("Valor Inicial en UF ");
			ini = sc.nextDouble();
			
			aux = new Project();
			aux.setNombre(nom);
			aux.setDescripcion(desc);
			aux.setInitialCost(ini);
			projects.add(aux);
			sc.nextLine();
		}
	}

	public static void mostrarProjectos(){
		for(int i=0; i<projects.size(); i++) {
			System.out.println(projects.get(i));			
		}		
	}
	
	public static void getPortfolioCost() {
		double total = 0;
		for(int i=0; i<projects.size(); i++) {
			total += projects.get(i).getInitialCost();	
		}
		
		System.out.println("\nCosto total de los proyectos es " + total + " UF");
	}
	
	public static void showPorfolio() {
		for(int i=0; i<projects.size(); i++) {
			System.out.println(projects.get(i));			
		}
	
	}
	
	
	
}
