package src;

import java.time.*;
import java.time.temporal.ChronoField;
public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.getMonth());
		System.out.println(currentDate.getMonthValue());
		System.out.println(currentDate.get(ChronoField.DAY_OF_MONTH));
		
		
		System.out.println("Adding 4 days to current date");
		currentDate.plusDays(4);
		System.out.println(currentDate.getDayOfMonth());
		System.out.println(currentDate.get(ChronoField.DAY_OF_MONTH));
		
		
	}

}
