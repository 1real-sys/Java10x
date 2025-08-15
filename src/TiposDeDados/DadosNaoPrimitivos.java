package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
           /*
           String, array, Class, enum
           Objetivo: Criar um ninja, e atribuir métodos a ele.

            */
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println(nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Aldeia da Folha");

        String nome2 = "Sasuke";
        System.out.println(nome2.length());
        String nome2Concat = nome2.concat(" Uchiha");
        System.out.println(nome2Concat);
        System.out.println(nome2Concat.length());

    }
}
