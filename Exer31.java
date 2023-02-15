/*
[DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */

import java.util.*;

public class Exer31 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String c1, c2;

        System.out.println("------------------------------");
        System.out.println("Bem vindo ao JokenPo do Guizão");
        System.out.println("------------------------------");

        System.out.println("Escolha, pedra, papel ou tesoura");

        System.out.print("Jogador um: ");
        c1 = scan.nextLine();
        System.out.print("Jogador dois: ");
        c2 = scan.nextLine();


        // pedra
        if (c1 .equals("pedra") && c2 .equals("pedra")) {
            System.out.println("empate");
        } else if (c1 .equals("pedra") && c2 .equals("papel")) {
            System.out.println("Jogador dois ganhou!");
        } else if (c1 .equals("pedra") && c2 .equals("tesoura")) {
            System.out.println("Jogador um ganhou!");
        }

        // papel
        if (c1 .equals("papel") && c2 .equals("papel")) {
            System.out.println("empate");
        } else if (c1 .equals("papel") && c2 .equals("pedra")) {
            System.out.println("Jogador um ganhou!");
        } else if (c1 .equals("papel") && c2 .equals("tesoura")) {
            System.out.println("Jogador dois ganhou!");
        }

        //tesoura
        if (c1 .equals("tesoura") && c2 .equals("tesoura")) {
            System.out.println("empate");
        } else if (c1 .equals("tesoura") && c2 .equals("papel")) {
            System.out.println("Jogador um ganhou!");
        } else if (c1 .equals("tesoura") && c2 .equals("pedra")) {
            System.out.println("Jogador dois ganhou!");
        }

    }
}