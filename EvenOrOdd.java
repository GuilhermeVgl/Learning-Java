// Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

import java.util.*;

public class EvenOrOdd {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------");
        System.out.println("    Ímpar ou par?    ");
        System.out.println("---------------------");

        System.out.print("Informe um número para conferirmos se é ímpar ou par:");
        int number = scan.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " é um número par");
        } else {
            System.out.println(number + " é um número ímpar");
        }

    }
}