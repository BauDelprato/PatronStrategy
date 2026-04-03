

package com.mycompany.patronstrategy;

import java.util.Scanner;
import Contexto.Calculadora;
import Operaciones.*;


public class PatronStrategy {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Calculadora calculo = new Calculadora();

        System.out.print("Ingrese primer número: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Seleccione operación: + - * /");
        String op = sc.next();

        switch (op) {
            case "+":
                calculo.setEstrategia(new Suma());
                break;
            case "-":
                calculo.setEstrategia(new Resta());
                break;
            case "*":
                calculo.setEstrategia(new Multiplicacion());
                break;
            case "/":
                calculo.setEstrategia(new Division());
                break;
            default:
                System.out.println("Operación inválida");
                return;
        }

        double resultado = calculo.calcular(a, b);
        System.out.println("Resultado: " + resultado);
        
    }
}
