package main;

public class Persona {

	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	
	Persona(String nome, String cognome, int eta, String colorePreferito){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;	
		//System.out.println("Il mio nome e' " + nome + "\nIl mio cognome e' " + cognome);
	}
	
	void saluta() {
		System.out.println("ciao sono " + this.nome);
	}
	
	void cognome() {
		System.out.println(this.cognome);
	}
	
	void addizione(int a, int b ) {
		int risultatoAddizione = a + b;
		System.out.println("dalla variabile risultatoAddizione nella funzione addizione() e' " + risultatoAddizione + " - \n in base ai parametri messi");
		this.altraFunzione(risultatoAddizione); // in base ai parametri 
		// qui la variabile scope locale risultato viene passata nel parametro di un'altra funzione 
	}
	
	void altraFunzione(int passato) {
		// variabili risultato sono con nome uguale ma scope diversi
		int risultato2 = 50 + 50;
		System.out.println("nella funzione addizione() ci ho messo il collegamento \n this.altraFunzione() il cui parametro e' la variabile risultatoAddizione che e' stata salvata \n nel parametro della funzione altraFunzione() il cui risultato e' l'addizione della funzione \n addizione() che e':" + passato + " rispetto al parametro inserito nella inizializzazione"); // variabile prova e' la variabile in cui viene salvato la variabile risultato di sopra
		System.out.println("questa linia e' dalla variabile risultato2 nella funzione risultato() e' " + risultato2); // 100 fisso variabile risultato di questa funzione che e' di tipo scope locale
	}
	
	
}
