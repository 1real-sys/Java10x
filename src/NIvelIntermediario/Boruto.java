package NIvelIntermediario;

public class Boruto extends Uzumaki implements HyugaUzumaki, ByakuganStatus, modoSabioStatus {


    public Boruto() {
    }

    public Boruto(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }


    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial: Vanish Rasengan!");
    }


/*
Todos os métodos abaixo vem da interface HyugaUzumaki, ByakuganStatus e modoSabioStatus
 */
    public void ativarByakugan() {
        System.out.println("Byakugan Ativado! Sou " + nome +  ", um Hyuga e Uzumaki");
    }
    public void modoSabio() {
        System.out.println("Modo Sábio Ativado! Sou " + nome +  ", um Hyuga e Uzumaki");
    }
    public void ativarKarma() {
        System.out.println("Karma Ativado! Sou um Hyuga e Uzumaki");
    }
    public void ativarJogan() {
        System.out.println("Jogan Ativado! Sou um Hyuga e Uzumaki");
    }
}
