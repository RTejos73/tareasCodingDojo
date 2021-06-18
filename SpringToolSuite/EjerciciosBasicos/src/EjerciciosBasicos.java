
public class EjerciciosBasicos {

	public static void main(String[] args) {


		// Escriba un m�todo que imprima todos los n�mero del 1 al 255.
        Metodos metodo1 = new Metodos();
        //  Metodos metodo2 = new Metodos();
        int[] array1 = {1,5,10,7,-2};

        metodo1.allNumbers(255);
        metodo1.allNumbersOdd(255);
        metodo1.allNumbersSum(255);
        metodo1.tourArrangement();
        metodo1.foundMax();
        metodo1.findAverage();
        metodo1.oddArrangements(255);
        metodo1.mayoresQueY(array1, 3);
        metodo1.valoresAlCuadrado(array1);
        metodo1.eliminaNegativos(array1);
        metodo1.maximoMinimoPromedio(array1);
        metodo1.cambiarValores(array1);      
        
        
        
	}

}
