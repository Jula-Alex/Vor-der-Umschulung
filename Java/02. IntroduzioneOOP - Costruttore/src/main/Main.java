package main;

public class Main {
	
	public static void main(String[] args) {
	// Introduzione OOP - Object Oriented Programing
			/* Andiamo a ricreare delle entita che esistono nella vita reale 
			 * e le andiamo a trattare come oggetti nella programmazione
			 * Quindi ogni cosa che esiste nella realta persino persone e animali
			 * possono essere OGGETTI nella programmazione 
			 * Una funzione scritta fuori da una classe e' una funzione,
			 * Una funzione scritta all'interno di una classe e' un metodo
			 * Java e' tutto a classi quindi abbiamo metodi dappertutto
			 */
	Persona persona1 = new Persona("Jula", "Alex", 28, "viola");
	persona1.saluta();
	persona1.cognome();
	persona1.addizione(10, 20);
	
	}	
}