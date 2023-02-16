/*
Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
 */

import java.util.*;

public class Exer39 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 10;

        while (cont >= 3) {
            System.out.print(cont + " ");
            cont--;
        }
            System.out.println("Acabou!");
    }
}