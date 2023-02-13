//Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.

import java.text.*;
import java.util.*;
import java.time.*;

public class IdadeVotar {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int b_day, b_month, b_year, c_day, c_month, c_year;

        System.out.println("----------------------");
        System.out.println("   Cálculo de idade   ");
        System.out.println("----------------------");
        System.out.println(" ");

        System.out.print("dia de nascimento:");
        b_day = scan.nextInt();
        System.out.print("Mês de nascimento:");
        b_month = scan.nextInt();
        System.out.print("Ano de nascimento:");
        b_year = scan.nextInt();

        c_day = java.time.LocalDate.now().getDayOfMonth();
        c_month = java.time.LocalDate.now().getMonthValue();
        c_year = java.time.LocalDate.now().getYear();

        if(c_day > b_day && c_month > b_month && c_year > b_year) {
            b_day = c_day - b_day;
            b_month = c_month - b_month;
            b_year = c_year - b_year;
            System.out.println("Sua idade é " + b_day + " dias " + b_month + " meses " + b_year + " Anos ");
        } else {
            b_day = (c_day + 30) - b_day;
            c_month--;
            c_month += b_day / 30;
            b_day = b_day %30;

            b_month = (c_month + 12) - b_month;
            c_year--;
            c_year += b_month / 12;
            b_month = b_month % 12;

            b_year = c_year - b_year;
            System.out.println("Sua idade é " + b_day + " dias " + b_month + " meses " + b_year + " Anos ");
        }
        // verificação possibilidade de votar
        if(b_year >= 16) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }
    }
}