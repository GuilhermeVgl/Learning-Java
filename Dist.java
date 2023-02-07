import java.util.*;

public class Dist {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        float metros, km, hm, dam, dm, cm, mm;

        //input
        System.out.print("Informe a distância em metros: ");
        metros = scan.nextFloat();

        // cálculos
        km = (metros / 1000);
        hm = (metros / 100);
        dam = (metros / 10);
        dm = (metros * 10);
        cm = (metros * 100);
        mm = (metros * 1000);

        // output
        System.out.println("A distância " + metros + " em m, equivale a:");

        System.out.println("km: " + km);
        System.out.println("hm: " + hm);
        System.out.println("dam: " + dam);
        System.out.println("dm: " + dm);
        System.out.println("cm: " + cm);
        System.out.println("mm: " + mm);
    }
}