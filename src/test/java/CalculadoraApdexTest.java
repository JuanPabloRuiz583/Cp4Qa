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
        System.out.println("Preparando dados para o próximo teste...");
    }

    @Test
    public void apdexExcelente() {
        double resultado = CalculadoraApdex.calcular(528000, 15000, totalAmostras);
        System.out.println("Apdex Excelente: " + resultado);
        assertEquals(0.96, resultado, 0.01);
    }

    @Test
    public void apdexBom() {
        double resultado = CalculadoraApdex.calcular(470000, 40000, totalAmostras);
        System.out.println("Apdex Bom: " + resultado);
        assertEquals(0.88, resultado, 0.01);
    }

    @Test
    public void apdexRazoavel() {
        double resultado = CalculadoraApdex.calcular(380000, 50000, totalAmostras);
        System.out.println("Apdex Razoável: " + resultado);
        assertEquals(0.73, resultado, 0.01);
    }

    @Test
    public void apdexRuim() {
        double resultado = CalculadoraApdex.calcular(300000, 50000, totalAmostras);
        System.out.println("Apdex Ruim: " + resultado);
        assertEquals(0.58, resultado, 0.01);
    }

    @Test
    public void apdexInaceitavel() {
        double resultado = CalculadoraApdex.calcular(100000, 50000, totalAmostras);
        System.out.println("Apdex Inaceitável: " + resultado);
        assertEquals(0.22, resultado, 0.01);
    }
}
