package io.github.WesleiKhan.Matematica_Basica.contract;

import java.util.List;

public interface Fatoracao {

    public List<Integer> fatoracaoSimples(int numero);

    public List<Integer> fatoracaoCompostaParaMMC(int a, int b);

    public List<Integer> fatoracaoCompostaParaMDC(int a, int b);

}
