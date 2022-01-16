package aplicacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal{
	public static void main(String args[]){

		//Para que te de el dia actual
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate: " + localDate);

		//Para que te de la hora actual
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime: " + localTime);
		
		//Para que te de el dia y la hora actuales
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: " + localDateTime);
		
		//Formatea el dia y la hora actuales en el patron que pones entre parentesis
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("LocalDateTime con formato: " + localDateTime.format(formatter));
	}
}
