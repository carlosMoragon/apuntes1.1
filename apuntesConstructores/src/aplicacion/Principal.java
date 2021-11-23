package aplicacion;
import dominio. *;

/**
 * @author Carlos Moragon
 */

public class Principal{
	public static void main(String[] args){
		//CONSTRUCTORES SE UTILIZAN CON CLASES
		//Esto es un ejemplo de como utilizar constructores en la clase principal
		
		Clase mates = new Clase("matematicas",54);
		Clase programacion = new Clase("Programacion", 123);
		System.out.println(programacion + "\n" + mates);
	}
}
