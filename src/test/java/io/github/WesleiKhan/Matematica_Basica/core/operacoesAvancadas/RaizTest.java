package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Raiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RaizTest {

    Raiz raiz = new RaizCore();

    @Test
    void descobrirRaizQuadrada() {

        assertEquals(7.0000, raiz.raiz(49), 0.00001);
    }

    @Test
    void descobrirRaizAoCubo() {

        assertEquals(8.3824653121, raiz.raiz(589, 3), 0.00001);
    }
}
