package NIvelIntermediario;

public abstract class Ninja {
    String nome;
    int idade;
    String Aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        Aldeia = aldeia;
    }

    //Criar um método publico personalizado
    // Métodos voids nao retornam valor nenhum!


    //Métodos com tipos definidos precisam retornar algo
    /*public String souUmNinja(){
        return "Oi, Sou um ninja!";
    }*/

    public void apresentarNinja(){
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e sou da " + Aldeia);
    }

    public int tempoParaSeTornarHokage(int idadeMinimaHokage){
        return idadeMinimaHokage - idade;

    }

    public void habilidadeEspecial(){
        System.out.println("Nome nome é " + nome + " e esse é o meu ataque especial.");
    }

}
