package classiAstratte;

 public class Rettangolo extends Forma {
	private double lunghezza;
	private double larghezza;
	
	Rettangolo(double lunghezza, double larghezza) {
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
	}
	
	@Override
	double calcolaArea() {
		double risultato = lunghezza * larghezza;
		System.out.println("Area del rettangolo: " + risultato);
		return risultato;
	}
	
	@Override
	double calcolaPerimetro() {
		double risultato =  2 * (lunghezza + larghezza);
		System.out.println("Perimetro del rettangolo: " + risultato);
		return risultato;
	}
	
}
