package NIvelIntermediario;

public class Hyuga extends Ninja {
    public Hyuga() {
    }

    public Hyuga(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }


    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial: Jyuuken");
    }
    /*
            O método byakugan é importado da interface ByakuganStatus
             */
    public void byakugan(){
        System.out.println("Meu nome é " + nome +" ,sou uma Hyuga, Byakugan ativado!");
    }
}
