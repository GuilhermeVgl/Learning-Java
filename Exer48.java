/*
Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles.
 */

import java.util.*;

public class Exer48 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 1; i <= 7; i++) {
            System.out.print("Digite um número inteiro: ");
            sum += scan.nextInt();
        }

        System.out.println("Soma dos números é igual a: " + sum);
        scan.close();

    }
}

