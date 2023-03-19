package EA5;

import java.util.ArrayList;

public class ListaPacientes {
	String nombre;
	public ArrayList<Persona> arp = null;
	
	//Constructor genérico
	public ListaPacientes() {
		this.nombre = "Lista de Pacientes";
		arp = new ArrayList<>();
	}
	
	//Constructor con nombre de lista
	public ListaPacientes(String nombre) {
		this.nombre = nombre;
		arp = new ArrayList<>();
	}
	//Obtiene los datos de un paciente
	public Persona getPaciente(int i){
		return arp.get(i);
	}
	//Elimina de la lista y devuelve 
	//los datos del paciente eliminado
	public Persona eliminaDatos(int i) {
		Persona copy = arp.get(i);
		arp.remove(i);
		return copy;
	}
	//Añadir paciente por el final de la cola
	public void setPaciente(int dni, String nombre, int altura) {
		Persona p = new Persona(dni, nombre, altura);
		arp.add(p);
	}
	//Obtener el total de pacientes de la lista
	public int getTotalPacientes() {
		return arp.size();
	}
}
