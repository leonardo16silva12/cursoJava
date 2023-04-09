package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		System.out.println(a);
		
		a--; // a = a - 1
		System.out.println(a);
		
		++b; // b = b + 1
		System.out.println(b);
		
		--b; // b = b - 1
		System.out.println(b);
		
		System.out.println("Mini Desafio: ");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		
		// O resultado dá true por causa da precedência, pois a váriavel a está com operador unário antes dela,
		// o que significa que existe uma pressa maior, quando é inserido o operador unário depois da váriavel b, 
		// dá a entender que ela pode ser deixada para depois e o operador relacional será validado primeiro.
		// Nesse exemplo, o resultado retorna true, pois no momento da execução a = 2 e b = 2
		
	}

}
