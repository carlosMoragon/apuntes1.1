package aplicacion;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {
	public static void main(String[] args){
		
		System.out.println(0.1 + 0.2);

		//Con BigDecimal siempre lo ponemos entre comillas el número
		System.out.println((new BigDecimal("0.1").add(new BigDecimal("0.2"))));
		System.out.println((new BigDecimal(0.1).add(new BigDecimal(0.2))));

		//Así es como se pone el 0 en BigDecimal
		BigDecimal cero = BigDecimal.ZERO;
		System.out.println(cero);
		
		//Como declarar variables:
		BigDecimal capital = new BigDecimal("10000");
		System.out.println("capital: " + capital);
		BigDecimal redito = new BigDecimal("0.1");
		System.out.println("redito: " + redito);
		BigDecimal tiempo = new BigDecimal("1");
		System.out.println("tiempo: " + tiempo);
		
		//Como multiplicar:
		BigDecimal interes = capital.multiply(redito).multiply(tiempo);
		System.out.println("Interés sin formatear: " + interes); 
									
//----------------------------------------------------------------------------------------------------------------
		//Aquí empieza como tratar localizaciones
		
		//Locale espanna = new Locale("lenguaje", "codigo del pais")
		//El de aqui abajo es el de españa
		Locale locale = new Locale("es", "ES");
		System.out.println(locale);
		
		//Formatea el numero segun la localizacion que le des entre parentesis. 1000.0 ---> 1.000
		NumberFormat formateador = NumberFormat.getInstance(locale);
		System.out.println("Interés formateado: " + formateador.format(interes));
		
		//Formatea el numero segun la localizacion que le des como parametro, pero lo pone en forma de moneda de ese pais
		//1000.0 --->  1.000,00▒
		NumberFormat formateadorMoneda = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Interés formateado como moneda: " + formateadorMoneda.format(interes));
		
		//Formatea un numero para que solo tenga un cierto numero de decimales. En este caso 4
		NumberFormat formateadorCuatroDecimales = new DecimalFormat("#0.0000");     
		System.out.println("Número pi formateado con cuatro cifras decimales: " + formateadorCuatroDecimales.format(Math.PI));
	}
}
