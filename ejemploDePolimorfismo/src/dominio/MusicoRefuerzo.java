package dominio;
import java.util.Random;
import java.math.BigDecimal;
public class MusicoRefuerzo extends Participantes{
	private String instrumento;
	private BigDecimal dinero;
	
	public MusicoRefuerzo(String nombre, String instrumento, BigDecimal dinero){
		super(nombre);
		this.instrumento = instrumento;
		this.dinero = dinero;
	}
	
	public String getInstrumento(){
		return instrumento;
	}

	public void setInstrumento(String instrumento){
		this.instrumento = instrumento;
	}

	public BigDecimal getDinero(){
		return dinero;
	}

	public void setDinero(BigDecimal dinero){
		this.dinero = dinero;
	}

	@Override
	public String toString(){
		return getNombre() + ", " + instrumento + ", " + dinero + "€";
	}
	
}
