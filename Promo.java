// Leia o preço de um produto e calcule 5% de desconto

import java.util.*;
public class Promo {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        Float valor, valorPromo;

        System.out.print("Informe o valor do produto sem desconto: ");
        valor = scan.nextFloat();

        valorPromo = ( valor - ((valor /100) * 5));

        System.out.print("O valor com desconto de 5% é : " + valorPromo);

    }
}