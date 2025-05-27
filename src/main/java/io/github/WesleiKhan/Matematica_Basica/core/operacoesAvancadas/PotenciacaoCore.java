package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Potenciacao;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

public class PotenciacaoCore implements Potenciacao {

    private final OperacoesBasicas basicas = new OperacoesBasicasCore();

    @Override
    public int potencia(int base, int expoente) {

        int potencia = 1;

        for(int i = 0; i < expoente; i++) {

            potencia = basicas.multiplicacao(potencia, base);
        }

        return potencia;
    }

    @Override
    public double potencia(double base, int expoente) {

        double potencia = 1;

        for(int i = 0; i < expoente; i++) {

            potencia = basicas.multiplicacao(potencia, base);
        }

        return potencia;
    }

}
