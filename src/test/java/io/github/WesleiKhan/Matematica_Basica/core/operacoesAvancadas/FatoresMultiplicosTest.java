package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.FatoresMultiplicos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FatoresMultiplicosTest {

    FatoresMultiplicos fatoresMultiplicos = new FatoresMultiplicosCore();

    @Test
    void MMC() {

        assertEquals(60, fatoresMultiplicos.MMC(20, 30));
    }
}
