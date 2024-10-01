import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleziona un'opzione:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Cerca contatto per numero");
            System.out.println("4. Cerca numero per contatto");
            System.out.println("5. Stampa contatti");
            System.out.println("6. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il numero di telefono:");
                    String numero = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, numero);
                    break;
                case 2:
                    System.out.println("Inserisci il nome del contatto da rimuovere:");
                    String nomeDaRimuovere = scanner.nextLine();
                    rubrica.rimuoviContatto(nomeDaRimuovere);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di telefono da cercare:");
                    String numeroDaCercare = scanner.nextLine();
                    String nomeTrovato = rubrica.cercaNomePerNumero(numeroDaCercare);
                    System.out.println(nomeTrovato);
                    break;
                case 4:
                    System.out.println("Inserisci il nome da cercare:");
                    String nomeDaCercare = scanner.nextLine();
                    String numeroTrovato = rubrica.cercaNumeroPerNome(nomeDaCercare);
                    System.out.println(numeroTrovato);
                    break;
                case 5:
                    rubrica.stampaContatti();
                    break;
                case 6:
                    scanner.close();
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }

    }
}
