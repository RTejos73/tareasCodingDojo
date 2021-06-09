import javax.swing.event.CaretEvent;

public class Cadenas {
    public static void main(String[] args) {
        String ninja = "Coding Dojo es Increible";
        int length = ninja.length();
        System.out.println("La longitud de la cadena es : " + length);

        String cadena1 = "Mi nombre es ";
        String cadena2 = "Rene";
        String cadena3 = cadena1.concat(cadena2);
        System.out.println(cadena3);

        // format - ¡Otra manera de unir cadenas!
        String ninja2 = String.format("Hola %s, me debes $%.2f ",cadena2,25.0);
        System.out.println(ninja2);

        /* indexOf - El método indexOf busca de izquierda a derecha dentro de una cadena dada una cadena “objetivo”. El método indexOf() devuelve el índice (número de la posición) donde empieza por primera vez la cadena “objetivo” o devuelve -1 si no la encuentra.   */

        String ninja3 = "Bienvenido a Coding Dojo!";
        int a = ninja3.indexOf("Coding"); // a es 13
        int b = ninja3.indexOf("do"); // b es 8
        int c = ninja3.indexOf("pizza");

        /* trim - El método trim elimina todos los espacios en blanco al principio y al final de la cadena.  */
        String sentence = "   espacios en todos lados!   ";
        System.out.println(sentence.trim());

        // UpperCase y LowerCase - La clase String provee métodos para convertir a minúsculas y mayúsculas las cadenas.
        String aa = "HOLA";
        String bb = "mundo";
        System.out.println(aa.toLowerCase()); // hola
        System.out.println(bb.toUpperCase()); // MUNDO

        //Igualdad - Podemos comparar la igualdad entre cadenas de dos maneras. Referirnos al mismo objeto o a que tienen la misma secuencia de caracteres.
        String aaa = new String("palabra");
        String bbb = new String("palabra");
        System.out.println(aaa == bbb); // Falso. No son el mismo objeto.
        System.out.println(aaa.equals(bbb)); // Verdadero. Tienen exactamente los mismos caracteres.

    }
    
}
