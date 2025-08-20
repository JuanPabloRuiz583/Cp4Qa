package org.example;

public class CalculadoraApdex {
    public static double calcular(double satisfatorio, double toleravel, double totalAmostras) {
        return (satisfatorio + (toleravel / 2))/ totalAmostras;
    }
}
