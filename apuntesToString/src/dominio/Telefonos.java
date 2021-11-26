package dominio;

public class Telefonos{

	public String nombre;
	public int numero = 0;
	
	public Telefonos(String nombre, int numero){
		this.nombre = nombre;
		this.numero = numero;
	}
	//Si quitamos el toString() e imprimimos el objeto en principal lo que nos saldria por pantalla es: dominio.Telefonos@41a4555e (La direccion del objeto)
	//utilizamos el metodo toString() para cambiar esa valor a una String (al mensaje que nosotros queramos)
	public String toString(){
		return "El telefono se llama " + nombre + " y su numero es " + numero;
	}
}
