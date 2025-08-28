package NIvelIntermediario;

public class Haruno extends Ninja{

    public Haruno() {
    }

    public Haruno(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }


    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial: Punho de Titânio");
    }
    /*
            O método byakugou é importado da interface ByakugouStatus
             */
    public void Byakugou(){
        System.out.println("Meu nome é " + nome +" os 100 selos foram quebrados, Byakugou ativado!");
    }
}
