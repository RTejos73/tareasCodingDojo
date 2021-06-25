
public class Project {
	
	private String nombre;
	private String descripcion;
	double initialCost;
	
	
	// constructor vacio
	public Project() {
		
	}
	

	// constructor solo parametro nombre
	public Project(String nombre) {
		this.nombre = nombre;
		
	}


	// constructor con ambos parametros
	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getInitialCost() {
		return initialCost;
	}


	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	
	//   metodos de la clase
	
	


	public String elavatorPitch() {
				
		return nombre + "  (" + initialCost + ")  : " + descripcion;
	}


	@Override
	public String toString() {
		return "Projecto [nombre= " + nombre + ", descripcion= " + descripcion + ", Costo Inicial= " + initialCost + " UF]\n";
	}
	
	

}
