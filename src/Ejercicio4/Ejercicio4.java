package Ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*PARA PODER GENERAR MAS DE UN NÚMERO DE TELÉFONO 
		 * POR PERSONA LA CLAVE VA A SER UN STRING PERO 
		 * EL VALOR SERÁ UNA LISTA CON LOS NÚMEROS DE TELÉFONO*/
		ArrayList<Integer> tel_miguel = new ArrayList<>();
		tel_miguel.add(666777888);
		ArrayList<Integer> tel_andres = new ArrayList<>();
		tel_andres.add(600000100);
		ArrayList<Integer> tel_ana = new ArrayList<>();
		tel_ana.add(777000111);

		Map<String, ArrayList<Integer>> m = new TreeMap<>();
		m.put("Miguel", tel_miguel);
		m.put("Andres", tel_andres);
		m.put("Ana", tel_ana);
		
		System.out.println(m);
		tel_miguel.add(622555222);
		m.put("Miguel", tel_miguel );
		System.out.println(m);
		tel_andres.add(688888555);
		m.put("Andres", tel_andres);
		System.out.println(m);
	
	}

}
