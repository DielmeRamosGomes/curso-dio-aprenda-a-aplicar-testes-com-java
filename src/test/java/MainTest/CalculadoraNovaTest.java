package MainTest;

import Main.CalculadoraNova;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarValores() {
        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(1, 2, 3);
        assertEquals(soma, soma);
    }

}
