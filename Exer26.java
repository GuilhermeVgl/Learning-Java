/* Escreva um algoritmo que leia dois números inteiros e
compare-os, mostrando na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
*/

import java.util.*;

public class Exer26 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.print("Informe um valor:");
        num1 = scan.nextInt();
        System.out.print("Informe outro valor:");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro valor é o maior!!!");
        } else if (num2 > num1) {
            System.out.println("O segundo valor é o maior!!!");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais!!!");
        }
    }
}
