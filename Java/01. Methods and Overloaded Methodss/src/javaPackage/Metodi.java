package javaPackage;

public class Metodi {

	public static void main(String[] args) {
		faiPasta();
		cucinaQualcosa(2, "carne"); //se qua e' string anche nell parametro ce lo devi mettere
		cucinaQualcosa(1, "pasta");
		cucinaQualcosa(4, "ceci");
		cucinaQualcosa(0, "pesce");
		int variabile = addizione(21, 22);
		System.out.println(variabile);
		
		int totaleSpeso = addizione(100, 100);
		int prova = addizione(50, 50);
		System.out.println(totaleSpeso);
		System.out.println(prova);
	}

	//void significa che fa delle cose e non ritorna dei valori
	static void faiPasta() {
		System.out.println("sto cucinando la pasta");
	}
	
	static void cucinaQualcosa(int numero, String qualcosa) {

		if (numero > 1) {
			System.out.println("sto cucinando " + numero + " piatti di " + qualcosa);
		}
		else if (numero > 0) {
			System.out.println("sto cucinando un piatto di pasta");
		}
		else {
			System.out.println("non sto cucinando niente");
		}
	}

	
	static int addizione(int numero1, int numero2) {
		int risultato = numero1 + numero2; 
		return risultato;
	}
	
}
