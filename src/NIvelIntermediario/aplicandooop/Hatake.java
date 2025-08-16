package NIvelIntermediario.aplicandooop;

public class Hatake extends Ninja implements Sharingan, Ambu {

    public Hatake() {
        super();
    }

    public Hatake(String nome, String cla, int idade) {
        super(nome, cla, idade);
    }

    public Hatake(String nome, String cla, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, cla, idade, numeroDeMissoes, rank);
    }

    public void fizParteDaAmbu() {
        System.out.println("Eu " + nome + " fiz parte do grupo de elite ambu");
    }

    @Override
    public void ativarSharingan() {
        System.out.println("Meu nome é " + nome + ", ativei o sharingan");
    }

    public void estrategiaEspecialNinja() {
        System.out.println("Minha estrategia ninja são os cachorros de elite");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Minha habilidade especial é o raikiri");
    }
}
