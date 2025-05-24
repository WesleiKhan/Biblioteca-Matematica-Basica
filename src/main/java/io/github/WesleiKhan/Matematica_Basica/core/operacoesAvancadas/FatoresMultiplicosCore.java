package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Fatoracao;
import io.github.WesleiKhan.Matematica_Basica.contract.FatoresMultiplicos;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Potenciacao;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

import java.util.List;
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

}
