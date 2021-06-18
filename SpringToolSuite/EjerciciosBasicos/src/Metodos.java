import java.util.ArrayList;
import java.util.Arrays;

public class Metodos {

	
	public void allNumbers(int hasta) {
        for(int i=1; i<=255; i++){
            System.out.println(i);
        }       
    }
    

    public void allNumbersOdd(int hasta) {
        for(int i=0; i<=255; i++){
            i++;
            System.out.println(i);
        }       
    }
    
    
    public void allNumbersSum(int hasta) {
        int suma = 0;
        for(int i=1; i<=255; i++){
            suma +=i;
            System.out.print("Nuevo numero : " + i);
            System.out.println("  Suma : " + suma);
        }       
    }
    

    public void tourArrangement() {
        int [] myArray = {1,3,5,7,9,13,2};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
          }
    }


    public void foundMax(){
        int[] lista = {9, 3,-5, 7};
        int maximo = lista[0];
        for(int i=0; i<lista.length; i++){
            if (maximo < lista[i]){
                maximo = lista[i];
            }
        }
        System.out.println("El Maximo es : " + maximo);
    }
    

    public void findAverage(){
        int[] lista = {2, 10, 3, 3, 8, 24};
        int suma = 0;
        for(int i=0; i<lista.length; i++){
            suma +=lista[i];
        }
        System.out.println("El Promedio es : " + (suma/lista.length));
    }
    
   
    public void  oddArrangements(int hasta){
        int [] array1;
        array1 = new int[hasta];

        for(int i=0; i <= hasta-1; i++){
            array1[i] = i;
        }
        System.out.println(Arrays.toString(array1));
    }
    
	 
	public void mayoresQueY(int[] miArray, int numero) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		for(int i=0; i < miArray.length ; i++) {
			if (miArray[i] > numero) {
				lista1.add(miArray[i]);
			}			
		}
		System.out.println(lista1);		
	}
	
    
	public void valoresAlCuadrado(int[] miArray2) {
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		for (int i=0; i < miArray2.length; i++) {
			lista2.add(miArray2[i] * miArray2[i]);
		}
		System.out.println(lista2);		
	}
	
	
	public void eliminaNegativos(int[] miArray3) {
		for (int i=0; i< miArray3.length; i++) {
			if(miArray3[i] < 0) {
				miArray3[i] = 0;
			}			
		}
		System.out.println(Arrays.toString(miArray3));		
	}
	
	
	public void maximoMinimoPromedio(int[] miArray4) {
		Object[] arrayFinal = new Object[3];
		Double suma = 0.0;
		Integer min = miArray4[0];
		Integer max = miArray4[0];
		for (int i=0; i < miArray4.length; i++) {
			if (miArray4[i] < min) {
				min = miArray4[i];				
			}
			if (miArray4[i] > max) {
				max = miArray4[i];				
			}
			suma += miArray4[i];			
		}
		arrayFinal[0] = min;
		arrayFinal[1] = max;
		arrayFinal[2] = (suma / miArray4.length);
		System.out.println(Arrays.toString(arrayFinal));		
	}
	
	
	public void cambiarValores(int[] miArray5) {
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		for (int i=0; i< miArray5.length; i++){
			if (i+1 == miArray5.length) {
				lista3.add(0);
			} else {
				lista3.add(miArray5[i+1]);
			}
		}		
		System.out.println(lista3);		
	}	
    
}
