/*
Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */

import java.util.*;

public class Exer42 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int vlr;
        int i = 0;

        System.out.print("Informe o valor para contarmos:");
        vlr = scan.nextInt();

        System.out.print("Contagem: ");

        if (i < vlr) {
             while (i <= vlr ) {
                System.out.print(i + " ");
                i ++;
            }
        } else if (i > vlr){
            while (i >= vlr ) {
                System.out.print(i + " ");
                i = i -1;
            }
        }

    }
}