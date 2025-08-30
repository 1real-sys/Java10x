package NIvelIntermediario;

public class Uzumaki extends Ninja {


    Bijuu bijuu;

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }
    public Uzumaki(String nome, int idade, String aldeia, Bijuu bijuu) {
        super(nome, idade, aldeia);
        this.bijuu = bijuu;
    }


    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial: Rasengan!");
    }

    /*
            método da interface modoSabioStatus
             */
    public void modoSabio(){
        System.out.println("Energia natural foi acumulada, modo sábio ativo!");
    }

}
