import java.util.*;

public class Func {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        String nome, sex, mes;
        Float sal;

        System.out.print("Qual é o seu gênero (M/F) ?");
        sex = scan.next();

        System.out.print("Qual é o seu nome? ");
        nome = scan.next();

        System.out.print("Qual é o seu salário? ");
        sal = scan.nextFloat();

        System.out.print("Infome o mês atual: ");
        mes = scan.next();

        if(sex .equals("M")) {
            System.out.print("O funcionário " + nome + " tem um salário de " + sal + " em " + mes);
        } else {
            System.out.print("A funcionária " + nome + " tem um salário de " + sal + " em " + mes);
        }

    }
}