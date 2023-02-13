/*
[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
*/

import java.util.*;

public class Cigarro {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int anos, diasM, qteC;
        float dias, minPerdidos;

        System.out.print("Quantos cigarros você fuma por dia?");
        qteC = sc.nextInt();

        System.out.print("há quantos anos você fuma?");
        anos = sc.nextInt();

        diasM = (anos * 365);
        minPerdidos = ((diasM * qteC) * 10);
        dias = (minPerdidos / 1440);

        System.out.println("A quantidade de minutos perdidos é de: " + minPerdidos);
        System.out.println("A quantidade de dias perdidos é de: " + dias);

    }
}