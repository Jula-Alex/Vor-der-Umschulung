package metodoToString;

public class Persona {
	String nome;
	String cognome;
	int eta;
	String occhi;
	
	Persona(String nome, String cognome, int eta, String occhi){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.occhi = occhi;
	}
	
	// questa e' una funzione specifica toString(), se dai un altro nome non funziona
	public String toString() { 
		String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.occhi;
		return stringa;
	}
	
	
}
