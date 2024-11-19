package iteratori2;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator sono degli oggetti che ci permettono di iterare una colezioni di dati 
 */
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> persone = new ArrayList<String>();
		persone.add("Alex");
		persone.add("Mihai");
		persone.add("Veronica");
		persone.add("Alessia");
		
		Iterator<String> iteratoreFico = persone.iterator();
/*		System.out.println(iteratoreFico.next());
		System.out.println(iteratoreFico.next());
		System.out.println(iteratoreFico.next());
		System.out.println(iteratoreFico.next());   */
		
		while(iteratoreFico.hasNext()) {
			//System.out.println(iteratoreFico.next());
			String persona = iteratoreFico.next();
			if(persona == "Mihai") {
				iteratoreFico.remove();
			}
		}
//		System.out.println(iteratoreFico.next()); NoSuchElementException
		System.out.println(persone);

	}

}
