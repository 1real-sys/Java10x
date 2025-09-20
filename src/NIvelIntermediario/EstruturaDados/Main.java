package NIvelIntermediario.EstruturaDados;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array, são estáticos e tem ref de memória
        String[] ninjasArray = new String[10];
        ninjasArray[0] = "Naruto";

        //Listas, são dinâmicas e aumentam conforme a necessidade
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Sasuke");

        //Stack, pilha, LIFO (Last In First Out) o ultimo a entrar é o primeiro a sair
        //push: adiciona um elemento no topo da pilha
        //pop: remove o elemento do topo da pilha
        //peek: retorna o elemento do topo da pilha sem remover
        //size: retorna o tamanho da pilha
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("Naruto");
        System.out.println("Minha stack: " + ninjasStack);
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");
        ninjasStack.push("Kakashi");
        ninjasStack.push("Minato");
        System.out.println("Minha stack: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha stack: " + ninjasStack);
        System.out.println("Elemento do topo: " + ninjasStack.peek());
        System.out.println("Tamanho da pilha: " + ninjasStack.size());




    }
}
