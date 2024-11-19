package polimorfismo;
/*
 * Polimorfismo e la capacita di un oggetto di identificarsi con piu tipi di forme
 * cioe collegarsi a piu tipi di dati
 */
public class Main {

	public static void main(String[] args) {
		
		Studente studente1 = new Studente("Jula", "Alex");
		Studente studente2 = new Studente("Stoica", "Veronica");
		Insegnante insegnante1 = new Insegnante("Stoica", "Mihai");
		
		Persona[] classe = {studente1, studente2, insegnante1};
		
		for (Persona persona : classe) {
			persona.saluta();
		}
		
		for (Persona persona : classe) {
			
		}

	}

}
