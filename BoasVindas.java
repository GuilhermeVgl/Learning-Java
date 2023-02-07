import java.util.*;

public class BoasVindas {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String nome;

        System.out.print("Qual é o seu nome? ");
        nome = scan.nextLine();

        System.out.print("Olá, "+ nome + ", é um prazer te conhecer!!!");

    }
}