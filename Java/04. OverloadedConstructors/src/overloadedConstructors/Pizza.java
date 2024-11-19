package overloadedConstructors;

public class Pizza {
	String impasto;
	String salsa;
	String formaggio;
	String extra;
	String extra2;
	
	// stessi costruttori con parametri multipli 
	// x1
	Pizza(String impasto){
		this.impasto = impasto;
		System.out.println("ingredienti: " + impasto);
	}
	// x2
	Pizza(String impasto, String salsa){
		this.impasto = impasto;
		this.salsa = salsa;
		System.out.println("ingredienti: " + impasto + ", " + salsa);
	}
	// x3
	Pizza(String impasto, String salsa, String formaggio){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		System.out.println("ingredienti: " + impasto + ", " + salsa + ", " + formaggio);
	}
	// x4
	Pizza(String impasto, String salsa, String formaggio, String extra){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		System.out.println("ingredienti: " + impasto + ", " + salsa + ", " + formaggio + ", " + extra);
	}
	// x5
	Pizza(String impasto, String salsa, String formaggio, String extra, String extra2){
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		this.extra2 = extra2;
		System.out.println("ingredienti: " + impasto + ", " + salsa + ", " + formaggio + ", " + extra + ", " + extra2);
	}
}
