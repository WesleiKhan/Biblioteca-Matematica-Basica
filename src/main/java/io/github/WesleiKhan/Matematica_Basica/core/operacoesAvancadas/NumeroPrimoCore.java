package io.github.WesleiKhan.Matematica_Basica.core.operacoesAvancadas;

import io.github.WesleiKhan.Matematica_Basica.contract.NumeroPrimo;
import io.github.WesleiKhan.Matematica_Basica.contract.RaizQuadrada;

import java.util.ArrayList;
import java.util.List;

public class NumeroPrimoCore implements NumeroPrimo {

    private RaizQuadrada raiz = new RaizQuadradaCore();

    int[] numeros = new int[100_000];

    @Override
    public List<Integer> numerosPrimos() {
        this.gerarListaDeNumero();
        int[] numeros = this.numeros;
        List<Integer> primos = new ArrayList<>();

        for(int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                primos.add(numeros[i]);
            }
        }

        return primos;
    }

    @Override
    public boolean ehPrimo(int numero) {

        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        for (int i = 3; i < this.raiz.descobrirRaizQuadrada(numero); i += 2) {
            if (numero % i == 0) return false;
        }

        return true;
    }

    private void gerarListaDeNumero() {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
    }
}
