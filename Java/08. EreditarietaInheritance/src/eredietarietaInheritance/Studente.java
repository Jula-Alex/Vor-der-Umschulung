package eredietarietaInheritance;

public class Studente extends Persona {
	
	String materiaPreferita;
	String classe;
	int[] votiFisica;

	Studente(String nome, String cognome, String materiaPreferita, String classe, int[] votiFisica) {
		super(nome, cognome);
		this.materiaPreferita = materiaPreferita;
		this.classe = classe;
		this.votiFisica = votiFisica;
	}
	
	void studia() {
		System.out.println("Il mio nome e' " + this.nome + " ed il cognome e' " + this.cognome + " amo la " + this.materiaPreferita + " sono nella classe " + this.classe + " ed il mio voto migliore e' " + votiFisica.toString());
		System.out.println("La mamma chiede... " + this.nome + " stai studiando ? " + "ed " + this.nome + " risponde: certo mamma, sto studiando...");
		System.out.println("La mamma chiede... " + this.nome + " qual'e la tua materia preferita ? Ed " + this.nome + " risponde: " + this.materiaPreferita + " mamma");
	}
	@Override
	void saluta() {
		System.out.println("Buongiorno prof!");
	}
	
}
