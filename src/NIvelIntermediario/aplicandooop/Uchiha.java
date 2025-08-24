package NIvelIntermediario.aplicandooop;

public class Uchiha extends Ninja implements Sharingan {

    public Uchiha() {
        super();// pegando o construtor vazio da superclasse
    }

    public Uchiha(String nome, String cla, int idade) {
        super(nome, cla, idade);// pegando o construtor com todos os parametros da super classe
    }

    public Uchiha(String nome, String cla, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, cla, idade, numeroDeMissoes, rank);
    }

    @Override
    public void ativarSharingan() {
        System.out.println("Meu nome é " + nome + ", ativei o sharingan");
    }

    @Override
    public void habilidadeEspecial() {
        switch (this.nome) {
            case "Sasuke Uchiha":
                System.out.println("O meu nome é " + nome + ", minha habilidade especial é o chidori!");
                break;
            case "Itachi Uchiha":
                System.out.println("O meu nome é " + nome + ", minha habilidade especial é o amaterasu!");
                break;
            default:
                System.out.println("O meu nome é " + nome + ", minha habilidade especial é o jutsu bola de fogo!");
        }
    }

    @Override
    public void estrategiaEspecialNinja() {
        System.out.println("Minha estratégia envolve shurikens com o jutsu bola de fogo");
    }
    @Override
    public void qiDeBatalha() {
        System.out.println("Essa é a minha inteligencia de combate, jutsus bola de fogo");
    }

    public void qideBatalha(int qi) {
        if (qi >= 180) {
            System.out.println("Esse é meu qi de batalha: " + qi + " (Genial)");
        } else if (qi >= 140) {
            System.out.println("Esse é meu qi de batalha: " + qi + " (Muito inteligente)");
        } else if (qi >= 110) {
            System.out.println("Esse é meu qi de batalha: " + qi + " (Médiano)");
        } else {
            System.out.println("Esse é meu qi de batalha: " + qi + " (Abaixo da média)");
        }
    }

}
