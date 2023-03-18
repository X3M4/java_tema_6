package Ejemplos;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for(int i = 0; i < 10; i++) al.add(i);
		System.out.println(al);
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			int i = (Integer)li.next();
			System.out.println(i + " ");
			if(i % 2 == 0) {
				i++;
				li.set(i);
				li.add(i);
			}
		}
		System.out.println();
		System.out.println(al);
		
	}

}
