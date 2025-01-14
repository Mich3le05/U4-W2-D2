import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti numeri casuali vuoi?");
        int n = 0;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Il numero deve essere positivo!");
                } else {
                    inputValido = true;
                }
            } catch (Exception e) {
                System.out.println("Devi inserire un numero intero positivo.");
                scanner.nextLine();
            }
        }

        ArrayList<Integer> listaCasuale = Lista.numeriCasuali(n);
        System.out.println("Lista originale ordinata: " + listaCasuale);

        ArrayList<Integer> listaFinale = Lista.listaConInvertiti(listaCasuale);
        System.out.println("Lista con inversi aggiunti: " + listaFinale);

        System.out.println("Vuoi stampare gli elementi in posizioni pari? (true/false)");
        boolean pari = scanner.nextBoolean();

        System.out.println("Elementi selezionati:");
        Lista.stampaPariODispari(listaFinale, pari);

        scanner.close();
    }
}
