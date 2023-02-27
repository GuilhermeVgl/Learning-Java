/*
 Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares.
 */

import java.util.*;

public class Exer49 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int[] sum = new int[6];
        int par = 0, impar = 0;

        for (int i = 1; i < sum.length; i++)
        {
            System.out.print("Informe um número inteiro: ");
            sum[i] += scan.nextInt();

            if (sum[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);

    }
}