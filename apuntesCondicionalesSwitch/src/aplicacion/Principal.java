package aplicacion;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Principal{
	public static void main(String[] args){
		/*System.out.println("Introduzca un numero del 1 al 7: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();*/
		/*switch(numero){
			//case 1 es para cuando la variable vale 1
			//break es para que se pare de ejecutar el codico (para delimitar el codigo)
			case 1:
				System.out.println("El numero vale 1");
				break;
			case 2:
				System.out.println("El numero vale 2");
				break;
			//dafault es para que se ejecute si no se han cumplido los casos previos
			default:
				System.out.println("El numero no es ni 1 ni 2");
		}*/
		boolean valor = true;
		Scanner sc = new Scanner(System.in);
	while(valor){
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
