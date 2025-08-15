package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        // Servem para gerar casos específicos

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sasuke Haruno");

        int escolhaDoNinja = sc.nextInt();
        System.out.println("Voce digitou o numero " + escolhaDoNinja);

        switch (escolhaDoNinja){
            case 1:
                System.out.println("Usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Usuário escolheu a Sakura Haruno");
                break;

            default:
                System.out.println("Você não digitou uma resposta válida, tente de novo");
        }


        sc.close();


    }
}
