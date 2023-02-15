/*
Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
 - Carros populares (aluguel de R$90 por dia)
 - Até 100Km percorridos: R$0,20 por Km
 - Acima de 100Km percorridos: R$0,10 por Km
 - Carros de luxo (aluguel de R$150 por dia)
 - Até 200Km percorridos: R$0,30 por Km
 - Acima de 200Km percorridos: R$0,25 por Km
 */

import java.util.*;

public class Exer35 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int vlrCP, vlrCL;
        double kmP, kmL, kmPer, vlrP;
        String car;

        vlrCP = 90;
        vlrCL = 150;

        // input
        System.out.print("Tipo de carro alugado (popular/luxo):");
        car = scan.nextLine();
        System.out.print("Quantidade de km percorridos:");
        kmPer = scan.nextDouble();

        // condicionais
        if (car .equals("popular") && kmPer < 100) {
            kmP = (kmPer * 0.20);
            vlrP = (vlrCP + kmP);
            System.out.println("Valor a pagar: R$" + vlrP);
        } else if(car .equals("popular") && kmPer > 100) {
            kmP = (kmPer * 0.10);
            vlrP = (vlrCP + kmP);
            System.out.println("Valor a pagar: R$" + vlrP);
        } else if(car .equals("luxo") && kmPer < 200) {
            kmL =  (kmPer * 0.30);
            vlrP = (vlrCL + kmL);
            System.out.println("Valor a pagar: R$" + vlrP);
        } else if(car .equals("luxo") && kmPer > 200) {
            kmL = (kmPer * 0.25);
            vlrP = (vlrCL + kmL);
            System.out.println("Valor a pagar: R$" + vlrP);
        }
    }
}