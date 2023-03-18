package EA1;

import java.util.Stack;

public class Ea1 {

	public static void main(String[] args) {
		Stack<String> nombres = new Stack<>();
		
		nombres.addElement("Juan");
		nombres.addElement("Ana");
		nombres.addElement("Luis");
		
		System.out.println("Total = " + nombres.size());
		System.out.println("Nombre: " + nombres.pop());
		System.out.println("Total = " + nombres.size());
		System.out.println("Total = " + nombres.firstElement());
		System.out.println("Total = " + nombres.size());
		
		while(!nombres.isEmpty()) {
			System.out.println("Nombre: " + nombres.pop());
		}


	}

}
