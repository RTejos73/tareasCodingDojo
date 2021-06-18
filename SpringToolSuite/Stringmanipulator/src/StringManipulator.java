
public class StringManipulator {

	 public String trimAndConcat(String cadena1, String cadena2){
	        String rest;

	        rest = cadena1.trim()+cadena2.trim();

	        return rest;
	    } 

	    public int getIndexOrNull(String cad1, char letter) {
	        
	        return cad1.indexOf(letter);
	    }

	    public int getIndexOrNull(String cad1, String cad2) {
	        
	        return cad1.indexOf(cad2);
	    }

	    public String concatSubstring(String cad1, int a1, int a2, String cad2){

	        String abc = cad1.substring(a1, a2);
	        return abc.concat(cad2);
	    }
	    
}
