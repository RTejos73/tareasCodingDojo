package JavaFundamentals.variables;

import java.lang.Thread.UncaughtExceptionHandler;

import javax.print.event.PrintJobListener;

public class Variables {
    public static void main(String[] args) {

        // Podemos declarar una variable sin valor.
        int nuestroInt;
        // Podemos asignar un valor a la variable, después en nuestro código.
        nuestroInt = 400;
        // También podemos declarar y asignar en la misma línea.
        double pi = 3.14159265;
        boolean bool = true;
        char unCaracter = 'A';
        String unaCadena = "ABC";

        String unidos = "Valor de int " + nuestroInt + ", de pi es " + pi + ", valor booleano " + bool + ", un char "
                + unCaracter + ", una cadena " + unaCadena;

        System.out.println(unidos);

        int i = 120;
        byte b = (byte) i;

        System.out.println(b);

        // byte	1 byte	-128 to 127
        // short	2 bytes	-32,768 to 32,767
        // int	4 bytes	-2,147,483,648 to 2,147,483, 647
        // long	8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	4 bytes	approximately ±3.40282347E+38F
        // double	8 bytes	approximately ±1.79769313486231570E+308
        // char	2 bytes	0 to 65,536
        // boolean	n/a	true of false

        long start = System.currentTimeMillis();
        // Integer sum = 0;
        int sum = 0;
        for (int j = 0; j < Integer.MAX_VALUE; j++) {
            sum += j;
        }
        System.out.println("Suma: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Tiempo de ejecucion: " + total + " segundos");

    }
}
