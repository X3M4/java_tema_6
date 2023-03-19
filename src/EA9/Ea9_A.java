package EA9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ea9_A {

	public static void main(String[] args) {
		List<String> lst = new ArrayList();
		String[] frase = {"hola", "que", "tal", "estás"};
		lst = Arrays.asList(frase);
		
		for (String s : lst) {
			System.out.println(s);
		}
	}

}
