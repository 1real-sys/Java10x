package Desafios.DesafioSeis;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
         Ninjas ninja1 = new Ninjas("Naruto", 17, "Konoha");
         Ninjas ninja2 = new Ninjas("Sasuke", 17, "Konoha");
         Ninjas ninja3 = new Ninjas("Sakura", 17, "Konoha");
         Ninjas ninja4 = new Ninjas("Kakashi",30, "Kohoha");
         Ninjas ninja5 = new Ninjas("Itachi", 21, "Konoha");
         Ninjas ninja6 = new Ninjas("Jiraya", 50, "Konoha");
         Ninjas ninja7 = new Ninjas("Shikamaru", 18, "Konoha");
         GerenciadorNinjas<Ninjas> gerenciadorNinjas = new GerenciadorNinjas<>();
         gerenciadorNinjas.adicionarNinja(ninja1);
         gerenciadorNinjas.adicionarNinja(ninja2);
         gerenciadorNinjas.adicionarNinja(ninja3);
         gerenciadorNinjas.adicionarNinja(ninja4);
         gerenciadorNinjas.adicionarNinja(ninja5);
         gerenciadorNinjas.adicionarNinja(ninja6);
         gerenciadorNinjas.listarNinjas();
         gerenciadorNinjas.removerPrimeiroNinja();
         gerenciadorNinjas.listarNinjas();
         gerenciadorNinjas.adicionarPrimeiroNinja(ninja7);
         gerenciadorNinjas.listarNinjas();
         gerenciadorNinjas.removerNinja();
         gerenciadorNinjas.listarNinjas();
         gerenciadorNinjas.removerNinjaIndex(1);
         LinkedList<Ninjas> copiaNinjas = gerenciadorNinjas.getNinjas();




    }
}
