package dominio;
public class Clase{
	private String nombre;
	private int numeroAlumnos;
	public Clase(){
	}
	//no se puede crear dos constructores del mismo tipo pero si puedes crear un constructor String-int y otro int-String
	//declaramos un método constructor
	public Clase(String nombre){
		System.out.println("Se ha creado un objeto de la Clase Clase");
		this.nombre = nombre;
	}

	public Clase(int numeroAlumnos){
		nombre = "";
		this.numeroAlumnos = numeroAlumnos;
	}

	public Clase(String nombre, int numeroAlumnos){
		this.nombre = nombre;
		this.numeroAlumnos = numeroAlumnos;
	}

	public int getNumeroAlumnos(){
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos){
		this.numeroAlumnos = numeroAlumnos;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String toString(){
		return "LA clase se llama " + nombre + " y tiene " + numeroAlumnos + " alumnos.";
	}
}
