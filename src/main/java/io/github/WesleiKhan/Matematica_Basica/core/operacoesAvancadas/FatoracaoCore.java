package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Fatoracao;
import io.github.WesleiKhan.Matematica_Basica.contract.NumeroPrimo;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Verificador;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

import java.util.ArrayList;
import java.util.List;

public class FatoracaoCore implements Fatoracao {

    NumeroPrimo primo = new NumeroPrimoCore();

    Verificador verificador = new VerificadorCore();

    OperacoesBasicas basicas = new OperacoesBasicasCore();

    @Override
    public List<Integer> fatoracaoDeInteiros(int numero) {

        List<Integer> primos = primo.numerosPrimos();

        List<Integer> divisores = new ArrayList<>();

        for (int i = 0; i < primos.size() && numero > 1;) {

            int primoAtual = primos.get(i);

            if (primoAtual > numero) break;

            if (verificador.verificadoDeResto(numero, primoAtual)) {

                numero = basicas.divisao(numero, primoAtual);

                divisores.add(primoAtual);

            } else {
                i++;
            }
        }

        return divisores;

    }
}
