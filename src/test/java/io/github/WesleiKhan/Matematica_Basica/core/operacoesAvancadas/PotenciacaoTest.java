package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Potenciacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PotenciacaoTest {

    Potenciacao potenciacao = new PotenciacaoCore();

    @Test
    void pontecia() {

        assertEquals(256, potenciacao.potencia(2, 8));
    }
}
