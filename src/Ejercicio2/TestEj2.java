package Ejercicio2;

import java.util.ArrayList;

public class TestEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Pepe");
		al.add("Antonio");
		al.add("Enrique");

		Ejercicio2B ej = new Ejercicio2B();
		int numero = ej.indiceDe(al, "Manolo");
		System.out.println(numero);

	}

}
