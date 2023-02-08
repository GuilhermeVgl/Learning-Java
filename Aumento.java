// calcule um aumento de 15% no salário de um funcionário

import java.util.*;

public class Aumento{
    public static void main( String [] args) {
        Scanner scan = new Scanner(System.in);

        Float sal, aumento, salAumento;

        System.out.print("Informe o salário: ");
        sal = scan.nextFloat();

        aumento = ((sal/100) * 15 );
        salAumento = (aumento + sal);

        System.out.println("O aumento referente ao salário inserido é: " + aumento);
        System.out.print("Salário somado ao aumento é igual a R$" + salAumento);
    }
}