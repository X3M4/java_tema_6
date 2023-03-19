package EA9;

import java.util.Map;

public class Ea9_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = Map.of(1, "Java ", 2, "JavaScript ", 3, "Kotlin ");
		for(Map.Entry<Integer, String> i: m.entrySet()) {
			System.out.printf("%d, %s\n",i.getKey(), i.getValue());
		}
		System.out.println("\n" + m);
	}

}
