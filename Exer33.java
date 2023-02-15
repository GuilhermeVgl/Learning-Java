/*
Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */

import java.util.*;

public class Exer33 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int vlrC, sal, vlrP, qteP, men;

        System.out.print("Informe o valor da casa: R$ ");
        vlrC = scan.nextInt();
        System.out.print("Informe seu salário: R$ ");
        sal = scan.nextInt();
        System.out.print("Informe em quantas parcelas que financiar a casa: ");
        qteP = scan.nextInt();

        vlrP = (vlrC / qteP);
        int trinta = (sal / 100) * 30;

        if (vlrP < trinta) {
            System.out.println("Parabéns o empréstimo foi aprovado!");
        } else {
            System.out.println("Empréstimo foi negado!");
        }

    }
}