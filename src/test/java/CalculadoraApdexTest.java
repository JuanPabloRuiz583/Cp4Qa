import org.example.CalculadoraApdex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



//Juan Pablo Ruiz de Souza , rm: 557727
public class CalculadoraApdexTest {
    private static final double totalAmostras = 557727;
    private double satisfatorio;
    private double toleravel;

    @BeforeEach
    public void setUp() {
        // Reinicia os valores antes de cada teste
        satisfatorio = 400000;
        toleravel = 100000;
        System.out.println("Preparando dados para o próximo teste...");
    }

    @Test
    public void calculoApdexTeste1(){
       double resultado = CalculadoraApdex.calcular(satisfatorio, toleravel,totalAmostras);
       System.out.println("Resultado do cálculo: " + resultado);
       assertEquals(0.81,resultado, 0.001);

    }

}
