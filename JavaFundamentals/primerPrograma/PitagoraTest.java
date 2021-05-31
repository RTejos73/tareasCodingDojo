import java.util.Scanner;
public class PitagoraTest {
    
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        Pitagoras pitagora = new Pitagoras();
        System.out.println("Ingrese cateto A :");
        double a = scaner.nextDouble();
        System.out.println("Ingrese cateto A :");
        double b = scaner.nextDouble();

        
        Double resultado = pitagora.calcularHipotenusa(a, b);
        System.out.println("Teoremo de Pitagora, con cateto a= "+a+" y cateto b= "+b+", la hiptenusa es : " + resultado);
    }
}
