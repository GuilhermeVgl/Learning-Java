/*
Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0
 */

import java.util.*;

public class Exer47 {
    public static void main(String [] args) {

        int soma = 0;

        for (int i = 500; i > 0; i = i - 50)
            soma +=i;
        System.out.print("O resultado da soma é: " + soma);

    }
}