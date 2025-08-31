package NIvelIntermediario.gettersAndSetters;


public class uzumaki extends ninja {
    public uzumaki() {
    }

    public uzumaki(String nome, String aldeia, int idade, double altura) {
        super(nome, aldeia, idade, altura);
    }
    public void apresentacao(){
        System.out.println("meu nome é: " + getNome());
        System.out.println("minha aldeia é: " + getAldeia());
        System.out.println("minha idade é: " + getIdade());
        System.out.println("minha altura é: " + getAltura());
    }
}
