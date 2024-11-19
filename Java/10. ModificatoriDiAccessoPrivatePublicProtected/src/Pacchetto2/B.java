package Pacchetto2;
import Pacchetto1.*;

   public class B {
	   
	   public String pubblico = "sono una variabile 'public' appartenente alla classe B nel package2 e posso essere richiamata tramite Main e altri classi di package1 visto che la mia visibilita e' impostata su public";
	   protected String protetto = "sono una variabile 'protected' appartenente alla classe B nel package2 e non posso essere richimata tramite Main o altri classi appartenenti ad altri package, eccezione fa il richiamo da una sottoclasse";
	   String defaultt = "sono una variabile 'default' appartenente alla classe B nel package2 e non posso essere richiamata tramite Main per i stessi motivi di protected, senza eccezioni";
	   private String privato = "sono la solita variabile private...";
	
	   public void provaPublico() {
		   System.out.println(pubblico);
	   }
	   
	   public void provaProtected() {
		   System.out.println(protetto);
	   }
	   
	   public void provaDefault() {
		   System.out.println(defaultt);
	   }
	   
	    
	   public void provaPrivato() {
		   System.out.println(privato);
	   }
	   
	   
}

