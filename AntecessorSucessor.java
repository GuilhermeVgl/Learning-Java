import java.util.*;

public class AntecessorSucessor {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int num1, ant, suc;

        System.out.print("Digite um número inteiro: ");
        num1 = scan.nextInt();

        ant = (num1 - 1);
        suc = (num1 + 1);

        System.out.println("O antecessor do número " + num1 + " é " + ant + "!");
        System.out.print("O sucessor do número " + num1 + " é " + suc + "!");

    }
}