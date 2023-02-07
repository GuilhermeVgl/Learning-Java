import java.util.*;

public class Media {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        Float nota1, nota2, media;
        String nome;

        System.out.print("Qual nome do aluno? ");
        nome = scan.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextFloat();

        media = ((nota1 + nota2)/2);

        System.out.print("A Média do aluno " + nome + " é " + media +"!!!");

    }
}