package dataEOre;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDate x = LocalDate.now();
		System.out.println(x);
		
		LocalTime y = LocalTime.now();
		System.out.println(y);
		
		DateTimeFormatter formattare = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime b = LocalDateTime.now();
		System.out.println(b.format(formattare)); 
		
		DateTimeFormatter formattare1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDateTime c = LocalDateTime.now();
		System.out.println(c.format(formattare1));
		
		DateTimeFormatter formattare2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		LocalDateTime d = LocalDateTime.now();
		System.out.println(d.format(formattare2));
		
		DateTimeFormatter formattare3 = DateTimeFormatter.ofPattern("dd MMMM yy");
		LocalDateTime e = LocalDateTime.now();
		System.out.println(e.format(formattare3));
		
		DateTimeFormatter formattare4 = DateTimeFormatter.ofPattern("E, dd MMMM yy");
		LocalDateTime f = LocalDateTime.now();
		System.out.println(f.format(formattare4));
		
		DateTimeFormatter formattare5 = DateTimeFormatter.ofPattern("EEEE dd MMMM yy");
		LocalDateTime g = LocalDateTime.now();
		System.out.println(g.format(formattare5));

	}

}
