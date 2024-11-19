package classiAstratte;

/*
 * Una classe astratta in Java e' una classe che non puo essere istanziata 
 * direttamente. Cio significa che non puoi creare un oggetto direttamente da una
 * classe astratta. Tuttavia, puoi estendere una classe astratta creando una 
 * sottoclasse, e quindi istanziare la sottoclasse.
 */
public class Main {

	public static void main(String[] args) {
		Forma formaRettangolo = new Rettangolo(5, 10);
		formaRettangolo.calcolaArea();
		formaRettangolo.calcolaPerimetro();
		
		Forma formaCerchio = new Cerchio(3);
		System.out.println("Area del cerghio: " + formaCerchio.calcolaArea());
		System.out.println("Perimetro del cerghio: " + formaCerchio.calcolaPerimetro());
		
	}

}
