package lavorareConIFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		// creato con Eclipse, il file si trova nello stesso folder del progetto
		File file1 = new File("prova.txt");
		
		if(file1.exists()) {
			System.out.println("Il file1 esiste");
			System.out.println("Il percorso di file1 e': " + file1.getPath());
			System.out.println("Il percorso specifico di file1 e': " + file1.getAbsolutePath());
			System.out.println("Il file1 e' un file ? " + file1.isFile());
			System.out.println("Il file1 e' una cartella/directory ? " + file1.isDirectory());
		}else {
			System.out.println("Il file non esiste");
		}
		
		System.out.println("--------------------------------------------------");
		
		// si puo creare ovunque nel pc, basta copiare il path
		// si puo usare anche il slash normale / (uno solo) al posto delle due \\
		File file2 = new File("C:\\Users\\grow4\\Desktop");
		
		if(file2.exists()) {
			System.out.println("Il file2 esiste");
			System.out.println(file2.getPath());
			System.out.println(file2.getAbsolutePath());
			System.out.println(file2.isFile());
			System.out.println(file2.isDirectory());
		}else {
			System.out.println("Il file2 non esiste");
		}
		
		System.out.println("--------------------------------------------------");
		
		File file3 = new File("src");
		
		if(file3.exists()) {
			System.out.println("Il file esiste");
			System.out.println(file3.getPath());
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.isFile());
			System.out.println(file3.isDirectory());
		}else {
			System.out.println("Il file non esiste");
		}
		System.out.println("--------------------------------------------------");
		
		try {
			FileWriter writer = new FileWriter("prova.txt");
			writer.write("Ciao sono Alex, sto facendo il corso di Java ed ho scritto questa riga con write()");
			writer.write("\nwrite() riscrive tutto mentre append() aggiunge al testo gia scritto ");
			writer.append("\nCiao, questa riga invece l'ho scritta con append(), fai caso che append() aggiunge\nal testo gia scritto");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader("prova.txt");
			/* quando andiamo a leggere il file ci restituisce non una stringa 
			 * o una serie di stringhe ma una stream di ogni carattere in parte e 
			 * c'e lo restituira attraverso l'indice ASCII. Per leggere tutto si
			 * puo usare il while()
			 */
			int data = reader.read();
			System.out.println("Questa e' la lettura del primo carattere in ASCII: " + data + " che sarebbe:\n" + ((char)data) + " trasformato in carattere con ((char(data)");
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
