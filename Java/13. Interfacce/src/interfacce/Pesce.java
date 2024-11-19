package interfacce;

public class Pesce implements Preda, Predatore {

	@Override
	public void caccia() {
		System.out.println("Il pesce piu grossi caccia i pesci piu piccoli");
	}
	
	@Override
	public void scappa() {
		System.out.println("Il pesce piccolo scappa dai pesci piu grossi");
	}

}
