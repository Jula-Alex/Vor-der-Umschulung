package exception;
import java.util.InputMismatchException;
/*
 * Un Exception e' una situazione che puo succedere attraverso un evento che altera
 * il flusso del programma
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Inserire un numero: ");
			int x = scanner.nextInt();
			
			System.out.println("Inserire il secondo nuemro: ");
			int y = scanner.nextInt();
			
			int result = x / y;
			System.out.println("Risultato: " + result);
		}catch(ArithmeticException erroreAritmetico) {
			System.out.println("Non puoi dividere per zero");
		}catch(InputMismatchException erroreTipo) {
			System.out.println("Non puoi dividere un numero per una stringa");
		}catch(Exception errore) {
			System.out.println("C'è stato un errore");
		}finally {
			//System.out.println("Eseguito a prescindere");
			scanner.close();
		}
		
		System.out.println("Sono oltre");

	}

}
