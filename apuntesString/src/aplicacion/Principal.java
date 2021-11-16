package aplicacion;
public class Principal{
	public static void main(String[] args){
		String cadena = "No vueles como las aves de corral cuando puedes subir como las águilas";
		String resultado = "La cadena formada por los dos primeros caracteres es " + cadena.charAt(0) + cadena.charAt(1);
		System.out.println(resultado);
		//en la siguiente el indice inicial esta incluido y el final no
		System.out.println(cadena.substring(0,2));
		//El 5 caracter
		System.out.println(cadena.charAt(4));
		//split separa nuestra cadena por palabras pone como separador lo que introduciomos
		//caso 1
		String[] split = cadena.split(" ");
		for(int i = 0; i < split.length; i++){
			System.out.println(split[i]);
			if(split[i].equals("puedes")){
				System.out.println("La posicion de la palabra puedes es la " + i);
			}
		}
		//te da la posicion del inicio de la palabra
		System.out.println(cadena.indexOf("puedes"));
		//metodo .replace() remplaza todas las veces que aparezca "aves de corral" por "gallinas"
		//el metodo .replace() solo trabaja solo con String en cambio replaceAll() trabaja con expresiones irregulares [te analiza el texto]
		System.out.println(cadena.replace("aves de corral", "gallinas"));
	}
}
