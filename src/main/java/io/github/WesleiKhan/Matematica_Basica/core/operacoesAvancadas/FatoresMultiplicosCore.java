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

        List<Integer> divisoresDeA = fatoracao.fatoracaoDeInteiros(a);
        List<Integer> divisoresDeB = fatoracao.fatoracaoDeInteiros(b);


        return 0;
    }

}
