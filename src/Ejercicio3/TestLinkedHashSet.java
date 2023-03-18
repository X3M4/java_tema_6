package Ejercicio3;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] griego = "alfa beta delta epsilon gamma".split(" ");
		System.out.println("Original: " + griego.toString());
		LinkedHashSet lhs = new LinkedHashSet();
		
		for(String g: griego) lhs.add(g);
		System.out.println("Resultado:" + lhs);
		System.out.println("Contienes:" + lhs.contains("lambda"));
	}

}
