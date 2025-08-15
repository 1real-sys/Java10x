package NIvelIntermediario.aplicandooop;

public class main {
    public static void main(String[] args) {

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Uchiha", 21, 120, NivelNinja.KAGE);
        itachi.apresentacao();
        itachi.ativarSharingan();
        itachi.habilidadeEspecial();
        System.out.println("------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Uchiha", 17, 55, NivelNinja.JOUNIN);
        sasuke.apresentacao();
        sasuke.ativarSharingan();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaEspecialNinja();
        System.out.println("------------------");
        Uchiha madara = new Uchiha("Madara Uchiha", "Uchiha", 34, 754, NivelNinja.KAGE);
        madara.apresentacao();
        madara.estrategiaEspecialNinja();
        madara.habilidadeEspecial();

        System.out.println("------------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Uzumaki", 17, 110, NivelNinja.JOUNIN);
        naruto.apresentacao();
        naruto.habilidadeEspecial();
        naruto.estrategiaEspecialNinja();

        System.out.println("------------------");

        Hatake kakashi = new Hatake("Kakashi Hatake", "Hatake", 31, 310, NivelNinja.KAGE);
        kakashi.apresentacao();
        kakashi.ativarSharingan();
        kakashi.habilidadeEspecial();
        kakashi.estrategiaEspecialNinja();
        kakashi.fizParteDaAmbu();
    }
}
