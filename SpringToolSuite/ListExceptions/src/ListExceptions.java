import java.util.ArrayList;

public class ListExceptions {

	public static void main(String[] args) {
		
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		for(int i = 0; i < myList.size(); i++) {
			try {
				Integer castedValue2 = Integer.parseInt(myList.get(i).toString());
				System.out.println(castedValue2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}		    
		}

	}

}
