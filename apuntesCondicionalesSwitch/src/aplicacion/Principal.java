package aplicacion;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author Carlos Moragon
 */
public class Principal{
	public static void main(String[] args){
		/*System.out.println("Introduzca un numero del 1 al 7: ");
		//En la siguiente linea creas un objeto 'sc' el cual utilizas para utilizar los metodos de la clase Scanner
		//poner (System.in) para que el usuario pueda añadir contenido
		Scanner sc = new Scanner(System.in);
		//pones sc.next() para guardar la entrada del usuario
		//.next() es para Strings y .nextInt() es para ints
		int numero = sc.nextInt();
		//sc.close() es para cerrar el Scanner
		sc.close();*/
		// en la siguiente parte utilizamos un switch el cual lleva esta sintaxis
		// se puede sustituir los strings por otro tipo de variable pero siempre tiene que ser el mismo
		/*switch(String){
			//case string es para cuando la variable vale 1
			//break es para que se pare de ejecutar el codico (para delimitar el codigo)
			case string1:
				System.out.println("");
				break;
			case string2:
				System.out.println("El numero vale 2");
				break;
			//dafault es para que se ejecute si no se han cumplido los casos previos
			default:
				System.out.println("El numero no es ni 1 ni 2");
		}*/
		//Los booleans se utilizan para decir que algo es false o true
		boolean valor = true;
		Scanner sc = new Scanner(System.in);
	while(valor){
		//se utiliza el try para guardar una excepcion en una variable 'e'
		try{
		System.out.println("Intruzca un numero del 1 al 7: ");
		int numero = sc.nextInt();
		valor = false;
		switch(numero){
			case 1: System.out.println("Lunes");
				break;
			case 2: System.out.println("Martes");
				break;
			case 3: System.out.println("Miercoles");
				break;
			case 4: System.out.println("Jueves");
				break;
			case 5: System.out.println("Viernes");
				break;
			case 6: System.out.println("Sabado");
				break;
			case 7: System.out.println("Domingo");
				break;
			default: System.out.println("Eso no es un numero del 1 al 7");
				 //Al poner que es true se sale del bucle y si lo hubiesemos declarado false volveria al inicio del bucle
				 valor = true;

		}
		}catch(InputMismatchException e){ 
			sc.next();
			System.out.println("Intentalo de nuevo");
			
			 
		}
	}  
		sc.close();

}
}
