package NIvelIntermediario;

public abstract class Ninja {
    String nome;
    int idade;
    String Aldeia;

    //Criar um método publico personalizado
    // Métodos voids nao retornam valor nenhum!


    //Métodos com tipos definidos precisam retornar algo
    public String souUmNinja(){
        return "Oi, Sou um ninja!";
    }

    public int tempoParaSeTornarHokage(int idadeMinimaHokage){
        return idadeMinimaHokage - idade;

    }

    public void habilidadeEspecial(){
        System.out.println("Nome nome é " + nome + " e esse é o meu ataque especial.");
    }

}
