package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
           Ternarios, para substituir o if e else, reduzindo o codigo
           variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
        */

        short numeroDeMissoes = 19;
        String nivelDoNinja = (numeroDeMissoes > 20) ? "O nível do ninja é chunnin, pois passou de 20 missões" : "O ninja ainda não tem 20 missões concluidas, deve ser um genin";
        System.out.println(nivelDoNinja);

    }
}
