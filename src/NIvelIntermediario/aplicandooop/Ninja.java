package NIvelIntermediario.aplicandooop;

public abstract class Ninja implements estrategiaNinja {
    String nome;
    String cla;
    int idade;
    int numeroDeMissoes;
    NivelNinja rank;

    public Ninja() {

    }

    public Ninja(String nome, String cla, int idade) {
        this.nome = nome;
        this.cla = cla;
        this.idade = idade;
    }

    // TODO: SOBRECARGA DO CONSTRUTOR
    // TODO : SOBRECARGA DE MÉTODOS
    public Ninja(String nome, String cla, int idade, int numeroDeMissoes, NivelNinja rank) {
        this(nome, cla, idade);// referenciando novamente
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e minha habilidade é: ");
    }

    public void apresentacao() {
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade + " anos " + "e pertenço ao cla " + cla
                + " eu ja completei " + numeroDeMissoes + " missões.");
    }

    @Override
    public void estrategiaEspecialNinja() {
        System.out.println("Estratégia padrão");
    }
}
