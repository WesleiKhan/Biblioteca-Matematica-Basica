package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Media;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MediaTest {

    private final Media media = new MediaCore();

    @Test
    void mediaAritmeticaSimples() {

        double[] elementos = {4.0, 5.0, 9.0};

        assertEquals(6.0, media.mediaAritmeticaSimples(elementos));
    }

    @Test
    void mediaAritmeticaPonderada() {

        Map<Double, Double> elemestos = new HashMap<>();
        elemestos.put(5.0, 2.0);
        elemestos.put(7.0, 3.0);
        elemestos.put(8.0, 4.0);

        assertEquals(7.0, media.mediaAritmeticaPonderada(elemestos));

    }

    @Test
    void mediaGeometrica() {

        double[] elementos = {3.0, 8.0, 9.0};

        assertEquals(6.0, media.mediaGeometrica(elementos), 0.0001);
    }

    @Test
    void mediaHarmonica() {

        double[] elementos = {4.0, 5.0, 6.0};

        assertEquals(4.8648649, media.mediaHarmonica(elementos), 0.0001);
    }
}
