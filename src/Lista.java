import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lista {

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
}
