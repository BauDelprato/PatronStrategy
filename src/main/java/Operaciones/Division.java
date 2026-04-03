
package Operaciones;
import Interfaz.OperacionStrategy;

public class Division implements OperacionStrategy {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
