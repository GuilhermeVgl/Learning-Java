import java.util.*;

public class Soma {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Digite um número inteiro: ");
        num1 = scan.nextInt();

        System.out.print("Digite outro número inteiro: ");
        num2 = scan.nextInt();

        // Soma
        soma = num1 + num2;

        System.out.print("A soma entre os dois números é: " + soma);
    }
}