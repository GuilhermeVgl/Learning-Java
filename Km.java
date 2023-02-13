// Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

import java.util.*;

public class Km {
    public static void main ( String [] args) {
        Scanner scan = new Scanner (System.in);

        int vel, KmE, multa;
        int velP = 80;
        int vlrM = 5;

        System.out.print("Qual sua velocidade atual (Km/h)? ");
        vel = scan.nextInt();

        KmE = (vel - velP);
        multa = KmE * vlrM;

        System.out.println("O valor a se pagar de multa é: R$" + multa);

    }
}