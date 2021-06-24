
public class ProjectTest {

	public static void main(String[] args) {
		
		
		Project proj1 = new Project();
		
		proj1.setNombre("Coding");
		proj1.setDescripcion("Estudiante de Java Full Stack");
		proj1.setInitialCost(5000);
		
		
		String resp = proj1.elavatorPitch();
		
		System.out.println(resp);

	}

}
