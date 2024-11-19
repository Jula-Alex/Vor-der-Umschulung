package eredietarietaInheritance;
/*
 * Eredietarieta e' quel meccanismo che permette a una classe di derivare da 
 * un'altra classe ed erreditare metodi e variabili di istanza
 * extend puo estendere una sola classe
 * L'uso di extend crea una relazione di tipo "è un.." ad esempio una classe 
 * 'Forma' che estende una classe 'Rettangolo' si puo dire che 
 * "un Rettangolo è una Forma"
 */
public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Jula", "Alex");
		persona1.saluta();
		
		int[] votiFisica = {8, 9, 10};
		Studente studente1 = new Studente("Mihai", "Stoica", "Matematica", "2D", votiFisica);
		studente1.studia();
		System.out.println(studente1.nome);
		studente1.saluta();
		
		Insegnante insegnante1 = new Insegnante("Veronica", "Stoica", "Storia", new String[] {"2D", "3D", "4F"});
		Insegnante insegnante2 = new Insegnante("Alex", "Jula", "Religione", new String[] {"1A", "2B", "3A"});
		//insegnante1.studia(); classe Insegnante non puo accedere ad altre classi
		insegnante1.insegna(); 
		insegnante1.saluta(); 
		insegnante2.insegna();
		insegnante2.saluta();
		
		System.out.println("start");
		insegnante1.toString();
		System.out.println("stop");
		
	
	

	}

}
