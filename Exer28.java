/*
Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
 */

import java.util.*;

public class Exer28 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int b, h, a;

        System.out.print("Qual a medida (m) do comprimento deste terreno?");
        b = scan.nextInt();
        System.out.print("Qual a medida (m) da altura deste terreno?");
        h = scan.nextInt();

        a = (b * h);

        if (a <= 100) {
            System.out.println("O seu terreno tem " + a + " m² de area total, portanto é um terreno Popular");
        } else if(a > 100 && a <= 500) {
            System.out.println("O seu terreno tem " + a + " m² de area total, portanto é um terreno Master");
        } else {
            System.out.println("O seu terreno tem " + a + " m² de area total, portanto é um terreno Vip");
        }

    }
}