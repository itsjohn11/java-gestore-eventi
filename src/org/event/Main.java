package org.event;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        //Costruttore
        Concerto Unico = new Concerto("unico", 01/10/2025, 1000, 0, 0, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println(Unico.getTitolo());
        System.out.println(Unico.getData());
        System.out.println(Unico.getPostiTotali());
        System.out.println(Unico.getPostiPrenotati());
       
        // System.out.println(Concerto.Information());
        
        scanner.close();

        // private static void dateCompare(){

        //     LocalDate dateNow = LocalDate.now();
        //     LocalDate date = LocalDate.of(01, 12, 2025)

        // }
    }
}
