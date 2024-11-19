package finalStatic;

public class Main {

	public static void main(String[] args) {
		// final indica una variabile che non puo essere modificata nel corso del programma
		int variabile = 5;
		
		variabile = 10;
		
		System.out.println(variabile);
		
		// final indica una variabile che non puo essere modificata nel corso del programma
		// simile a const di javascript o C#
		final int variabileFissa = 4;
		
		//variabileFissa = 10; non me lo fa fare essendo definita final -> sopra
		
		System.out.println("Il numero sopra e' variabile il numero sotto e' fisso-final");
		System.out.println(variabileFissa + "\n");
		System.out.println("Ora facciamo il static:");
		
		// ---------------------------------------------------------------------
		// static vuol dire che quel attributo e univoco per tutte le istanze della classe
		Persona persona1 = new Persona("Jula", "Alex"); // istanza
		Persona persona2 = new Persona("Mihai", "Stoica"); // istanza
		Persona persona3 = new Persona("dfas", "sdgf"); // istanza
		Persona persona4 = new Persona("fsdf", "etrw"); // istanza
		Persona persona5 = new Persona("hfg", "dgsd"); // istanza
		// visto che il costruttore ha creato 5 oggetti ha fatto anche 0++ per 5 volte
		
		System.out.println("\n" + persona1);
		System.out.println("numero persone: " + Persona.cognome);
		
		Persona.mostraNumeroPersone();
		
	}

}
