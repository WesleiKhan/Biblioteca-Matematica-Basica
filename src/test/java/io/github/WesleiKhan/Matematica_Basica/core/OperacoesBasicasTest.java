package io.github.WesleiKhan.Matematica_Basica.core;

import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacoesBasicasTest {

    OperacoesBasicas operacao = new OperacoesBasicasCore();

    @Test
    void testAdicaoInt() {
        assertEquals(5, operacao.adicao(2, 3));
    }

    @Test
    void testAdicaoDouble() {
        assertEquals(5.5, operacao.adicao(2.0, 3.5), 0.0001);
    }

    @Test
    void testSubtracaoInt() {
        assertEquals(1, operacao.subtracao(4, 3));
    }

    @Test
    void testSubtracaoDouble() {
        assertEquals(1.0, operacao.subtracao(4.0, 3.0));
    }

    @Test
    void testDivisaoInt() {
        assertEquals(2, operacao.divisao(4, 2), 0);
    }

    @Test
    void testDivisaoDouble() {
        assertEquals(2.0, operacao.divisao(4.0, 2.0), 0.0001);
    }

    @Test
    void testMultiplicacaoInt() {
        assertEquals(12, operacao.multiplicacao(3, 4));
    }

    @Test
    void testMultiplicacaoDouble() {
        assertEquals(12.0, operacao.multiplicacao(3.0, 4.0));
    }
}
