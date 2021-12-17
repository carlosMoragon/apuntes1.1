package aplicacion;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws Exception {
		InputStream streamEntrada = new URL("https://www.acb.com/").openStream();
		Scanner sc = new Scanner(streamEntrada);
		while(sc.hasNext()) System.out.println(sc.nextLine()); 
		sc.close();
	}
}
