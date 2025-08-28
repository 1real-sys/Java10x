package NIvelIntermediario;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
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
