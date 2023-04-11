package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		// O conceito de escopo se dá quando é necessária a utilização da variável fora do for, onde a mesma está com seu escopo
		// definido dentro do for, não será possível acessar fora do bloco. Sendo necessário então, a definição da váriavel fora do for
		// para ser permitido seu uso posterior
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
		
		// Dentro de um método, a execução é sequencial, ou seja, não pode utilizar uma váriavel antes da definição da mesma
		// (Existem exceções)
//		System.out.println(b);
//		int b = 0;
		
		
	}

}
