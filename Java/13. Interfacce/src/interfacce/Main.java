package interfacce;
/*
 * Le interfacce sono simili alle classi astratte di base senza body ma la differenza
 * e che mentre una classe puo estendere solo un altra'classe con l'interfaccia una 
 * classe puo implementare piu interfacce. Una interfaccia ci permette di impostare
 * dei comportamenti delle classi che tramite estensione gerarchica non possiamo fare
 * Le interfacce consentono la creazione di codice altamente astratto e possono
 * essere utilizzare per definire comportamenti comuni che piu classi possono 
 * condividere
 * L'implementazione di un'interfaccia non impica ereditarieta di implementazione, ma
 * solo l'implementazione dei metodi dichiarati nell'interfaccia stessa
 */
public class Main {

	public static void main(String[] args) {
		
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		Pesce pesce = new Pesce();
		
		gazzella.scappa();
		leone.caccia();
		pesce.caccia();
		pesce.scappa();
	}

}
