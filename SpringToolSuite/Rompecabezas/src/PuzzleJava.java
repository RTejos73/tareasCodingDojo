import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {

	public static void main(String[] args) {
		
//		ArrayList<Integer> numeros = new ArrayList<Integer>();
//        numeros.add(5);
//        numeros.add(4);
//        numeros.add(3);
//        numeros.add(2);
//        numeros.add(1);
//        
//        Collections.shuffle(numeros);
//      //  System.out.println(numeros); // [5, 4, 3, 2, 1]
//        Collections.sort(numeros);
//        //System.out.println(numeros); // [1, 2, 3, 4, 5]
//                
//        Random r = new Random();
//        System.out.println(r.nextInt()); // Sin límites
//        System.out.println(r.nextInt(5)); // Con límites entre 0 y 5
		
		
		int[] array1 = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Nancy");
		array2.add("Jinichi");
		array2.add("Fujibayashi");
		array2.add("Momochi");
		array2.add("Ishikawa");
		
				
		
		//Actividad1(array1);
		//Actividad2(array2);
		//Alfabeto();
		//Actividad4();
		//Actividad5();
		//Actividad6();
		Actividad7();
		
	}
	
	
	
	public static void Actividad1(int[] arrayPrueba1) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		int suma = 0;
		for(int i=0; i < arrayPrueba1.length; i++) {
			suma += arrayPrueba1[i];
			if(arrayPrueba1[i] > 10) {
				lista1.add(arrayPrueba1[i]);
			}
			
		}
		
		System.out.println("La suma del array es : " + suma);
		System.out.println(lista1);
		
	}
	
	
	public static void Actividad2(List<String> arrayPrueba2) {
		List<String> masdeCinco = new ArrayList<String>();
		System.out.println("ArrayList Original : " + arrayPrueba2);
		Collections.shuffle(arrayPrueba2);
		//System.out.println(arrayPrueba2);
		for(String nombre : arrayPrueba2) {
			System.out.println(nombre);
			if(nombre.length() > 5) {
				masdeCinco.add(nombre);
			}			
		}
		System.out.println("Mas de 5 caracteres " + masdeCinco);
	}
	
	
	public static void Alfabeto() {
		List<Character> alfa = new ArrayList<Character>();
		
		for(int i=0; i < 26; i++) {
			int codigo = (int)Math.floor(Math.random()*(122-97) + 97);
			alfa.add((char)codigo);
			
		}
		System.out.println("Array Original " + alfa);
		Collections.shuffle(alfa);
		System.out.println("Array mezclado " + alfa);
		System.out.println("Ultimo Caracter " + alfa.get(25));
		System.out.println("Primer Caracter " + alfa.get(0));
	}
	
	
	public static void Actividad4() {
		List<Integer> randon1 = new ArrayList<Integer>(); 
		List<Integer> randon2 = new ArrayList<Integer>(); 
		Random alea1 = new Random();
		
		for(int i=0; i< 10; i++) {
			int alea2 = (int)Math.floor(Math.random()*(100-55)+55);
			randon1.add(alea2);			
			randon2.add(alea1.nextInt(100-55+1)+55);
		}
		System.out.println(randon1);
		System.out.println(randon2);
	}
	
	
	public static void Actividad5() {
		//List<Integer> randon1 = new ArrayList<Integer>(); 
		List<Integer> randon2 = new ArrayList<Integer>(); 
		Random alea1 = new Random();
		
		for(int i=0; i< 10; i++) {
		//	int alea2 = (int)Math.floor(Math.random()*(100-55)+55);
		//	randon1.add(alea2);			
			randon2.add(alea1.nextInt(100-55+1)+55);
		}
		//Collections.sort(randon1);
		Collections.sort(randon2);
	//	System.out.println(randon1);
		System.out.println(randon2);
		System.out.println(randon2.get(0));
		System.out.println(randon2.get(randon2.size()-1));
		
	}
	
	public static void Actividad6() {
		//Random ran1 = new Random();
		String cadena1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String cadena2 = "";
		int longitud = 5;
		
		for(int i=0; i<longitud; i++) {
			int indice = ThreadLocalRandom.current().nextInt(0,cadena1.length()-1);
			char carac1 = cadena1.charAt(indice);
			cadena2 += carac1;
		}
		System.out.println(cadena2);		
	}
	
	public static void Actividad7() {
		String[] cadenas = new String[10];
		
		
		//Random ran1 = new Random();
		String cadena1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String cadena2 = "";
		int longitud = 5;
		for(int j=0; j<10; j++) {
			for(int i=0; i<longitud; i++) {
				int indice = ThreadLocalRandom.current().nextInt(0,cadena1.length()-1);
				char carac1 = cadena1.charAt(indice);
				cadena2 += carac1;
			}
			cadenas[j] = cadena2;
			cadena2="";
		}
		System.out.println(Arrays.toString(cadenas));		
	}
	

}
