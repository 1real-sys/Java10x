package Desafios.DesafioSeis;

import java.util.LinkedList;

public class GerenciadorNinjas <T> {
    private LinkedList<T> ninjas;

        public GerenciadorNinjas() {
            this.ninjas = new LinkedList<>();
        }
        public LinkedList<T> getNinjas() {
            return new LinkedList<>(ninjas);
        }
        public void listarNinjas() {
        System.out.println("Esses são os ninjas:");
        ninjas.forEach(System.out::println);
        System.out.println();// Mais eficiente que for-each tradicional
        }
        public void setNinjas(LinkedList<T> ninjas) {
            this.ninjas = ninjas;
        }
        public void removerNinja(){
            ninjas.remove();
        }
        public void removerPrimeiroNinja(){
            ninjas.removeFirst();
        }
        public void removerNinjaIndex(int index){
            T ninja = ninjas.get(index);
            System.out.println("Removendo o ninja pelo indice: " + ninja);
            ninjas.remove(index);
        }
        public void adicionarNinja(T ninja){
            ninjas.add(ninja);
        }
        public void adicionarPrimeiroNinja(T ninja){
            ninjas.addFirst(ninja);
        }
        public void acessarNinja(int index){
            System.out.println(ninjas.get(index));
        }

        @Override
        public String toString(){
            return "Ninjas: " + ninjas;
        }






}
