package Tarea;
import java.util.HashMap;

public class CancionesHash {
	
	HashMap<String, String> canciones = new HashMap<String, String>();
	
	public void agregaCancion(String llave, String valor) {
		canciones.put(llave, valor);		
	}
	
	public String leeLirica(String llave) {
		String liric = canciones.get(llave);
		
		return liric;	
	}

}
