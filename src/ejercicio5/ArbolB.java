package ejercicio5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArbolB<E> implements Iterable<E>{

	protected ArbolB<E> padre;// Nodo padre
	protected int ne;// Cantidad de nodos
	protected E e;// Elemento que almacena
	protected ArbolB<E> izq;// Puntero al arbol Hijo izquierdo
	protected ArbolB<E> der;// Puntero al arbol Hijo derecho

	// Constructores
	public ArbolB(E k, ArbolB<E> i, ArbolB<E> d) {

		this.e = k; // Es el dato de la raíz
		this.padre = null; // Es el padre de la raíz
		this.izq = i;
		if (i != null)
			i.padre = this;
		this.der = d;
		if (d != null)
			d.padre = this;
		this.ne = 1 + (izq == null ? 0 : izq.ne) + (der == null ? 0 : der.ne);
	}

	public ArbolB() {
		this(null, null, null);
	}

	public ArbolB(E k) {
		this(k, null, null);
	}

	public E getE() {
		return e;
	}

	public void setE(E k) {
		e = k;
	}

	public ArbolB<E> getIzq() {
		return izq;	
	}

	public ArbolB<E> getDer() {
		return der;
	}

	// Conectar un árbol como hijo izquierdo
	public void setIzq(ArbolB<E> i) {
		ArbolB<E> nodo;
		int sePierden = (izq == null) ? 0 : izq.ne; // Nodos se van
		izq = i; // Se conecta el árbol a la nueva rama
		if (i != null) {
			sePierden -= i.ne; // Si vienen otros, pierde menos...
			i.padre = this;
		}
		// Actualizar la cantidad de nodos subiendo hasta la raíz
		ne -= sePierden;
		nodo = this.padre;
		while (nodo != null) {
			nodo.ne -= sePierden;
			nodo = nodo.padre;
		}
	}

	// conectar un arbol como hijo derecho
	public void setDer(ArbolB<E> d) {
		ArbolB<E> nodo;
		int sePierden = (der == null) ? 0 : der.ne; // Nodos q pierde
		der = d; // Se conecta el árbol a la nueva rama
		if (d != null) {
			sePierden -= d.ne; // Si el nuevo tiene nodos..
			d.padre = this;
		}
		// Actualizar la cantidad de nodos subiendo hasta la raíz
		ne -= sePierden;
		nodo = this.padre;
		while (nodo != null) {
			nodo.ne -= sePierden;
			nodo = nodo.padre;
		}
	}

	public int getSize() {
		return ne;
	}

	// Vacía el nodo y devuelve el nº de elementos vaciados
	public void vaciar() {
		if (padre != null)
			padre.ne -= ne;
		ne = 0;
		e = null;
		izq = null;
		der = null;
	}

	// Desconecta el árbol de su padre, podría llamarse podar
	public void desconectar() {
		if (padre != null)
			padre = null;
	}

	// clase interna de cada objeto arbol
	public class Inorden implements Iterator<E> {
		private ArbolB<E> actual; // Nodo actual del recorrrido
		private StringBuilder pila; // Operaciones a realizar

		private Inorden(ArbolB<E> a) { // constructor
			actual = a;
			if (actual == null)
				return;
			pila = new StringBuilder("");
			rellenaPilaInorden(actual); // Fabricar el recorrido
		}

		private void rellenaPilaInorden(ArbolB<E> a) {
			if (a == null)
				return;
			if (a.izq != null) {
				pila.insert(0, 'I');
				rellenaPilaInorden(a.izq);
			}
			pila.insert(0, 'C');
			if (a.der != null) {
				pila.insert(0, 'D');
				rellenaPilaInorden(a.der);
			}
			pila.insert(0, 'P');
		}

		public boolean hasNext() {
			if (actual == null)
				return false;
			int ultimo = pila.length() - 1;
			while (ultimo > 0) {
				char movimiento = pila.charAt(ultimo--);
				if (movimiento == 'C')
					return true;
			}
			return false;
		}

		public E next() throws NoSuchElementException {
			if (actual == null || pila.length() == 0)
				throw new NoSuchElementException("No hay elementos");
			int ultimo = pila.length() - 1;
			while (ultimo >= 0) {
				char movimiento = pila.charAt(ultimo);
				pila.deleteCharAt(ultimo);
				if (movimiento == 'I')
					actual = actual.izq;
				else if (movimiento == 'D')
					actual = actual.der;
				else if (movimiento == 'C')
					return actual.e;
				else if (movimiento == 'P')
					actual = actual.padre;
				if (actual == null)
					throw new NoSuchElementException("Arbol modificado");
				ultimo--;
			}
			return null;
		}
		
	}

	public Iterator<E> inorden() {
		return new Inorden(this);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Inorden(this);
	}
	
}