package NIvelIntermediario;

public class main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 17, "Aldeia da folha", Bijuu.KURAMA);
        Naruto.apresentarNinja();
        Naruto.modoSabio();
        Naruto.habilidadeEspecial();
        System.out.println(Naruto.bijuu);
        System.out.println("----------------");
        System.out.println("----------------");

        //Criar  ninja Sasuke Uchiha - Sasuke é um OBJETO
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", 17, "Aldeia da folha");
        //Aplicando Métodos aos objetos
        Sasuke.apresentarNinja();
        Sasuke.sharinganAtivado();
        Sasuke.habilidadeEspecial();
        System.out.println("----------------");
        System.out.println("----------------");

        int quantoTempoFalta = Sasuke.tempoParaSeTornarHokage(40);
        //System.out.println("Você tem: " + Sasuke.idade + " anos, então faltam no mínimo " + quantoTempoFalta + " anos para se tornar hokage");


        Haruno Sakura = new Haruno("Sakura Haruno", 17, "Aldeia da folha");
        Sakura.apresentarNinja();
        Sakura.habilidadeEspecial();
        Sakura.Byakugou();
        System.out.println("----------------");
        System.out.println("----------------");

        Hyuga Hinata = new Hyuga("Hinata Hyuga", 16, "Aldeia da folha");
        Hinata.apresentarNinja();
        Hinata.habilidadeEspecial();
        Hinata.byakugan();
        System.out.println("----------------");
        System.out.println("----------------");


        Boruto Boruto = new Boruto("Boruto Uzumaki", 12, "Aldeia da folha");
        Boruto.apresentarNinja();
        Boruto.ativarByakugan();
        Boruto.modoSabio();
        Boruto.ativarKarma();
        Boruto.ativarJogan();

    }

}
