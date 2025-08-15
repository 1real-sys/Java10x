package NIvelIntermediario;

public class main {
    public static void main(String[] args) {


        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.Aldeia = "Aldeia da folha";
        Naruto.modoSabio();
        Naruto.habilidadeEspecial();
        String saudacoes = Naruto.souUmNinja();
        System.out.println(saudacoes);
        System.out.println("----------------");
        System.out.println("----------------");

        //Criar  ninja Sasuke Uchiha - Sasuke é um OBJETO

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.Aldeia = "Aldeia da folha";
        //Aplicando Métodos aos objetos
        Sasuke.sharinganAtivado();
        Sasuke.habilidadeEspecial();
        saudacoes = Sasuke.souUmNinja();
        System.out.println(saudacoes);
        System.out.println("----------------");
        System.out.println("----------------");

         int quantoTempoFalta = Sasuke.tempoParaSeTornarHokage(40);
        //System.out.println("Você tem: " + Sasuke.idade + " anos, então faltam no mínimo " + quantoTempoFalta + " anos para se tornar hokage");

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.Aldeia = "Aldeia da folha";
        Sakura.Byakugou();
        System.out.println("----------------");
        System.out.println("----------------");
        Hyuga Hinata = new Hyuga();
        Hinata.nome = " Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.Aldeia = "Aldeia da folha";
        Hinata.byakugan();
        System.out.println("----------------");
        System.out.println("----------------");


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto HyugaUzumaki";
        Boruto.idade = 12;
        Boruto.Aldeia = "Aldeia da folha";

        Boruto.modoSabio();
        Boruto.ativarKarma();
        Boruto.ativarJogan();

    }

}
