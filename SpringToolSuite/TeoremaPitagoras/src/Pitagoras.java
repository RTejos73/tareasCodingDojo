
public class Pitagoras {

	public double calcularHipotenusa(double catetoA, double catetoB){
        double c = (catetoA*catetoA) + (catetoB * catetoB);
        double result = Math.sqrt(c);
        return result;

    }
}
