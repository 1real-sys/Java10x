package NIvelIntermediario.aplicandooop;

public class Uzumaki extends Ninja {

    public Uzumaki() {

    }

    public Uzumaki(String nome, String cla, int idade) {
        super(nome, cla, idade);
    }

    public Uzumaki(String nome, String cla, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, cla, idade, numeroDeMissoes, rank);
    }

    public void estrategiaEspecialNinja() {
        System.out.println("Minha estratégia envolve multiplos clones das sombras");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Minha habilidade especial é o rasengan!");
    }
}
