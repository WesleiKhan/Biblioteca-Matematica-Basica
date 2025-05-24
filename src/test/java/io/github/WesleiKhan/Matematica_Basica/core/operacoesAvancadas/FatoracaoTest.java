package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Fatoracao;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FatoracaoTest {

    Fatoracao fatoracao = new FatoracaoCore();

    List<Integer> divisores = new ArrayList<>();

    @Test
    void fatoracaoSimples() {

        divisores.add(2);
        divisores.add(3);
        divisores.add(5);

        assertEquals(divisores, fatoracao.fatoracaoSimples(30));

    }

    @Test
    void fatoracaoCompostaParaMMC() {

        divisores.add(2);
        divisores.add(2);
        divisores.add(3);
        divisores.add(5);

        assertEquals(divisores, fatoracao.fatoracaoCompostaParaMMC(20, 30));

    }

    @Test
    void fatoracaoCOmpostaParaMDC() {

        divisores.add(2);
        divisores.add(5);

        assertEquals(divisores, fatoracao.fatoracaoCompostaParaMDC(20, 30));

    }
}
