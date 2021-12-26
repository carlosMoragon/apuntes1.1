package dominio;

import java.util.ArrayList;

public class BandaMusica{
	private String nombre;	
	
	public BandaMusica(String nombre){
		this.nombre = nombre;
	}

	private ArrayList<Actuacion> actuaciones = new ArrayList<>();

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String Nombre){
		this.nombre = nombre;
	}

	public ArrayList<Actuacion> getActuacion(){
		return actuaciones;
	}

	public void setActuacion(ArrayList<Actuacion> actuaciones){
		this.actuaciones = actuaciones;
	}
	
	public void annadirActuacion(Actuacion actuacion){
		actuaciones.add(actuacion);
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		if(actuaciones.size() != 0){
			for(Actuacion actuacion: actuaciones){
				mensaje.append(actuacion + "\n");
			}
		}else{
			mensaje.append("No tienes actuaciones");
		}
		return nombre + "\n \n" + mensaje.toString();
	}



}
