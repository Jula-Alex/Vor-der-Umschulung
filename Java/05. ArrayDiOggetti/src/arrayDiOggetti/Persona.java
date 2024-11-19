package arrayDiOggetti;

public class Persona {
	String nome;
	String cognome;
	String occhi;
	int eta;
	
	Persona(String nome, String cognome, String occhi, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.occhi = occhi;
		this.eta = eta;
	}
	
	public String toString() {
		String stringa = this.nome + " " + this.cognome + " " + this.occhi + " " + this.eta;
		return stringa;
	}
}
