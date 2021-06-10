import java.util.ArrayList;

public class Arreglos {

    public static void main(String[] args) {
        
        // Declaración, inicialización y adición de valores en pasos separados:
        int[] myArray; //Declaración
        myArray = new int[5]; // Inicialización
        myArray[0] = 4; // agregar valor
        myArray[1] = 8; // agregar valor
        myArray[2] = 8; // agregar valor
        myArray[3] = 5; // agregar valor
        myArray[4] = 9; // agregar valor

        // Todo de una vez:
        int[] myArray2 = {4, 8, 8, 5, 9};

        // esto de seclara al pincipio import java.util.ArrayList;
        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        myArray3.add(10);
        int num = myArray3.get(0);

        //¿Qué pasa si quiere agregar elementos de que son de diferente tipo? Bueno, todos los objects son heredados de la clase Object. Por lo tanto, podemos tener nuestro generics como un objeto y agregar diferentes tipos de objeto. Por ejemplo:
        //import java.util.ArrayList;
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add("Hola");
        list.add(new ArrayList<Integer>());
        list.add(new Double(12.0)); //Agregando un Double con valor 12.0
        System.out.println(list); // [10, "Hola", [], 12.0]

        // Revisar la documentación de ArrayList. Los métodos más utilizados son: add, clear, clone, contains, get, indexOf, isEmpty, remove, size. Pruébalos y mira lo que puedes hacer con la clase ArrayList. 
    }



}
