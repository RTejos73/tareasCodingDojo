
public class Notebook {
	
	String name_so;
	String name_user;
	int cant_discos;
	String version_so;
	String dir_name;
	
	
	public String Estado(boolean estado ) {		
		String resp;
		if(estado) {
			resp = "Encendido";
		}else {
			resp = "Apagado";
		}
		
		return resp;
	}

	public void  ConexionInternet(boolean internet ) {
		if(internet) {
			System.out.println("El equipo esta con conexion a Internet");
		}else {
			System.out.println("El equipo no esta con conexion a Internet");
		}		
	}
	
	public void Archivos(boolean archivo) {
		if(archivo) {
			System.out.println("Se subieron los archivos a la web");
		} else {
			System.out.println("Archivos no subidos a la web");
		}
		
		
	}
	
	

}
