package EA4;

import java.util.PriorityQueue;

public class Ea4 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(70);
		pq.add(120);
		pq.add(6);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
