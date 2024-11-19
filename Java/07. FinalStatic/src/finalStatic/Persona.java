package finalStatic;

public class Persona {
	String nome;
	static String cognome;
    static int numeroPersone; // di default 0 
	
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		numeroPersone++;
		System.out.print(numeroPersone + ", ");
	}
	
	public String toString() {
		String string = this.nome + " " + this.cognome;
		return string;
	}
	
	static void mostraNumeroPersone() {
		System.out.println("Il numero di persone create " + numeroPersone);
	}
	
}
