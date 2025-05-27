package io.github.WesleiKhan.Matematica_Basica.contract;

import java.util.Map;

public interface Media {

    public double mediaAritmeticaSimples(double[] elementos);

    public double mediaAritmeticaPonderada(Map<Double, Double> elementos);

    public double mediaGeometrica(double[] elementos);

    public double mediaHarmonica(double[] elementos);
}
