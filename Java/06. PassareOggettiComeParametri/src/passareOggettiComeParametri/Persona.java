package passareOggettiComeParametri;

public class Persona {
	String nome;
	String cognome;
	String colorePreferito;
	int	eta;
	
	Persona(String nome, String cognome, String colorePreferito, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.colorePreferito = colorePreferito;
		this.eta = eta;
	}
	
	public String toString() {
		String string = this.nome + " " + this.cognome + " " + this.colorePreferito + " " + this.eta;
		return string;
	}
	
	void saluta(Persona personaDaSalutare) {
		System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + this.nome);
		daDinMana();
	}

	void daDinMana() {
		System.out.println("Dau din mana Bobitaaaaaa");
	}
}
