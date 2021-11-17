package aplicacion;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Carlos Moragon
 */

public class Principal{
	public static void main(String[] args){
		//Sytem.in para pedir texto a la consola
		/*Scanner sc = new Scanner(System.in);
		  String texto = "";
		  while(sc.hasNext()){
		  texto += sc.next() + " ";
		  }
		  System.out.println(texto);


		  System.out.println("Introduzca su nombre: ");
		  String nombre = sc.next();
		  System.out.println("Su nombre es " + nombre);
		  sc.close();*/
		/*//Opcion 1
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Dime un entero:");
		  int numero1 = sc.nextInt();
		  System.out.println("Dime otro entero:");
		  int numero2 = sc.nextInt();
		  int resultado = numero1 + numero2;
		  System.out.println("Esta es su suma: " + resultado);
		  sc.close();
		//Opcion 2
		int suma = 0;
		for(int i = 0; i < 2; i++){
		System.out.println("Introduzca un numero entero:");
		suma += sc.nextInt();
		}
		System.out.println("El resultado es: " + suma);
		sc.close();
		*/


		Scanner sc = new Scanner(System.in);

		boolean valor = true;
		try{
			while(valor){
				int suma = 0;
				for(int i = 0; i < 2 ; i++){
					System.out.println("Dime un numero");
					suma += sc.nextInt();
				}
				System.out.println("El resultado es:" + suma);
				valor = false;
				sc.close();
			}catch(InputMismatchException e){
				System.out.println("prueba con un numero");

			}
			System.out.println("El resultado es:" + suma1);
			sc1.close();
		}
	}
}
