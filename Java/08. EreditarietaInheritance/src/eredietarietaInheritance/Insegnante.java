package eredietarietaInheritance;

public class Insegnante extends Persona {
	
	String materia;
	String[] classi;
	
	Insegnante(String nome, String cognome, String materia, String[] classi){
		super(nome, cognome);
		this.materia = materia;
		this.classi = classi;
	}
	
	void insegna() {
		System.out.println("Ciao a tutti, io sono la vostra insegnante e mi chiamo " + this.nome + " oltre alla vostra classe insegno " + this.materia + " nelle classi " + this.classi.toString());
	}
	@Override
	void saluta() {
		System.out.println("Buongiorno ragazzi della classe " + this.classi.toString());
	}
	@Override
	public String toString() {
		return this.nome + this.cognome + this.materia + this.classi.toString(); 		
	}
	
	
}
