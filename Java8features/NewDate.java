package Java8features;

import java.time.LocalDate;

public class NewDate {

	public static void main(String[] args) {

      LocalDate of= LocalDate.of(2025,01,03);
      System.out.println(of);
      
      LocalDate d=LocalDate.now();
      System.out.println("Present date is"+d);
      
      LocalDate plusDays = d.plusDays(3);
      System.out.println(plusDays);
      
      LocalDate plye=d.plusYears(2);
      System.out.println(plye);
      
      LocalDate plusMonths = d.plusMonths(5);
      System.out.println(plusMonths);
      
      boolean lpy = LocalDate.parse("2025-03-01").isLeapYear();
      System.out.println(lpy);
      

	}

}
