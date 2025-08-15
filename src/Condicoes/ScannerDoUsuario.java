package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {


        // O usuário criará um ninja e vamos validar os dados

        // Recebendo o nome do ninja
        Scanner caixaDeTexto =  new Scanner(System.in);
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja =  caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Recebendo a idade no ninja

        System.out.println("Digite a idade do ninja: ");
        int IdadeDoNinja =  caixaDeTexto.nextInt();
        System.out.println("A idade no ninja é : " + IdadeDoNinja + " anos");

        // Tratamento de dados
        if (IdadeDoNinja >= 18){
            System.out.println("Esse ninja é maior de idade, e pode ir para missões de fora da aldeia");
        }else {
            System.out.println("Esse ninja é muito jovem, precisa treinar mais antes de sair da aldeia");
        }



        caixaDeTexto.close();
    }


}
