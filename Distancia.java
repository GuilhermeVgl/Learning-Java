/*
Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.
 */

import java.util.*;

public class Distancia {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int distRQ;
        double  vlrP, vlrC, vlrB;

        vlrC = 0.50;
        vlrB = 0.45;

        System.out.print("Informe a distância em KM que deseja percorrer: ");
        distRQ = scan.nextInt();

        if (distRQ <= 200) {
            vlrP = (vlrC * distRQ);
            System.out.println("O valor a pagar é de: R$" + vlrP);
        } else if(distRQ > 200) {
            vlrP = (vlrB * distRQ);
            System.out.println("O valor a pagar é de: R$" + vlrP);
        }

    }
}