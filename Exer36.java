/*
 Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade física no mês vale pontos
 - até 10h de atividade no mês: ganha 2 pontos por hora
 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 - acima de 20h de atividade no mês: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */

import java.util.*;

public class Exer36 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int horas, pnt;
        double vlr;

        System.out.print("Quantas horas de atividade física você praticou esse mês?");
        horas = scan.nextInt();

        if (horas <= 10) {
            pnt = horas * 2;
            vlr = pnt * 0.05;

            System.out.println("Você ganhou: " + pnt +" pontos e mais R$" + vlr);
        } else if (horas > 10 && horas <= 20) {
            pnt = horas * 5;
            vlr = pnt * 0.05;

            System.out.println("Você ganhou: " + pnt +" pontos e mais R$" + vlr);
        } else if (horas > 20) {
            pnt = horas * 10;
            vlr = pnt * 0.05;

            System.out.println("Você ganhou: " + pnt + " pontos e mais R$" + vlr);
        }
    }
}