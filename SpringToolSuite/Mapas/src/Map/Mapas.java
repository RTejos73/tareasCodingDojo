package Map;

import java.util.HashMap;
import java.util.Set;

public class Mapas {

	public static void main(String[] args) {
		HashMap<String, String> newHM = new HashMap<String, String>();

		newHM.put("nninja@codingdojo.com", "Nancy Ninja");
		newHM.put("ssamurai@codingdojo.com", "Sam Samurai");
		newHM.put("wwizard@codingdojo.com", "Walter Wizzard");
		
		String name = newHM.get("nninja@codingdojo.com");
		System.out.println("Nombre " + name);
		
		// recorrer un HashMap
		Set<String> keys = newHM.keySet();
		
		for(String key : keys) {
			System.out.print("Correo " + key);
			System.out.println("  Nombre " + newHM.get(key));
		}
		
	}

}
