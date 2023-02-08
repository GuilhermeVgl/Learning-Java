// Desenvolva uma lógica que leia os valores de A, B e C de uma
// equação do segundo grau e mostre o valor de Delta

import java.util.*;

public class Delta {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int a,b,c,delta;

        System.out.println("---------------------------");
        System.out.println("   Vamos  calcular  Delta  ");
        System.out.println("---------------------------");
        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();

        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();

        System.out.print("Informe o valor de C: ");
        c = scan.nextInt();

        delta = ((b * b) - (4*a*c) );

        System.out.println("O valor de delta é: " + delta);

    }
}