package aplicacion;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		boolean condicion = true;
		if(numero < 10){
			System.out.println("El numero es menor a 10");
		} else if (numero <20){
			System.out.println("El numero es menor a 20");
		} else if(condicion){
			System.out.println("Este siempre se cumple por que es un boolean true");
		}
		System.out.println("Despues del if");

	}

}
