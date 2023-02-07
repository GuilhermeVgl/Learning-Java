import java.util.*;

public class Calc {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        Float num1, dobro, ter;

        System.out.print("Digite um número real: ");
        num1 = scan.nextFloat();

        dobro = (num1 * 2);
        ter = (num1 / 3);

        System.out.println("O dobro de " + num1 + " é " + dobro);
        System.out.print("A terça parte de " + num1 + " é " + ter);

    }
}