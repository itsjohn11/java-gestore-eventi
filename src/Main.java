import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Costruttore
        Evento Concerto = new Evento("unico", 01/10/2025, 1000);

        Scanner scanner = new Scanner(System.in);

        System.out.println(Concerto.titolo);
        System.out.println(Concerto.data);
        System.out.println(Concerto.postiTotali);
        System.out.println(Concerto.postiPrenotati);
        System.out.println(Concerto.Information());
        
        scanner.close();
    }
}
