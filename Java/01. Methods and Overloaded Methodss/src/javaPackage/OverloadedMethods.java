package javaPackage;

public class OverloadedMethods {

	public static void main(String[] args) {
		// le OverloadedMethods sono funzioni con lo stesso nome ripetuto piu volte
		// con combinazione di parametri diversi
		int doppioInt = addizione(2, 3);
		int triploInt = addizione(5, 10, 9);
		double doppioDouble = addizione(2.4, 2.5);
		System.out.println(doppioInt);
		System.out.println(triploInt);
		System.out.println(doppioDouble);
	}

	static int addizione(int numero1, int numero2) {
		int risultato = numero1 + numero2;
		return risultato;
	}
	static int addizione(int numero1, int numero2, int numero3) {
		int risultato = numero1 + numero2 + numero3;
		return risultato;
	}
	static int addizione(int numero1, int numero2, int numero3, int numero4) {
		int risultato = numero1 + numero2 + numero3 + numero4;
		return risultato;
	}
	static double addizione(double numero1, double numero2) {
		double risultato = numero1 + numero2;
		return risultato;
	}
}
