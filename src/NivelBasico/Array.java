package NivelBasico;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

       /* //inicializa como null
        String[] ninja = new String[3];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        System.out.println(Arrays.toString(ninja));
        ninja = new String[3];
        ninja[0] = "Hashirama senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        System.out.println(Arrays.toString(ninja));
        //inicializa como 0
        int[] idade = new int[3];
        System.out.println(idade[0]);
        //inicializa como 0.0
        double[] flutuante = new double[3];
        System.out.println(flutuante[0]);
        //inicializa como falso
        boolean[] verdadeiroOuFalso = new boolean[3];
        System.out.println(verdadeiroOuFalso[0]);



        String[] time1 = new String[3];
        time1[0] = "Naruto";
        time1[1] = "Sasuke";
        time1[2] = "Sakura";
        String[] time2 = new String[3];
        time2[0] = "Shikamaru";
        time2[1] = "Ino";
        time2[2] = "Chouji";
        //  String[] missao = time1; // Assim, eu estou lidando com o objeto na mesma referencia de memoria, ou seja, qualquer alteração nas posiçoes que eu fizer em time1, vai alterar o array missao também
        //  time1[0] = "Kakashi Hatake";
        String[] missao = Arrays.copyOf(time1, time1.length); // com isso eu faço uma cópia, crio uma outra referencia de memoria, entao qualquer alteração que eu fizer abaixo, será inutil.
        time1[0] = "Iruka Umino";
        System.out.println(Arrays.toString(missao));

      */
       //Array de referencia
        String[][] ninjasEaldeias = new String[3][3];

        ninjasEaldeias[0][0] = "Konoha";
        ninjasEaldeias[0][1] = "Naruto Uzumaki";
        ninjasEaldeias[0][2] = "Sasuke Uchiha";

        ninjasEaldeias[1][0] = "Nevoa";
        ninjasEaldeias[1][1] = "Zabuza";
        ninjasEaldeias[1][2] = "Haku";

        ninjasEaldeias[2][0] = "Areia";
        ninjasEaldeias[2][1] = "Gaara";
        ninjasEaldeias[2][2] = "Temari";

        for(int i = 0; i < ninjasEaldeias.length; i++){
            System.out.print("Aldeia : " + ninjasEaldeias[i][0] + " - Ninja 1: " + ninjasEaldeias[i][1] + " - Ninja 2: " + ninjasEaldeias[i][2]+"\n" );
        }

    }
}
