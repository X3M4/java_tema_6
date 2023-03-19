package ejercicio7;

import java.util.Iterator;

public class TestArboles {
	public static void main(String[] args) {
		//NODO RAIZ
		ArbolB <String> a1 = new ArbolB<>("Bebida");
		//RAMAS IZQUIERDA Y DERECHA
		ArbolB <String> a2 = new ArbolB<>("Espirituosa");
		ArbolB <String> a3 = new ArbolB<>("Refresco");
		
		a1.setDer(a2);
		a1.setIzq(a3);
		//SUBRAMA DERECHA
		ArbolB <String> a21 = new ArbolB<>("Vino");
		ArbolB <String> a21d = new ArbolB<>("Reserva");
		ArbolB <String> a21i = new ArbolB<>("Cosecha");
		
		a2.setDer(a21);
		a21.setDer(a21d);
		a21.setIzq(a21i);
		
		//SUBRAMA IZQUIERDA
		ArbolB <String> a31 = new ArbolB<>("Zumo");
		a3.setIzq(a31);
		
		System.out.println("Número de nodos:" + a1.getSize());		
		
		/*Iterator<String> io = a1.inorden();
		while(io.hasNext()) {
			System.out.println(io.next());
		}*/
		
		for(String s: a1) {
			System.out.println(s);
		}
			
	}
}
