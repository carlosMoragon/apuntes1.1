package dominio;
import java.util.ArrayList;
public class Municipio{
	private String nombre;
	private ArrayList<Localidad> localidades = new ArrayList<>();

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public ArrayList<Localidad> getLocalidades(){
		return localidades;
	}

	public void setLocalidades(ArrayList<Localidad> localidades){
		this.localidades = localidades;
	}

	public int calcularHabitantesMunicipio(){
		int numeroHabitantesMunicipio = 0;
		for(int j = 0; j < localidades.size(); j++){
			Localidad loc = localidades.get(j);
			int numeroHabitantesLocalidad = loc.getNumeroDeHabitantes();
			numeroHabitantesMunicipio = numeroHabitantesMunicipio + numeroHabitantesLocalidad;
		}
		return numeroHabitantesMunicipio;
	}


	public void addLocalidades(Localidad localidad){
		localidades.add(localidad);
	}

	public String toString(){
		String mensaje = "En este municipio llamado " + nombre + " tiene estas locoalidades: \n";
		for(int i = 0; i < localidades.size(); i++){
			mensaje += localidades.get(i) + "\n";
		}
		mensaje += "Con un numero de habitantes de " + calcularHabitantesMunicipio() + ".";
		return mensaje;
	}
	

}
