package Pacchetto1;
import Pacchetto2.*;

   public class A {
	 
	 public String pubblicoC = "sono una variabile 'public' appartenente alla classe A di pacchetto1 richiamata da un'altra classe in pacchetto2 tramite estensione ed essendo pubblica funziono dappertutto";
	 protected String protettoC = "sono una variabile 'protected' appartenente alla classe A di pacchetto1 richiamata da un'altra classe in pacchetto2 tramite estensione e cio e' possibile solo tramite una sottoclasse";
	 public String defaulttC = "sono una variabile 'default' appartenente alla classe A di pacchetto1 e non posso essere richiamata in pachetto2 neanche attraverso sottoclasse perche la mia visibilita e' impostata su default, cioe sono visibile solo nel mio package";
	 public String privatoC = "sono la solita private...";
	 //^
	 //|--> normalmente private ma per essere visibile dalla classe C per scopo dimostrativo e' stato impostato su public, potrebbe essere impostato anche su protected ma non default o privato
	 public String pubblicoA = "sono una variabile 'public' appartenente alla classe A di pacchetto1 richiamata nel pacchetto1 dal Main(anche lui nella mia classe)";
	 protected String protettoA = "sono una variabile 'protected' appartenente alla classe A di pacchetto1 richiamata nel mio pacchetto dal Main";
	 public String defaulttA = "sono una variabile 'default' appartenente alla classe A di pacchetto1 richiamata nel mio pacchetto dal Main";
	 public String privatoA = "sono una variabile 'privata' appartenente alla classe A di pacchetto1 e posso essere visibile solo dalla mia classe, non da altri classi e non da altri package, neache attraverso sottoclasse";
	 
	 public void provaPublico() {
		   System.out.println(pubblicoA);
	   }
	   
	   protected void provaProtected() {
		   System.out.println(protettoA);
	   }
	   
	   void provaDefault() {
		   System.out.println(defaulttA);
	   }
	   
	   
	   public void provaPrivato() {
		   System.out.println(privatoA);
	   }
}
