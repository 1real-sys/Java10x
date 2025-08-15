package Condicoes;

public class ifEelse {
    public static void main(String[] args) {

        /*
        Passar o ninja de nivel de acordo com o número de missões
         */
         //Ninja Sasuke
        String nome = "Sasuke Uchiha";
        String rank;
        int idade =  14;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        }else if (numeroDeMissoes >= 20 ){
            System.out.println("Rank: Jounin");
        }
        else {
            System.out.println("Rank: Gennin");
        }

    }
}
