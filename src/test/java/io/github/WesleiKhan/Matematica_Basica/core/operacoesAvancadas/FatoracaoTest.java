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
    void fatoracaoDeInteiros() {

        divisores.add(2);
        divisores.add(3);
        divisores.add(5);

        assertEquals(divisores, fatoracao.fatoracaoDeInteiros(30));

    }
}
