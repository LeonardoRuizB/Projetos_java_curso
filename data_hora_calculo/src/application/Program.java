package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-04-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-10T01:30:26");
		Instant d06 = Instant.parse("2023-04-10T01:30:26Z");
		
		// Aumentar e diminuir dia/mes/ano/hora
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		// Calcular a duração de tempo de um e outro
		
		//                             		03/04/2023						10/04/2023	 
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		//                            	 03/04/2023			10/04/2023	 
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		//                             03/04/2023	  10/04/2023	 
		Duration t3 = Duration.between(pastWeekInstant, d06);
		//                          10/04/2023		03/04/2023
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());
		
		
	}

}
