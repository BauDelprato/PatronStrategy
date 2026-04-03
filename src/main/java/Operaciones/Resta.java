
package Operaciones;
import Interfaz.OperacionStrategy;

public class Resta implements OperacionStrategy {
    
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
