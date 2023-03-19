package EA10;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import java.util.*;
import java.util.function.Predicate;
public final class Contador {
	public static <T> int contarSI(Collection<T> c, Predicate<T> p) {
		int contador = 0;
		for (T elemento : c)
			if (p.test(elemento))
				contador++;
		return contador;
	}

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 4);
// Contar los valores pares de una lista
		int c = contarSI(li, x -> x % 2 == 0);
		System.out.println("Enteros pares en la lista: " + c);
// Contar cadenas con menos de 5 letras
		Set<String> s = Set.of("desayuno", "merienda", "cena");
		c = contarSI(s, x -> x.length() < 5);
		System.out.println("Palabras < 5 letras en conjunto: " + c);
	}
}
