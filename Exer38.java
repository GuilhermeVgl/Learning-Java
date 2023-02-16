/*
Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!
 */

import java.util.*;

public class Exer38 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int cont = 6;

        while (cont <= 11) {
            System.out.print(cont + " ");
            cont++;
        }
        System.out.print("Acabou!");

    }
}