/*
Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%
 */

import java.util.*;

public class Exer37 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String gen;
        double sal, nSal;
        int tmpE;

        System.out.print("Qual é seu gênero? (m/f)");
        gen = scan.nextLine();
        System.out.print("Qual é seu salário atual?");
        sal = scan.nextDouble();
        System.out.print("Há quantos anos você trabalha nesta empresa?");
        tmpE = scan.nextInt();

        // mulheres
        if(gen .equals("f") && tmpE < 15) {
            nSal = sal + ((sal / 100) * 5);
            System.out.println("Seu novo salário é de: R$" + nSal);
        } else if (gen .equals("f") && tmpE >= 15 && tmpE <20) {
            nSal = sal + ((sal / 100) * 12);
            System.out.println("Seu novo salário é de: R$" + nSal);
        } else if (gen .equals("f") && tmpE > 20) {
            nSal = sal + ((sal / 100) * 23);
            System.out.println("Seu novo salário é de: R$" + nSal);
        }

        // homens
        if(gen .equals("m") && tmpE < 20) {
            nSal = sal + ((sal / 100) * 3);
            System.out.println("Seu novo salário é de: R$" + nSal);
        } else if (gen .equals("m") && tmpE > 20 && tmpE < 30) {
            nSal = sal + ((sal / 100) * 13);
            System.out.println("Seu novo salário é de: R$" + nSal);
        } else if (gen .equals("m") && tmpE > 30) {
            nSal = sal + ((sal / 100) * 25);
            System.out.println("Seu novo salário é de: R$" + nSal);
        }

    }
}