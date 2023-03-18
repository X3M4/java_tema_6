package Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class Ejercicio2 {
	int salida;

	public Ejercicio2() {
		this.salida = 0;
	}

	public <T> int indiceDe(ArrayList<T> datos, T dato) {

		for (int i = 0; i < datos.size(); i++) {
			T valor = datos.get(i);
			if (valor.equals(dato)) {
				this.salida = i;
			}
		}

		return this.salida;
	}
}
