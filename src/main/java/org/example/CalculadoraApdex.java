package org.example;

//Juan Pablo Ruiz de Souza , rm: 557727
public class CalculadoraApdex {
    public static double calcular(double satisfatorio, double toleravel, double totalAmostras) {
        double resultado = (satisfatorio + (toleravel / 2)) / totalAmostras;
        return Math.round(resultado * 100.0) / 100.0;
    }
}
