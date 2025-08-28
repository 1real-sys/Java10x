package NIvelIntermediario;

public class Uchiha extends Ninja{

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial Uchiha: Jutsu de fogo, flor de fenix!");
    }
    /*
    Método importado da interface SharinganStatus;
     */
    public void sharinganAtivado(){
        System.out.println("Meu nome é " + nome +",  Sharingan ativou!");
    }



}
