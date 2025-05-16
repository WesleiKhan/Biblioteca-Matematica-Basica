package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.RaizQuadrada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RaizQuadradaTest {

    RaizQuadrada raiz = new RaizQuadradaCore();

    @Test
    void descobrirRaizQuadrada() {

        assertEquals(7.0000, raiz.descobrirRaizQuadrada(49), 0.00001);
    }
}
