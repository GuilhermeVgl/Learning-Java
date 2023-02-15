/*
 [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes
 */

import java.util.*;

public class Exer30 {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);

        int sR1, sR2, sR3;
        boolean tri;

        System.out.print("Informe o primeiro segmento de reta:");
        sR1 = scan.nextInt();
        System.out.print("Informe outro segmento de reta:");
        sR2 = scan.nextInt();
        System.out.print("Informe outro segmento de reta:");
        sR3 = scan.nextInt();

        if (sR1 < (sR2 + sR3) && sR2 < (sR1 + sR3) && sR3 < (sR1 + sR2)) {
            tri  = true;
            System.out.println("É possível se formar um triangulo");
        } else {
            tri = false;
            System.out.println("Não é possível se formar um triangulo");
        }

        if (tri = true && sR1 == sR2 && sR1 == sR3) {
            System.out.println("O triangulo formado é um triangulo Equilátero");
        } else if (tri = true && sR1 == sR2 || sR1 == sR3 || sR2 == sR3) {
            System.out.println("O triangulo formado é um triangulo Isósceles");
        } else if (tri = true){
            System.out.println("O triangulo formado é um triangulo Escaleno");
        }

    }
}