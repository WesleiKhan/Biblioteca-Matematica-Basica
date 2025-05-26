package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Raiz;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

public class RaizCore implements Raiz {

    private final OperacoesBasicas operacao = new OperacoesBasicasCore();

    @Override
    public double raiz(double radicando, int indice) {

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

        while (operacao.subtracao(fim, inicio) > epsilon) {

            meio = operacao.adicao(inicio, fim) / 2;
            double quadrada = operacao.multiplicacao(meio, meio);

            if (quadrada > radicando) {
                fim = meio;
            }else {
                inicio = meio;
            }
        }

        return operacao.adicao(inicio, fim) / 2;
    }
}
