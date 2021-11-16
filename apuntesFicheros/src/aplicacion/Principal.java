package aplicacion;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Principal{
	public static void main(String[] args){
		//try{} es para atrapar excepciones
		try{
		//creamos un fichero con el nombre fichero.txt
		FileWriter fw  = new FileWriter("fichero.txt");
		//write para escribir y close para cerrar el fichero
		fw.write("Contenido del fichero");
		fw.close();
		//Exception es general para todas las excepciones. Aqui expecificamos en las excepciones IOException
		}catch(IOException e){
			System.out.println("Algo ha fallado al intentar escribir en el fichero");
		}
		//El metodo next te le palabra por palabra
		System.out.println("Se ha escrito el fichero");
		try{
		//File nos permite crear un objeto de fichero para poder trabajar con el
		//Scanner para poder leer el fichero
		String nombreFichero = "fichero.txt";
		Scanner sc = new Scanner(new File(nombreFichero));

		//Al crear un bucle con hasNext nos dice si hay mas informacion que leer del fichero
		//try{}catch(Exception e) nos captura la excepcion (en este caso de tipo genera) y a esa exception le da un valor e
		while(sc.hasNext()){
			System.out.println(sc,next());
		}
		//otra opcion es:
		//File fichero = new File("fichero.txt);
		//Scanner sc = new Scanner(fichero);


		System.out.println(sc.next());
		sc.close();
		}catch(FileNotFoundException e){
			System.out.println("Archivo fichero.txt no encontrado");
		}

	}

}
