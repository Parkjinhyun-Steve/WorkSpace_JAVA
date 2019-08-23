package p284;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeAPIex {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(LocalDateTime.now());  // p285
		
		System.out.println(LocalDateTime.of(2017, Month.JANUARY, 1, 1, 23, 45));  //p287
		System.out.println(LocalDateTime.of(2017, 1, 1, 1, 23, 45, 678_000_000));  //p287
		
		System.out.println(LocalDateTime.parse("2017-01-01T01:23:45.678"));  //p287
		
		System.out.println(dateTime.getMonth());  //288
		System.out.println(dateTime.plusMonths(3));  //288		
		

	}

}
