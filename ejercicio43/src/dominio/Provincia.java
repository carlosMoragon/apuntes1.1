package dominio;
import java.util.ArrayList;
public class Provincia{
	private String nombre;
	private ArrayList<Municipio> municipios = new ArrayList<>();

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public ArrayList<Municipio> getMunicipios(){
		return municipios;
	}

	public void setMunicipio(ArrayList<Municipio> municipios){
		this.municipios = municipios;
	}

	public void addMunicipios(Municipio municipio){
		municipios.add(municipio);
	}

	public int calcularHabitantesProvincia(){
		int habitantesProvincia = 0;
		for(int j = 0; j < municipios.size(); j++){
			Municipio mun = municipios.get(j);
			int numeroHabitantesMunicipio = mun.calcularHabitantesMunicipio();
			habitantesProvincia = habitantesProvincia + numeroHabitantesMunicipio;
		}
		return habitantesProvincia;
	}


	public String toString(){
		String mensaje = "El municipio " + nombre + " esta compuesto por estos municipios: \n";
		for(int i = 0; i < municipios.size(); i++){
			mensaje += municipios.get(i) + "\n";
		}
		mensaje += nombre + " tiene un total de habitantes de: " + calcularHabitantesProvincia() + ".";
		return mensaje;
	}




}

