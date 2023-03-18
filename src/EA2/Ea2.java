package EA2;

import java.util.Scanner;
import java.util.Stack;

public class Ea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una fórmula matemática");
		String formula = sc.nextLine();
		
		char[] op = formula.toCharArray();
		System.out.println(balancear(op));
		
	}
	
	public static String balancear(char[] o) {
		
		String resultado;
		boolean balanceo = false;
		Stack pila1 = new Stack<>();
		Stack pila2 = new Stack<>();
		char c1;
		char c2;
		
		for(int i = 0; i < o.length; i++) {
			if(o[i] == '{'  | o[i] == '[' |o[i] == '(')  {
				pila1.push(o[i]);
			}else if(o[i] == '}' | o[i] == ']' | o[i] == ')') {
				pila2.push(o[i]);
			}
		}
		
		for(int i = 0; i < pila1.size(); i++) {
			c1 = (char) pila1.pop();
			c2 = (char) pila2.pop();
			
			if(c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']' 
					|| c1 == '(' && c2 == ')') {
				balanceo = true;
			
			}else {
				balanceo = false;
			}
		}
		
		if(balanceo == true) resultado = "BALANCEADO";
		else resultado = "NO BALANCEADO";
		return resultado;
	}

}