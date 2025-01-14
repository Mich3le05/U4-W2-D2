
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
//        lo scanner è usato per leggere dati dall'input dell'utente
        Scanner scanner = new Scanner(System.in);
        int elementiN = 0;
        boolean inputValido = false;

        do {
            try {
                System.out.println("Quanti elementi vuoi aggiungere?");
                elementiN = scanner.nextInt();
                if (elementiN <= 0) {
                    throw new Exception("Devi inserire un numero maggiore di 0.");
                }
                inputValido = true;
            } catch (Exception e) {
                System.out.println("Errore: inserisci un numero intero positivo.");
                scanner.nextLine();
            }
        } while (!inputValido);

        scanner.nextLine();

        Set<String> elementiUnici = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        System.out.println("Scrivi le parole:");
        for (int i = 0; i < elementiN; i++) {
            System.out.println("Parola " + (i + 1) + ":");
            String parola = scanner.nextLine();

            if (!elementiUnici.add(parola)) {
                duplicati.add(parola);
            }
        }

        System.out.println("\nParole duplicate:");
        if (duplicati.isEmpty()) {
            System.out.println("Nessuna parola duplicata trovata.");
        } else {
            duplicati.forEach(System.out::println);
        }

        System.out.println("\nNumero di parole distinte: " + elementiUnici.size());

        System.out.println("\nElenco delle parole distinte:");
        elementiUnici.forEach(System.out::println);

        scanner.close();
    }
}




