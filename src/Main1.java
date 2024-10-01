import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci un numero");
            int totaleValori = scanner.nextInt();
            scanner.nextLine();
            HashSet<String> parole = new HashSet<String>();
            HashSet<String> paroleDuplicate = new HashSet<String>();
            for (int i = 0; i < totaleValori; i++) {
                System.out.println("inserisci una parola");
                String valore = scanner.nextLine();
                boolean esiste = parole.add(valore);
                if(!esiste){paroleDuplicate.add(valore);
                }

            }
            System.out.println("valori duplicati: "+paroleDuplicate);
            System.out.println("Numero valori duplicati: "+paroleDuplicate.size());
            System.out.println("elenco valori distinti: "+ parole);
            System.out.println("Numero valori distinti: " + parole.size());
            scanner.close();
        }catch (Exception e ){
            System.out.println("Errore");

            e.printStackTrace();
        }
    }




}