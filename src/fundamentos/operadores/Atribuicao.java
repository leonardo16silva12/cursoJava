package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		// Na declaração das variaveis, é possível atribuir a elas um valor, uma outra váriavel ou uma expressão
		
		int a = 3;
		
		int b = a;
		
		int c = a + b;
		
		// Dá para "simprificar"
		c += b; // c = c + b; 
		System.out.println(c);
		
		c -= a; // c = c - a;
		System.out.println(c);
		
		c *= b; // c = c * b;
		System.out.println(c);
		
		c /= a; // c = c / a;
		System.out.println(c);
		
		c %= 2; // c = c % 2; 0 ou 1
		System.out.println(c);
		
		// É um operador unário, mas serve também como atribuição
		c++; // c = c + 1;
		System.out.println(c);

	}
}
