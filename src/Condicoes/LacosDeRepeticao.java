package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
            /*
            Os laços de repetição vão repetir infinitamente ou vão se repitir até o limite que impus
            While e For
            */

        //While
        //While (condicao) {vai acontecer tudo aqui}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;
           while(numeroDeClones <= numeroMaximoDeClones) {

                System.out.println("O naruto fez " + numeroDeClones + " clones das sombras");
                numeroDeClones++;
            }
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

       for ( numeroDeClones = 0; numeroDeClones < numeroMaximoDeClones ; numeroDeClones++) {
            System.out.println("O naruto fez " + numeroDeClones + " clones das sombras");
        }
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");






        /*
            Exercício: Contador de crescimento anual
Imagine que você está monitorando o crescimento de uma planta que tem atualmente 30 cm de altura. A cada ano, ela cresce 8 cm. Você quer saber em quantos anos ela vai ultrapassar 100 cm.

✅ Regras:
Use um for.

Mostre a altura da planta a cada ano até ela ultrapassar 100 cm.

Mas somente na primeira iteração, mostre a mensagem:
"A planta começa com 30 cm de altura."
         */

        int altura = 30;
        int alturaAtual = altura;
        int ano = 1;
        if (altura < 100) {
            for (; alturaAtual <= 110; alturaAtual += 8) {
                if (ano == 1) {
                    System.out.println("A planta começa com 30 cm de altura.");
                }
                System.out.println("No ano " + ano + " a arvore tem " + alturaAtual + "  cms de altura ");
                ano++;
            }

        }


    }
}
