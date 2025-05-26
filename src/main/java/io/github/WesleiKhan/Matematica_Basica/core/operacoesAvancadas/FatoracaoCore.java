package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.Fatoracao;
import io.github.WesleiKhan.Matematica_Basica.contract.NumeroPrimo;
import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;
import io.github.WesleiKhan.Matematica_Basica.contract.Verificador;
import io.github.WesleiKhan.Matematica_Basica.core.OperacoesBasicasCore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FatoracaoCore implements Fatoracao {

    private final NumeroPrimo primo = new NumeroPrimoCore();

    private final Verificador verificador = new VerificadorCore();

    private final OperacoesBasicas basicas = new OperacoesBasicasCore();

    @Override
    public Map<Integer, Integer> fatoracaoSimples(int numero) {

        List<Integer> primos = primo.numerosPrimos();

        Map<Integer, Integer> divisores = new HashMap<>();

        for (int i = 0; i < primos.size() && numero > 1;) {

            int primoAtual = primos.get(i);

            if (primoAtual > numero) break;

            if (verificador.verificadoDeResto(numero, primoAtual)) {

                numero = basicas.divisao(numero, primoAtual);

                divisores.put(primoAtual, divisores.getOrDefault(primoAtual,
                 0) + 1);

            } else {
                i++;
            }
        }

        return divisores;

    }

    @Override
    public Map<Integer, Integer> fatoracaoComposta(int a, int b, boolean IsMMC) {

        List<Integer> primos = primo.numerosPrimos();

        Map<Integer, Integer> divisores = new HashMap<>();

        for (int i = 0; i < primos.size() && a > 1 && b > 1;) {

            int primoAtual = primos.get(i);

            if (primoAtual > a && primoAtual > b) break;

            if (verificador.verificadoDeResto(a, primoAtual)
                    && verificador.verificadoDeResto(b, primoAtual)) {

                a = basicas.divisao(a, primoAtual);
                b = basicas.divisao(b, primoAtual);

                divisores.put(primoAtual, divisores.getOrDefault(primoAtual,
                 0) + 1);

            }else if(verificador.verificadoDeResto(a, primoAtual)
                    && !verificador.verificadoDeResto(b, primoAtual)) {

                a = basicas.divisao(a, primoAtual);

                if (IsMMC) divisores.put(primoAtual, divisores.getOrDefault(primoAtual,
                                0) + 1);

            } else if (!verificador.verificadoDeResto(a, primoAtual)
                    && verificador.verificadoDeResto(b, primoAtual)) {

                b = basicas.divisao(b, primoAtual);

                if (IsMMC) divisores.put(primoAtual, divisores.getOrDefault(primoAtual,
                        0) + 1);

            } else {
                i++;
            }
        }

        return divisores;
    }

}
