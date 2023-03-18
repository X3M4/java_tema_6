package Ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main (String[] args) {
		List<Persona> lp = new ArrayList<>();
		lp.add(new Persona("Pepe"));
		lp.add(new Persona("Ana"));
		imprimir(lp);
		
		List<Deportista> ld = new ArrayList<>();
		ld.add(new Deportista("Iniesta", "Futbol"));
		ld.add(new Deportista("Gasol", "Basket"));
		imprimir(ld);
		
	}
	
	public static void imprimir(List<? extends Persona> lista) {
		for(Persona p: lista) {
			System.out.println(p.getNombre());
		}
	}
}
