package Pacchetto1;
import Pacchetto2.*;


/*
 * I modificatori di accesso sono le parole chiave che vediamo
 * davanti alle classi:
 * public, protected, default, private
 * Servono per aggiungere un livello di sicurezza aggiuntivo
 * in base alla parola chiave le classi sono accessibili:
 * nella classe, nel package, nella subclass, e dappertutto nel mondo(world)
 * 
 * 						     Accessibile in
 * 		|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||				           
 * 							                    subclass anche	    altre classi di
 * 		        classi      altri pacchetti   fuori dal pacchetto  altri pacchetti
 * public   	  si			  si				  si 			   si
 * protected	  si			  si				  si			   no
 * default	      si			  si				  no			   no
 * private  	  si			  no				  no			   no
 */

public class Main {

	public static void main(String[] args) {
		A modificatoriA = new A();
		modificatoriA.provaPublico();
		modificatoriA.provaProtected(); 
		modificatoriA.provaDefault();
		modificatoriA.provaPrivato(); // normalmente non visibile da A, ma e' stato impostato su public per scopo dimostrativo
		System.out.println("------------------------------------------");
		B modificatoriB = new B();
		modificatoriB.provaPublico();
		modificatoriB.provaProtected(); // normalmente non visibile da B
		modificatoriB.provaDefault(); // normalmente non visibile da B 
		modificatoriB.provaPrivato(); // normalmente non visibile da B
		
		System.out.println("------------------------------------------");
		C modificatoriC = new C();
		modificatoriC.provaPublico();
		modificatoriC.provaProtected();
		modificatoriC.provaDefault();
		modificatoriC.provaPrivato();
	}

}
