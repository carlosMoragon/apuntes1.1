package dominio;

public abstract class Participantes{
	private String nombre;
	
	public Participantes(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String toString(){
		return nombre;
	}

}
