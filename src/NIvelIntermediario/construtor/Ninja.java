package NIvelIntermediario.construtor;

public abstract class Ninja {
    String nome;
    String aldeia;
    String ranking;
    Boolean vivoOumorto;

    public Ninja(){

    }


    public Ninja(String nome, String aldeia, String ranking, Boolean vivoOumorto) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.ranking = ranking;
        this.vivoOumorto = vivoOumorto;

    }
    public void exibir(){
        String status = vivoOumorto ? "Vivo" : "Morto";
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Ranking: " + ranking);
        System.out.println("Status: " + status);
    }

    public abstract void sabedoria(); //sou obrigado a implementar nas subs classes

    public void ola(){
        //nao sou obrigado a implementar nas subs classes
    }

}
