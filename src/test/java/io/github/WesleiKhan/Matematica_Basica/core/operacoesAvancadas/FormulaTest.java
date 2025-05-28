package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Formula;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormulaTest {

    Formula formula = new FormulaCore();

    @Test
    void bhaskara() {

        int[] respostaEsperada = {2,-2};

        assertArrayEquals(respostaEsperada, formula.bhaskara(0,3,12));
    }
}
