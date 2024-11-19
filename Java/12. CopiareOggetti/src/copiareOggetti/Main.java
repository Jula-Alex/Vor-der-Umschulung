package copiareOggetti;
/*
 * Gli Oggetti si possono copiare tramite metodo o tramite costruttore
 */
public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Alex", "Jula");
		Persona persona2 = new Persona("Mihai", "Stoica");
		// copiare tramite metodo
		persona2.copia(persona1);
		
		persona1.setNome("Veronica");
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println();
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println();
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
	}

}
