/*
Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
 */

import java.util.*;

public class Exer43 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 30;

        while (cont >= 1) {
            if(cont % 4 == 0) {
                System.out.print("[" + cont + "] ");
            } else {
                System.out.print(cont + " ");
            }
            cont--;
        }

    }
}