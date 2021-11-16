package aplicacion;
import dominio. *;
public class Principal{
	public static void main(String[] args){
		//CONSTRUCTORES SE UTILIZAN CON CLASES
		
		Clase mates = new Clase("matematicas",54);
		Clase programacion = new Clase("Programacion", 123);
		System.out.println(programacion + "\n" + mates);
	}
}
