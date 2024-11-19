package incapsulamento;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta; 
	
	Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public String saluta() {
		String string = "Ciao, io sono " + nome + " " + cognome + " ed ho " + eta + " anni.";
		System.out.println(string);
		return string;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String toString() {
		String string = this.nome + " " + this.cognome + " " + this.eta;
		return string;
	}
	
}
