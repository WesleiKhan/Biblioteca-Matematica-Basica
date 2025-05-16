package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.NumeroPrimo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroPrimoTest {

    NumeroPrimo primo = new NumeroPrimoCore();
    List<Integer> primos = primo.numerosPrimos();

    @Test
    void numerosPrimos() {

        assertEquals(primos, primo.numerosPrimos());
    }

    @Test
    void ehPrimo_wihtValidInput() {

        assertEquals(true, primo.ehPrimo(5));
    }

    @Test
    void ehPrimo_whenInvalidInput() {

        assertEquals(false, primo.ehPrimo(9));
    }
}
