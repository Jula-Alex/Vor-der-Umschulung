package incapsulamento;

/*
 * Incapsulameto e' un processo in cui nascondiamo attributi di una classe 
 * all'esterno mettendoli private, diventano accessibili solo tramite dei metodi
 * getters & setters
 */
public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Alex", "Jula", 28);
		
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println(persona1.getEta());
		System.out.println(persona1);
		
		persona1.saluta();
		
		persona1.setNome("Mihai");
		persona1.setCognome("Stoica");
		persona1.setEta(30);
		
		System.out.println(persona1);
		persona1.saluta();
		
	
}

}
