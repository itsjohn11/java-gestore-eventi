package org.event;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Evento concerto = new Concerto("Concerto", 01/10/2025, 3, 23.00, 100.0f);
        System.out.println(concerto);

        Scanner scanner = new Scanner(System.in);

        
        
        // //Posti totali
        // int[] postiTotali = new int[3];
        // //Posti totali +1
        // int[] newPostiTotali = new int[postiTotali.length + 1];

        // for( int i = 0; i < postiTotali.length; i++){
        //     newPostiTotali[i] = postiTotali[i];
        
        // }
        // newPostiTotali[postiTotali.length] = 4;

        // for( int i = 0; i < newPostiTotali.length; i++){
        //     System.out.println(newPostiTotali[i]);
        // }


        scanner.close();
    }
}
