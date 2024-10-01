import java.util.HashMap;
import java.util.Map;


public class Rubrica {
    private HashMap<String, String> contatti;

    public Rubrica() {
        contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String numero) {
        contatti.put(nome, numero);
        System.out.println("Contatto aggiunto: " + nome + " - " + numero);
    }

    public void rimuoviContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto rimosso");
        } else {
            System.out.println("Contatto non trovato");
        }
    }

    public String cercaNomePerNumero(String numero) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return "Nessun contatto trovato con questo numero.";
    }

    public String cercaNumeroPerNome(String nome) {
        return contatti.getOrDefault(nome, "Nessun contatto trovato con questo nome.");
    }

    public void stampaContatti() {
        System.out.println("Contatti nella rubrica:");
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }
}