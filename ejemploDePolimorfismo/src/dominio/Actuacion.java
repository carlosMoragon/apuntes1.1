package dominio;

import java.util.ArrayList;
import java.time.LocalDate;

public class Actuacion{
	private LocalDate fecha;

	ArrayList<Participantes> participantes = new ArrayList<>();
	
	public LocalDate getFecha(){
		return fecha;
	}

	public void setFecha(LocalDate fecha){
		this.fecha = fecha;
	}

	public Actuacion(LocalDate fecha){
		this.fecha = fecha;
	}

	public ArrayList<Participantes> getParticipantes(){
		return participantes;
	}

	public void annadirParticipante(Participantes participante){
		participantes.add(participante);
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		if(participantes.size() != 0){
		//	for(Participantes participate: participantes){
				mensaje.append(participantes + "\n");
		//	}
		}else{
			mensaje.append("No hay musicos en la banda");
		}
		return "Fecha de actuación: " + fecha + "\n" + mensaje.toString();
	}

}
