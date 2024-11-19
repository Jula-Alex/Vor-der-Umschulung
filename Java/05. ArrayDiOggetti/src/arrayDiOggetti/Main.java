package arrayDiOggetti;

public class Main {

	public static void main(String[] args) {
		
		// creazione di un Array finito semplice
		int[] numeri = new int[3];
		// inizializzazione - populazione
		numeri[0] = 1;
		numeri[1] = 2;
		numeri[2] = 3;
		
		// creazione e inizializzazione di un Array infinito semplice
		int[] altroModo = {1, 2, 3, 4, 5, 6, 7}; 
		
		// creazione di oggetti 
		Persona persona1 = new Persona("Luca", "Rossi", "blue", 25);
		Persona persona2 = new Persona("Marco", "Verdi", "rossi", 35);
		Persona persona3 = new Persona("Anna", "Neri", "verdi", 23);
		
		// creazione di un Array di oggetti
		Persona[] arrayDiOggetti = {persona1, persona2, persona3};
		System.out.println("Lunghezza del Array: " + arrayDiOggetti.length);
		
		arrayDiOggetti[0] = persona1;
		arrayDiOggetti[1] = persona2;
		arrayDiOggetti[2] = persona3;
		
		for (int i = 0; i < arrayDiOggetti.length; i++) {
			System.out.println(arrayDiOggetti[i]);
		}
		
	}

}
