package io.github.WesleiKhan.Matematica_Basica.core;

import io.github.WesleiKhan.Matematica_Basica.contract.OperacoesBasicas;

public class OperacoesBasicasCore implements OperacoesBasicas {

    @Override
    public int adicao(int parcelaA, int parcelaB) {
        return parcelaA + parcelaB;

    }

    @Override
    public double adicao(double parcelaA, double parcelaB) {
        return parcelaA + parcelaB;

    }

    @Override
    public int subtracao(int minuendo, int subtraindo) {
        return minuendo - subtraindo;

    }

    @Override
    public double subtracao(double minuendo, double subtraindo) {
        return minuendo - subtraindo;

    }

    @Override
    public int divisao(int dividendo, int divisor) {
        return dividendo / divisor;

    }

    @Override
    public double divisao(double dividendo, double divisor) {
        return dividendo / divisor;

    }

    @Override
    public int multiplicacao(int fatorA, int fatorB) {
        return fatorA * fatorB;

    }

    @Override
    public double multiplicacao(double fatorA, double fatorB) {
        return fatorA * fatorB;
    }
}
