package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Fatoracao;
import io.github.WesleiKhan.Matematica_Basica.contract.FatoresMultiplicos;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

import java.util.List;


public class FatoresMultiplicosCore implements FatoresMultiplicos {

    OperacoesBasicas basicas = new OperacoesBasicasCore();

    Fatoracao fatoracao = new FatoracaoCore();

    @Override
    public int MMC(int a, int b) {

        List<Integer> divisores = fatoracao.fatoracaoComposta(a, b, true);

        int mmc = 1;

        for(int divisor: divisores) {

            mmc = basicas.multiplicacao(mmc, divisor);
        }

        return mmc;
    }

    @Override
    public int MDC(int a, int b) {

        List<Integer> divisores = fatoracao.fatoracaoComposta(a, b, false);

        int mmc = 1;

        for(int divisor: divisores) {

            mmc = basicas.multiplicacao(mmc, divisor);
        }

        return mmc;
    }

}
