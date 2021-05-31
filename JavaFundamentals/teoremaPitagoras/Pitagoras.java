import java.lang.Math;

public class Pitagoras {

    public double calcularHipotenusa(int catetoA, int catetoB){
        double c = (catetoA*catetoA) + (catetoB * catetoB);
        double result = Math.sqrt(c);
        return result;

    }
}
