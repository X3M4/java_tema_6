package Ejemplos;

public class Deportista extends Persona{
	private String deporte;
	public Deportista(String nombre, String deporte) {
		super(nombre);
		this.deporte = deporte;
	}
	public String getDeporte() {return deporte;}
	
}
	