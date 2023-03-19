package EA3;

import java.util.LinkedList;
import java.util.Queue;

public class Ea3 {

	public static void main(String[] args) {
	
	Queue<String> qe = new LinkedList<>();
	
	qe.add("Juan");
	qe.add("María");
	qe.add("Andrés");
	
	System.out.println(qe.isEmpty());
	System.out.println(qe.contains("María"));
	while(!qe.isEmpty()) {
		System.out.println(qe.poll());
	}
	System.out.println(qe.isEmpty());

	}

}
