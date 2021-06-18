
public class NotebookP {

	public static void main(String[] args) {
		Notebook note1 = new Notebook();
		Notebook note2 = new Notebook();
		Notebook note3 = new Notebook();
		
		note1.name_so = "Windows";
		note1.name_user = "Rene Tejos";
		note1.version_so = "XP";
		note1.cant_discos = 1;
		note1.dir_name = "C";
		
		note2.name_so = "Apple";
		note2.name_user = "Rene Tejos";
		note2.version_so = "Catalina";
		note2.cant_discos = 2;
		note2.dir_name = "D";
		
		note3.name_so = "Linux";
		note3.name_user = "Rene Tejos";
		note3.version_so = "10";
		note3.cant_discos = 3;
		note3.dir_name = "E";
		
		System.out.println("Estado Actual del Notebock 1 es " + note1.Estado(false));
		System.out.println("Se encendera el Notebock 1");
		System.out.println("Estado Actual del Notebock 1 es " + note1.Estado(true));
		
		System.out.println("Caracteristicas del Notebook 1 son ");
		System.out.println("Sistema Opertivo " + note1.name_so);
		System.out.println("Usuario del Sistema " + note1.name_user);
		System.out.println("Version del S.O. " + note1.version_so);
		System.out.println("Cantidas de Discos " + note1.cant_discos);
		System.out.println("Directorio del Sistema " + note1.dir_name);
		
		note1.ConexionInternet(false);
		note1.Archivos(true);
		System.out.println("\n");
		
		//
		
		
		System.out.println("Estado Actual del Notebock 2 es " + note2.Estado(true));
		System.out.println("Se encendera el Notebock 2");
		System.out.println("Estado Actual del Notebock 2 es " + note2.Estado(false));
		
		System.out.println("Caracteristicas del Notebook 2 son ");
		System.out.println("Sistema Opertivo " + note2.name_so);
		System.out.println("Usuario del Sistema " + note2.name_user);
		System.out.println("Version del S.O. " + note2.version_so);
		System.out.println("Cantidas de Discos " + note2.cant_discos);
		System.out.println("Directorio del Sistema " + note2.dir_name);
		
		note1.ConexionInternet(true);
		note1.Archivos(true);
		System.out.println("\n");
		//
		System.out.println("Estado Actual del Notebock 3 es " + note3.Estado(true));
		System.out.println("Se encendera el Notebock 3");
		System.out.println("Estado Actual del Notebock 3 es " + note3.Estado(true));
		
		System.out.println("Caracteristicas del Notebook 3 son ");
		System.out.println("Sistema Opertivo " + note3.name_so);
		System.out.println("Usuario del Sistema " + note3.name_user);
		System.out.println("Version del S.O. " + note3.version_so);
		System.out.println("Cantidas de Discos " + note3.cant_discos);
		System.out.println("Directorio del Sistema " + note3.dir_name);
		
		note1.ConexionInternet(false);
		note1.Archivos(false);
		System.out.println("\n");
		
		
		
		
		
	}

}
