// A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

import java.util.*;

public class Locadora {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        Double kmR, valorKM, valorPKM, valorPagar;
        int valorD, diaR, valorPD;

        valorD = 90;
        valorKM = 0.20;

        System.out.print("Quantidade de dias utilizados? ");
        diaR = sc.nextInt();

        System.out.print("Quantidade de KM rodados? ");
        kmR = sc.nextDouble();

        //cálculos

        valorPKM = (kmR * valorKM);
        valorPD = diaR * valorD;

        valorPagar = valorPKM + valorPD;

        System.out.println("O valor total a pagar é: " + valorPagar);


    }
}