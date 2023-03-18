package EjerciciosTema6.ejercicio1;

public class Intercambia {
	public class Ejercicio1<T> {
		static <T>  void Intercambia(T[] array, int i, int j) {
			T pos;
			pos = array[i];
			array[i] = array[j];
			array[j] = pos;
			
		}
	}
}
