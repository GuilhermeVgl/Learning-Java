/*
Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
 */

import java.util.*;

public class Exer40 {
    public static void main(String [] args) {

        int cont = 0;

        while (cont <= 18) {
            System.out.print(cont + " ");
            cont = (cont + 3);
        }
        System.out.println("Acabou!");
    }
}