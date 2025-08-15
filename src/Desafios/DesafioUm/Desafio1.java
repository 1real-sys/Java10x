package Desafios.DesafioUm;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        int idadeNinja = 16;
        String missaoNinja1 = "Fontes Termais";
        char dificuldadeDaMissao1 = 'C';
        String statusDaMissao1 = "Em andamento";

        if (idadeNinja < 15){
            if (dificuldadeDaMissao1 == 'C' || dificuldadeDaMissao1 == 'D'){
                statusDaMissao1 = "Concluida, Parabéns";
            }else {
                statusDaMissao1 = "Falhou, idade insuficiente";

            }
        }else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja);
        System.out.println("Missao do ninja: " + missaoNinja1);
        System.out.println("Dificuldade da missao : " + dificuldadeDaMissao1);
        System.out.println("Status da missao: " + statusDaMissao1);
        System.out.println("-----------------------");

        String nomeNinja2 = "konohamaru";
        int idadeNinja2 = 12;
        String missaoNinja2 = "Recuperar moedas";
        char dificuldadeDaMissao2 = 'D';
        String statusDaMissao2 = "Em andamento";

        if (idadeNinja2 < 15){
            if (dificuldadeDaMissao2 == 'C' || dificuldadeDaMissao2 == 'D'){
                statusDaMissao2 = "Concluida, Parabéns";
            }else {
                statusDaMissao2 = "Falhou, idade insuficiente";
            }
        }else {
            statusDaMissao2 = "Concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missao do ninja: " + missaoNinja2);
        System.out.println("Dificuldade da missao : " + dificuldadeDaMissao2);
        System.out.println("Status da missao: " + statusDaMissao2);
        System.out.println("-----------------------");


        String nomeNinja3 = "Kakashi";
        int idadeNinja3 = 27;
        String missaoNinja3 = "Ponte Kannabi";
        char dificuldadeDaMissao3 = 'S';
        String statusDaMissao3 = " Em andamento ";

        if (idadeNinja3 < 15){
            if (dificuldadeDaMissao3 == 'C' || dificuldadeDaMissao3 == 'D'){
                statusDaMissao3 = "Concluida, Parabéns";
            }else  {
                statusDaMissao3 = "Falhou, idade insuficiente";
            }
        }else {
            statusDaMissao3 = "Concluida";

        }

        System.out.println("-----------------------");
        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missao do ninja: " + missaoNinja3);
        System.out.println("Dificuldade da missao : " + dificuldadeDaMissao3);
        System.out.println("Status da missao: " + statusDaMissao3);
        System.out.println("-----------------------");





    }
}
