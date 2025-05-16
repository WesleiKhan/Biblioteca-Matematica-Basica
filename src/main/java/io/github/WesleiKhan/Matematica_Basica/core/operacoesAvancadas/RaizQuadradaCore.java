package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.RaizQuadrada;

public class RaizQuadradaCore implements RaizQuadrada {

    @Override
    public double descobrirRaizQuadrada(double radicando) {

        double epsilon = 0.00001;
        if (radicando < 0) {
            throw new IllegalArgumentException("Numero negativo não tem raiz" +
                    " quadrada.");
        }

        if (radicando == 0 || radicando == 1) {

            return radicando;
        }

        double inicio = 0;
        double fim = radicando;
        double meio = 0;

        while ((fim - inicio) > epsilon) {

            meio = (inicio + fim) / 2;
            double quadrada = meio * meio;

            if (quadrada > radicando) {
                fim = meio;
            }else {
                inicio = meio;
            }
        }

        return (inicio + fim) / 2;
    }
}
