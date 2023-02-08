//Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

import java.util.*;

public class Tinta {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int h,l, area, qteT;

        System.out.print("Digite a altura da parede a ser pintada:");
        h = scan.nextInt();

        System.out.print("Digite a largura da parede a ser pintada:");
        l = scan.nextInt();

        area = (h * l);
        qteT = (area / 2);

        System.out.println("A quantidade de tinta necessária para pintar uma parede com área de " + area + " m² é igual a: "+ qteT + " litros de tinta" );

    }
}