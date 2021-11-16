package aplicacion;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("mete una palabra");
		String palabra1 = sc.next();
		System.out.println("mete otra palabra");
		String palabra2 = sc.next();

		if(palabra1.toUpperCase().equals(palabra2.toUpperCase())){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		//cuando usamos el == en Strings no estamos viendo si son iguales si no si apuntan al mismo sitio en memoria

		//si tu creas String1 = "hola"; y String2 = "hola"; el String2 no se crea si no que dice q ya hay uno creado y coge la dirección de String1 en cambio si invocas al constructor
		//String string1 = new String("hola") no apuntan al mismo sitio. EL == NUNCA SE UTILIZA!!!!! se utiliza .equals
		
		//otra opcion .compareTo() te devuelve un numero que es la resta de las 2 variables

		//if(palabra1.equalsIgnoreCase(palabra2))  .equalsIgnoreCase() es ignorando mayusculas y minusculas

	}
}
