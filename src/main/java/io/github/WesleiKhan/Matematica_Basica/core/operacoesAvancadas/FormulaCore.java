package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Formula;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Potenciacao;
import io.github.WesleiKhan.Matematica_Basica.contract.Raiz;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

public class FormulaCore implements Formula {

    OperacoesBasicas basicas = new OperacoesBasicasCore();

    Raiz raiz = new RaizCore();

    Potenciacao potenciacao = new PotenciacaoCore();

    @Override
    public int[] bhaskara(int b, int a, int c) {

        int operacaoDelta = basicas.subtracao(potenciacao.potencia(b, 2),
                basicas.multiplicacao(basicas.multiplicacao(-4, a), c));

        int resultadoDelta = (int) basicas.adicao(raiz.raiz(operacaoDelta),
                0.5);

        int divisor = basicas.multiplicacao(a, 2);

        int menosB = basicas.multiplicacao(b, -1);

        int resultadoMais = basicas.divisao(basicas.adicao(menosB,
                resultadoDelta), divisor);

        int resultadoMenos = basicas.divisao(basicas.subtracao(menosB,
                resultadoDelta), divisor);

        if (resultadoMais != 0 && resultadoMenos != 0) {

            return new int[] {resultadoMais, resultadoMenos};

        } else if (resultadoMais != 0 && resultadoMenos == 0) {

            return new int[] {resultadoMais};

        } else if (resultadoMais == 0 && resultadoMenos != 0) {

            return new int[] {resultadoMenos};

        }

        return new int[] {};
    }
}
