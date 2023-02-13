/*
Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto
 */

import java.util.*;

public class Promocao {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sex;
        int prec, pDesc;

        System.out.print("Informe seu nome:");
        nome = scan.nextLine();
        System.out.print("Infome seu sexo (h/m):");
        sex = scan.nextLine();
        System.out.print("Qual valor total de suas compras?");
        prec = scan.nextInt();

        if (sex .equals("m")) {
            pDesc = (prec - ( (prec/100) * 13) );
            System.out.println("O valor da suas compras com desconto é de R$" + pDesc);
        } else if (sex .equals("h")) {
            pDesc = (prec - ((prec/100)* 5) );
            System.out.println("O valor da suas compras com desconto é de R$" + pDesc);
        }

    }
}