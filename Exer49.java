/*
 Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares.
 */

import java.util.*;

public class Exer49 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int par = 0, impar = 0;

        for (int i = 1; i <= 6; i++)
        {
            System.out.print("Informe um número inteiro: ");
            sum += scan.nextInt();

            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);

    }
}