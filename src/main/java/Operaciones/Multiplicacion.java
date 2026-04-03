
package Operaciones;
import Interfaz.OperacionStrategy;

public class Multiplicacion implements OperacionStrategy {
    
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
    
}
