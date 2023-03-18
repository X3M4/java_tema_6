package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2B {
	int salida;

	public Ejercicio2B() {
		this.salida = 0;
	}

	public <T> int indiceDe(ArrayList<T> datos, T dato) {

		for(T x: datos) this.salida = datos.indexOf(dato);

		return this.salida;
	}
}
