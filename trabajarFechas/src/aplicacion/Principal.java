package aplicacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal{
	public static void main(String args[]){
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate: " + localDate);

		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime: " + localTime);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: " + localDateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("LocalDateTime con formato: " + localDateTime.format(formatter));
	}
}
