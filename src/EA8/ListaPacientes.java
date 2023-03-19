package EA8;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaPacientes{
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
	public String eliminaDatos(int i) {
		String copy = arp.get(i).getNombre();
		arp.remove(i);
		return copy;
	}
	
	public int getPosicion(Persona p) {
		int posicion = 0;
		for(int i = 0; i < this.arp.size(); i++) {
			if(arp.contains(p)) {
				posicion = i;
			}
		}
		return posicion;
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

	public Iterator<Persona> iterator() {
		// TODO Auto-generated method stub
		return new ListaIterable();
	}
	
	public class ListaIterable implements Iterator{
		public boolean borrarRegistro = false;
		public int posicion = 0;
		
		public int getPosicion() {
			return this.posicion;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return posicion < arp.size();
		}
		
		@Override
		public Persona next() {
			// TODO Auto-generated method stub
		Persona eliminable = arp.get(posicion);
		posicion++;
		this.borrarRegistro = true;
			return eliminable;
		}
		
		@Override
		public void remove() {
			if(this.borrarRegistro) {
				arp.remove(posicion-1);
				this.posicion--;
				this.borrarRegistro = false;
			}
		}
		
		
	}
}









