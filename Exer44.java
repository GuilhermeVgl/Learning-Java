/*
Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
 */

import java.util.*;

public class Exer44 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int vlrI, vlrF, inc, cont;

        System.out.print("Informe o valor inicial:");
        vlrI = scan.nextInt();
        System.out.print("Informe o valor final:");
        vlrF = scan.nextInt();
        System.out.print("Informe o incremento:");
        inc = scan.nextInt();

        cont = vlrI;

      if (vlrI < vlrF) {
            while (cont <= vlrF) {
                System.out.print(cont + " ");
                cont = cont + inc;
            }
        }  else if (vlrI > vlrF) {
             while (cont >= vlrF) {
                System.out.print(cont + " ");
                cont = cont - (inc);
             }
      }

    }
}