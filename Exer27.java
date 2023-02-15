/*
Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO
 */

import java.util.*;

public class Exer27 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, media;

        System.out.print("Insira a primeira nota do aluno:");
        n1 = scan.nextDouble();
        System.out.print("Insira a segunda nota do aluno:");
        n2 = scan.nextDouble();

        media = ((n1 + n2) / 2);

        if (media <= 4.9) {
            System.out.println("O aluno está reprovado, pois a nota foi: " + media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("O aluno está de recuperação, pois a nota foi:" + media);
        } else {
            System.out.print("O aluno está aprovado, pois a nota foi: " + media);
        }

    }
}