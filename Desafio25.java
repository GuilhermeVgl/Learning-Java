/*
[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.
 */

import java.util.*;

public class Desafio25 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int sR1, sR2, sR3;

        System.out.print("Informe um segmento de reta:");
        sR1 = scan.nextInt();

        System.out.print("Informe outro de reta:");
        sR2 = scan.nextInt();

        System.out.print("Informe outro de reta:");
        sR3 = scan.nextInt();

        if (sR1 < (sR2 + sR3) && sR2 < (sR1 + sR3) && sR3 < (sR1 + sR2)) {
            System.out.println("É possível se formar um triangulo");
        } else {
            System.out.println("Não é possível se formar um triangulo");
        }

    }
}