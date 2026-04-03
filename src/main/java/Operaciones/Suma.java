
package Operaciones;
import Interfaz.OperacionStrategy;

public class Suma implements OperacionStrategy {
    
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
    
}
