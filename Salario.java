//Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//por hora trabalhada.

import java.util.*;
public class Salario {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);

        int valorH, valorD, horas, dias, sal;

        valorH = 25;
        horas = 8;
        valorD = (valorH * horas);

        System.out.print("Quantidade de dias trabalhados:");
        dias = sc.nextInt();

        sal = (dias * valorD);

        System.out.println("O salário desse funcionário será de: R$"+sal);

    }
}