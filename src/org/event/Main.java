package org.event;
// import java.time.LocalDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            
        Evento concerto = new Evento("Unico", 01/01/2025, 4);

        Scanner scanner = new Scanner(System.in);
        //     dateCompare();

        
        // private static void dateCompare(){
        //     LocalDate dateNow = LocalDate.now();
        //     LocalDate datepast = LocalDate.of(2025, 10, 1);  
        // }

        // System.out.println(Unico.getTitolo());
        // System.out.println(Unico.getData());
        // System.out.println(Unico.getPostiTotali());
        // System.out.println(Unico.getPostiPrenotati());
       
        // System.out.println(Concerto.Information());
        

        // private static void dateCompare(){

        //     LocalDate dateNow = LocalDate.now();
        //     LocalDate date = LocalDate.of(01, 12, 2025)

        // }

        int[] postiTotali = { 1, 2, 3};
        //nuovo array +1
        int[] newPostiTotali = new int[postiTotali.length + 1];

        for(int i = 0; i < postiTotali.length; i++){
            newPostiTotali[i] = postiTotali[i];
            // System.out.println(postiTotali[i]);
        }

        newPostiTotali[postiTotali.length] = 4 ;
        for(int i = 0; i < newPostiTotali.length; i++){
            
            System.out.println(newPostiTotali[i]);
        }

        System.out.println(String.format("%d", args));
        
        // for (int i = newPostiTotali.length - 1; i <= 0; i--){
        //     System.out.println(newPostiTotali[i]);
        // }

        // Evento iteratore = new Evento(arrayPostiTotali);

        // System.out.println(Arrays.toString(arrayPostiTotali));
        // // System.out.println(iteratore.get);

        // while(iteratore.hasAncoraPosti()){
        //     System.out.println("posto" + (iteratore.getPostiTotali() + 1) + ", valore: " + iteratore.getPostiTotali());
        // }

        // // for( )
        // String dataFormattata = String.format(null, args)
        // System.out.println();
        scanner.close();
    }
}
