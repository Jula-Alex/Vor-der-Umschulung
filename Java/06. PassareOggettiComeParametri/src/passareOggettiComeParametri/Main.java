package passareOggettiComeParametri;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Alex", "Jula", "viola", 28);
		Persona persona2 = new Persona("Mihai", "Stoica", "blu", 30);
		
		persona1.saluta(persona2);
		persona2.saluta(persona1);

		//System.out.println(persona1);
	}

}
