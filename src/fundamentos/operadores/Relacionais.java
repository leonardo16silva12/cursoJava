package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		// Igual
		System.out.println(3 == 4); 
		
		// Diferente
		System.out.println(3 != 7);
		
		// Maior
		System.out.println(3 > 4);
		
		// Maior ou Igual
		System.out.println(3 >= 4);
		
		// Menor
		System.out.println(3 < 4);
		
		// Menor ou Igual
		System.out.println(3 <= 4);

		double nota = 7.5;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
	}

}
