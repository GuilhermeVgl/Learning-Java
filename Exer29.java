/*
 Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20%
 */

import java.util.*;

public class Exer29 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        Double sal, novoSal;
        int tmpE = 0;

        System.out.print("Infome seu nome:");
        nome = scan.nextLine();
        System.out.print("Informe seu salário:");
        sal = scan.nextDouble();
        System.out.print("Há quantos anos você trabalha nessa empresa?");
        tmpE = scan.nextInt();

        if (tmpE < 3) {
            novoSal = (sal + ((sal / 100) * 3));
            System.out.print("Seu novo salário é de R$" + novoSal);
        } else if (tmpE >= 3 && tmpE <= 10) {
            novoSal = (sal + ((sal / 100) * 12.5));
            System.out.print("Seu novo salário é de R$" + novoSal);
        } else if (tmpE > 10) {
            novoSal = (sal + ((sal / 100) * 20));
            System.out.print("Seu novo salário é de R$" + novoSal);
        }

    }
}