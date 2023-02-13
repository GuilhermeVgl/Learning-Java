/*
Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*/

import java.util.*;

public class Alistamento {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int idd, iddR;

        System.out.print("Qual a sua idade?");
        idd = scan.nextInt();

        if (idd < 18) {
            iddR = (idd - 18) * (-1) ;
            if (iddR == 1) {
                System.out.println("Falta " + iddR + " Ano para você se alistar!");
            } else {
                System.out.println("Faltam " + iddR + " Anos para você se alistar!");
            }
        } else if (idd > 18) {
            iddR = (idd - 18);
            System.out.println("Já se passaram " + iddR + " Anos do seu alistamento");

        }

    }
}