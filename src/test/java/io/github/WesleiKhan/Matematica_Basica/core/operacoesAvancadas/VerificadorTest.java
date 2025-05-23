package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Verificador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerificadorTest {

    Verificador verificador = new VerificadorCore();

    @Test
    void verificandoSeNumeroEParInt_quandoEntradaEValida() {

        assertEquals(true, verificador.verificandoSeNumeroEPar(8));
    }

    @Test
    void verificandoSeNumeroEParInt_quandoEntradaEInvalida() {

        assertEquals(false, verificador.verificandoSeNumeroEPar(7));
    }

    @Test
    void verificandoSeNumeroEParDouble_quandoEntradaEValida() {

        assertEquals(true, verificador.verificandoSeNumeroEPar(8.0));
    }

    @Test
    void verificandoSeNumeroEParDouble_quandoEntradaEInvalida() {

        assertEquals(false, verificador.verificandoSeNumeroEPar(7.0));
    }

    @Test
    void verificadoDeResto_quandoEntradaEValida() {

        assertEquals(true, verificador.verificadoDeResto(30,2));
    }

    @Test
    void verificadoDeResto_quandoEntradaEInvalida() {

        assertEquals(false, verificador.verificadoDeResto(30,7));
    }

}
