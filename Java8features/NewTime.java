package Java8features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewTime {

	public static void main(String[] args) {
	
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		LocalTime plusHours = t.plusHours(2);
		System.out.println(plusHours);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		Period p=Period.between(LocalDate.parse("2027-08-03"),LocalDate.now());
		System.out.println(p);	
		
		Duration d=Duration.between(LocalTime.parse("18:00"),LocalTime.now());
		System.out.println(d);
		

	}

}
