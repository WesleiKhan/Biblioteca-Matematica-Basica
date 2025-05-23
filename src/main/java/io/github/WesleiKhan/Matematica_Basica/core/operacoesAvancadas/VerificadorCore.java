package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Verificador;

public class VerificadorCore implements Verificador {

    @Override
    public boolean verificandoSeNumeroEPar(int numero) {
        return numero % 2 == 0;
    }

    @Override
    public boolean verificandoSeNumeroEPar(double numero) {
        return numero % 2 == 0;
    }

    @Override
    public boolean verificadoDeResto(int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }
}
