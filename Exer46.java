/*
Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.
 */

import java.util.*;

public class Exer46 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;

        for(int i = 6; i <= 100; i = i + 2)
            cont += i;
        System.out.println("O resultado da soma é: " + cont);

    }
}