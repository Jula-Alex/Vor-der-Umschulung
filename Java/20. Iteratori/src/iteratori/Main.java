package iteratori;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("Mazda");
		
		// Get the iterator
		Iterator<String> it = cars.iterator();
		
		// Print one item every time
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		// Or you can use the folowing method to iterate all the item
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
/*
 * La differenza tra for loop e Iterator e' che for loop principalmente viene usato
 * per eseguire un blocco di istruzioni determinate volte mentre Iterator e' 
 * utilizzato per attraversare gli elementi di una collezione uno alla volta, indipendentemente dalla loro struttura o dimensione.
 */
		// Make a collection
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		System.out.println("----------------------------------------------------");
		// Removing Items from a Collection
		// Utilizzo di un iterator per attraversare la lista e rimuovere elementi pari
		Iterator<Integer> iterazione = numbers.iterator();
		while(iterazione.hasNext()) {
			int num = iterazione.next();
			if (num % 2 == 0) {
				iterazione.remove(); // Rimuove l'elemento
			}
		}
		
		// Stampare gli elementi rimanenti dopo la rimozione
		System.out.println("Elementi rimanenti dopo la rimozione degli elemnti pari: ");
		for (Integer numero : numbers) {
			System.out.println(numero);
		}
		
		
		
		
	}

}
