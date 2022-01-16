package aplicacion;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws Exception {
		//Es para ver el codigo html de la pagina web
		
		//aqui pones la pagina web en un objeto
		InputStream streamEntrada = new URL("https://www.acb.com/").openStream();
		
		//aqui lees el codigo de la pagina web con el bucle while y el scanner
		Scanner sc = new Scanner(streamEntrada);
		while(sc.hasNext()) System.out.println(sc.nextLine()); 
		sc.close();
	}
}
