package eredietarietaInheritance;

public class Persona {
	String nome;
	String cognome; 
	
	Persona(String nome, String cognome){
		this.nome = nome; 
		this.cognome = cognome;
	}
	
	void saluta() {
		System.out.println("Ciao!");
	}
}
