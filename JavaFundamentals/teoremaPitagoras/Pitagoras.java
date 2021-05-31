import java.lang.Math;

public class Pitagoras {

    public double calcularHipotenusa(Double catetoA, Double catetoB){
        double c = (catetoA*catetoA) + (catetoB * catetoB);
        double result = Math.sqrt(c);
        return result;

    }
}
