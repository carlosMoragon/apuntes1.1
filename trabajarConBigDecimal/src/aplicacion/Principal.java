package aplicacion;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {
	public static void main(String[] args){
		System.out.println(0.1 + 0.2);
		System.out.println((new BigDecimal("0.1").add(new BigDecimal("0.2"))));
		System.out.println((new BigDecimal(0.1).add(new BigDecimal(0.2))));
		BigDecimal cero = BigDecimal.ZERO;
		System.out.println(cero);
		
		BigDecimal capital = new BigDecimal("10000");
		BigDecimal redito = new BigDecimal("0.1");
		BigDecimal tiempo = new BigDecimal("1");
		BigDecimal interes = capital.multiply(redito).multiply(tiempo);
		System.out.println("Interés sin formatear: " + interes);
		Locale locale = new Locale("es", "ES");
		NumberFormat formateador = NumberFormat.getInstance(locale);
		System.out.println("Interés formateado: " + formateador.format(interes));
		NumberFormat formateadorMoneda = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Interés formateado como moneda: " + formateadorMoneda.format(interes));
		NumberFormat formateadorCuatroDecimales = new DecimalFormat("#0.0000");     
		System.out.println("Número pi formateado con cuatro cifras decimales: " + formateadorCuatroDecimales.format(Math.PI));
	}
}