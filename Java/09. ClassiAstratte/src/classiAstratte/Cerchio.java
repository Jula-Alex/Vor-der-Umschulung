package classiAstratte;

import java.text.DecimalFormat;

public class Cerchio extends Forma {
	private double raggio;
	
	Cerchio(double raggio){
		this.raggio = raggio;
	}
	
	@Override 
	public double calcolaArea() {
		double risultato = Math.PI * Math.pow(raggio, 2);
		return risultato;
	}
	
	@Override
	public double calcolaPerimetro() {
		return Math.PI * raggio;
	}
}
