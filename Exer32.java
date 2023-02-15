/*
 [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
 */

import java.util.*;

public class Exer32 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Chute um valor de 0 a 5:");
        int num1 = scan.nextInt();

        int num2 = random.nextInt(5);
        System.out.println("O numero foi: " +  num2);

        if (num1 == num2) {
            System.out.println("Parabéns você acertou!!!");
        } else {
            System.out.println("Você errou!!!");
        }

    }
}