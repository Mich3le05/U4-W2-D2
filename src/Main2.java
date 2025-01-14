import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static ArrayList<Integer> numeriCasuali(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static ArrayList<Integer> listaConInvertiti(ArrayList<Integer> lista) {
        ArrayList<Integer> nuovaLista = new ArrayList<>(lista);
        ArrayList<Integer> invertita = new ArrayList<>(lista);
        Collections.reverse(invertita);
        nuovaLista.addAll(invertita);
        return nuovaLista;
    }

    public static void stampaPariODispari(ArrayList<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            }
        }
    }

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

        ArrayList<Integer> listaCasuale = numeriCasuali(n);
        System.out.println("Lista originale ordinata: " + listaCasuale);

        ArrayList<Integer> listaFinale = listaConInvertiti(listaCasuale);
        System.out.println("Lista con inversi aggiunti: " + listaFinale);

        System.out.println("Vuoi stampare gli elementi in posizioni pari? (true/false)");
        boolean pari = scanner.nextBoolean();

        System.out.println("Elementi selezionati:");
        stampaPariODispari(listaFinale, pari);

        scanner.close();
    }
}

