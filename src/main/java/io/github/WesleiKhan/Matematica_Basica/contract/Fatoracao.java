package io.github.WesleiKhan.Matematica_Basica.contract;

import java.util.List;
import java.util.Map;

public interface Fatoracao {

    public Map<Integer, Integer> fatoracaoSimples(int numero);

    public Map<Integer,Integer> fatoracaoComposta(int a, int b, boolean IsMMC);


}
