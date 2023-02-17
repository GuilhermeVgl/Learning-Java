/*
Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
 */

import java.util.*;

public class Exer41 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 100;

        while (cont >= 0) {
            System.out.print(cont + " ");
            cont = (cont - 5);
        }

    }
}