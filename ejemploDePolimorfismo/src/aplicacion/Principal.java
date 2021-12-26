package aplicacion;
import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;
public class Principal{
	public static void main(String[] args){
		BandaMusica bd = new BandaMusica("Banda de Música de Villar del Monte");
		Actuacion act1 = new Actuacion(LocalDate.of(2019, 11, 25));
		bd.annadirActuacion(act1);
		Director dir = new Director("José García López");
		act1.annadirParticipante(dir);
		MusicoSocio msc1 = new MusicoSocio("Antonio López Suárez", "clarinete", 28534);
		act1.annadirParticipante(msc1);
		MusicoRefuerzo msr1 = new MusicoRefuerzo("Juan Jaén Bernal", "tuba", new BigDecimal(121));
		act1.annadirParticipante(msr1);
		Actuacion act2 = new Actuacion(LocalDate.of(2019, 12, 16));
		bd.annadirActuacion(act2);
		MusicoRefuerzo msr2 = new MusicoRefuerzo("María López Gil", "oboe", new BigDecimal(130));
		act2.annadirParticipante(dir);
		act2.annadirParticipante(msc1);
		act2.annadirParticipante(msr2);
		System.out.println(bd);
	}
}
