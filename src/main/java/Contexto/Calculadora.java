
package Contexto;
import Interfaz.OperacionStrategy;

public class Calculadora {
    private OperacionStrategy estrategia; //variable que guarda la operación

    public void setEstrategia(OperacionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double a, double b) { //calcula según la operación
        if (estrategia == null) {
            throw new IllegalStateException("No se ha definido una estrategia");
        } else {
        return estrategia.calcular(a, b); 
        }
    }
}