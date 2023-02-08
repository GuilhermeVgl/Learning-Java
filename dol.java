import java.util.*;
public class dol {
    public static void main ( String [] args) {
        Scanner scan = new Scanner(System.in);

        Double real, dol;

        System.out.print("Digite o valor em real: ");
        real = scan.nextDouble();

        dol = (real/3.45);

        System.out.print("O valor que você poderá comprar em dolar é: U$" + dol);
        
    }
}