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
}
