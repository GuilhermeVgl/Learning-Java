// Pergunte um ano ao usuário e descubra se é bissexto

import java.util.*;

public class Bissexto {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int ano;

        System.out.print("Informe o ano que deseja saber:");
        ano = scan.nextInt();

        if(ano % 400 == 0) {
            System.out.println(ano + " é um ano bissexto!!!");
        } else if((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println(ano + " é um ano bissexto!!!");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }

    }
}