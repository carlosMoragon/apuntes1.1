package dominio;

public class MusicoSocio extends Participantes{
	private int numeroDeSocio;
	private String instrumento;

	public MusicoSocio(String nombre, String instrumento, int numeroDeSocio){
		super(nombre);
		this.instrumento = instrumento;
		this.numeroDeSocio = numeroDeSocio;
	}

	public int getNumeroDeSocio(){
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(int numeroDeSocio){
		this.numeroDeSocio = numeroDeSocio;
	}
	
	public String getInstrumento(){
                return instrumento;
        }

        public void setInstrumento(String instrumento){
                this.instrumento = instrumento;
        }

	@Override
	public String toString(){
		return getNombre() + ", " + instrumento + ", número de socio: " + numeroDeSocio + "\n";
	}
}
