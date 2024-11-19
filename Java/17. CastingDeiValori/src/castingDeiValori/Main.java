package castingDeiValori;
/*
 * Implicito: automatico quando passiamo ad un tipo piu grande (int->double,float->double)
 * Esplicito: manuale quando passiamo ad un tipo piu piccolo 
 * Implicito: byte -> short -> char -> int -> long -> float -> double 
 * Esplicito: double -> float -> long -> int -> char -> short -> byte
 * byte it's a 8bit number and can be -> -128 up to 127
 * short it's a 16bit number and can be -> -32.768 up to 32.767
 * char normally it's 8bit but for all human charachters it's need 16bit
 * int it's a 32bit and can be -> -2147483648 up to 2147483647
 * long it's a 64bit and can be -> -9,223,372,036,854,775,808 up to 9,223,372,036,854,775,807
 * float it's a 32bit and can be -> very big
 * double it's a 64bit and can be -> ...
 */
public class Main {

	public static void main(String[] args) {
		double x = 9.54;
		System.out.println(x); // 9.54 -> double 
		
		int y = (int) 9.54;
		System.out.println(y); // 9 -> int 
		
		byte bite = 126;
		System.out.println(bite);
		

	}

}
