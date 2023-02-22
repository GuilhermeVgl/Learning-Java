/*
Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.
 */

import java.util.*;

public class Exer46 {
    public static void main(String [] args) {

        int soma = 0;

        for(int i = 6; i <= 100; i = i + 2)
            soma += i;
        System.out.println("O resultado da soma é: " + soma);
    }
}