package Questionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gabarito {

    List<Character> gabarito = Arrays.asList('A', 'F');
    //List<Character> gabarito = new ArrayList<>();

    public char respostaQuestao(int numeroQuestao) {
        char resposta;
        resposta = gabarito.get(numeroQuestao - 1);
        return resposta;
    }

    //acertos - retorna a quantidade de questões que o aluno acertou
    public int acertos(Prova prova) {
        int cont = 0;

        for (int i = 0; i < gabarito.size(); i++) {
        //for (int i = 0; i < prova.prova; i++) {
           //if (!gabarito.get(i).equals(prova)) {
                if(!prova.getClass().equals(gabarito)){
                //if (gabarito == prova) {
                //if (!prova.equals(prova1)) {
                cont++;
            }
        }
       // }
        return cont;
    }
}
