package EA8;

public class Persona implements Comparable<Persona>{
	private int dni;
	private String nombre;
	private int altura;

	public Persona(int dni, String nombre, int altura) {
		this.dni = dni;
		this.nombre = nombre;
		this.altura = altura;
	}

	public int getAltura() {
		return altura;
	}
	
	public int getDni() {
		return dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona{DNI:" + dni + ", nombre: " + nombre + ", altura: " + altura + "\n";
	}

	@Override
	public int compareTo(Persona p) {
		int mayor = 0;
		if(this.altura > p.getAltura()) mayor = 1;
		else if(this.altura < p.getAltura()) mayor = 2;
		else if(this.altura == p.getAltura() && this.dni == p.getDni()) mayor = 0;
		else mayor = -1;
		return mayor;
		
	}

}
