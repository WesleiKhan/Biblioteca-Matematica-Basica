package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Fatoracao;
import io.github.WesleiKhan.Matematica_Basica.contract.FatoresMultiplicos;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Potenciacao;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

import java.util.HashMap;
import java.util.Map;


public class FatoresMultiplicosCore implements FatoresMultiplicos {

    OperacoesBasicas basicas = new OperacoesBasicasCore();

    Fatoracao fatoracao = new FatoracaoCore();

    Potenciacao potenciacao = new PotenciacaoCore();

    @Override
    public int MMC(int a, int b) {

        Map<Integer, Integer> divisores = fatoracao.fatoracaoComposta(a, b, true);

        int mmc = 1;

        for(Map.Entry<Integer, Integer> valores: divisores.entrySet()) {

            int divisor = potenciacao.potencia(valores.getKey(),
                    valores.getValue());

            mmc = basicas.multiplicacao(mmc, divisor);
        }

        return mmc;
    }

    @Override
    public int MDC(int a, int b) {

        Map<Integer, Integer> divisores = fatoracao.fatoracaoComposta(a, b,
                false);

        int mmc = 1;

        for(Map.Entry<Integer, Integer> valores: divisores.entrySet()) {

            int divisor = potenciacao.potencia(valores.getKey(),
                    valores.getValue());

            mmc = basicas.multiplicacao(mmc, divisor);
        }

        return mmc;
    }

    @Override
    public int MMC(int a, int b, int c) {

        Map<Integer, Integer> divisoresA = fatoracao.fatoracaoSimples(a);
        Map<Integer, Integer> divisoresB = fatoracao.fatoracaoSimples(b);
        Map<Integer, Integer> divisoresC = fatoracao.fatoracaoSimples(c);

        Map<Integer, Integer> divisores = this.calculaDivisores(divisoresA,
                divisoresB, divisoresC);

        int mmc = 1;

        for(Map.Entry<Integer, Integer> valores: divisores.entrySet()) {

            int divisor = potenciacao.potencia(valores.getKey(),
                    valores.getValue());

            mmc = basicas.multiplicacao(mmc, divisor);
        }

        return mmc;
    }

    private Map<Integer, Integer> calculaDivisores(Map<Integer, Integer> fatoresA,
                                                   Map<Integer, Integer> fatoresB,
                                                   Map<Integer, Integer> fatoresC) {

        Map<Integer, Integer> divisores = new HashMap<>(fatoresA);

        for (Map.Entry<Integer, Integer> fator: fatoresB.entrySet()) {

            if (divisores.containsKey(fator.getKey()) &&
                    divisores.get(fator.getKey()) < fator.getValue()) {

                divisores.put(fator.getKey(), fator.getValue());

            } else if (!divisores.containsKey(fator.getKey())) {

                divisores.put(fator.getKey(), fator.getValue());

            }
        }

        for (Map.Entry<Integer, Integer> fator: fatoresC.entrySet()) {

            if (divisores.containsKey(fator.getKey()) &&
                    divisores.get(fator.getKey()) < fator.getValue()) {

                divisores.put(fator.getKey(), fator.getValue());

            } else if (!divisores.containsKey(fator.getKey())) {

                divisores.put(fator.getKey(), fator.getValue());

            }
        }

        return divisores;

    }

}
