public class Bucles {

    public static void main(String[] args) {
        
        // Bucle while

        int i = 0;
        while(i < 7)
        {
          System.out.println("foo");
           i++;
        }

        // bucle for
        for (int i = 0; i < 7; i++){
            System.out.println("bar");
        }
       
        //Veamos este código traducido al bucle while.
        
        int i = 0;
        while(i < 7)
        {
            System.out.println("bar");
            i++;
        }


        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int i = 0; i < dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));
        }

        // Bucle For Mejorado
        for(int i = 0; i < dynamicArray.size(); i++){
            String name = dynamicArray.get(i);
            System.out.println("hello " + name);
            // otras operaciones utilizando name
        }

        for(String name : dynamicArray){
            System.out.println("hello " + name);
            // otras operaciones utilizando name
        }
        




    }


}
