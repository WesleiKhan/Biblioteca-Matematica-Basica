package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Media;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Raiz;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

import java.util.Map;

public class MediaCore implements Media {

    private final OperacoesBasicas basicas = new OperacoesBasicasCore();

    private final Raiz raiz = new RaizCore();

    @Override
    public double mediaAritmeticaSimples(double[] elementos) {

        int numeroDeElementos = elementos.length;

        double resultado = 0;

        for (double elemento: elementos) {

            resultado = basicas.adicao(resultado, elemento);

        }

        return basicas.divisao(resultado, numeroDeElementos);
    }

    @Override
    public double mediaAritmeticaPonderada(Map<Double, Double> elementos) {

        double valores = 0;
        double peso = 0;

        for (Map.Entry<Double, Double> elemento: elementos.entrySet()) {

            valores = basicas.adicao(valores, basicas.multiplicacao(elemento.getKey(),
                    elemento.getValue()));

            peso = basicas.adicao(peso, elemento.getValue());
        }

        return basicas.divisao(valores, peso);
    }

    @Override
    public double mediaGeometrica(double[] elementos) {

        int numeroDeElementos = elementos.length;

        double valore = 1.0;

        for (double elemento: elementos) {

            valore = basicas.multiplicacao(valore, elemento);
        }

        return raiz.raiz(valore, numeroDeElementos);
    }

    @Override
    public double mediaHarmonica(double[] elementos) {

        int numeroDeElementos = elementos.length;

        double valor = 0;

        for (double elemento: elementos) {

            valor = basicas.adicao(valor, basicas.divisao(1.0, elemento));
        }

        return basicas.divisao(numeroDeElementos, valor);
    }
}
