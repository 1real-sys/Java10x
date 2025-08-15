package Desafios.DesafioDois;

import java.util.Scanner;

public class desafioDois {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] ninjas =  new String[2];
      int index = 0; // int auxiliar na iteração



        while(true){
            System.out.println("\n==== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninja");
            System.out.println("3. Encerrar Programa");
            System.out.println("Escolha uma  opcao: ");

            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1: if (index < ninjas.length) {
                    System.out.println("Insira o nome do Ninja");
                    ninjas[index] = sc.nextLine();
                    index++;
                    System.out.println("Ninja Cadastrado com sucesso!");

                }else {
                    System.out.println("Limite de cadastro excedido, operação cancelada!");
                    sc.close();
                    return;
                }
                break;

                case 2:
                    if (index > 0){
                        System.out.println("Ninjas já cadastrados!");
                        for (int i = 0; i < index ; i++) {
                            System.out.println((i + 1 )  + " - " + ninjas[i]);
                        }
                    }else {
                        System.out.println("Não há ninjas Cadastrados!");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção Inválida!");
            }

        }

    }
}
