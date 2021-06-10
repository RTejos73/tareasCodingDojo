import java.lang.Math;

public class TeoremaPitagoras {

	public static void main(String[] args) {
		Pitagoras pitagora = new Pitagoras();
		
		double llamar = pitagora.calcularHipotenusa(5, 3);
		System.out.println("La Hipotenusa es : " + llamar);
	}
	

}
