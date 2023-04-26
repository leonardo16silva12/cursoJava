package arrays;

public class ForEach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4};
		
		// A diferença para o foreach, é que o for normal utiliza-se do "i" para acessar todas as posições
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		// Para verificar elemento por elemento do array, um por um
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
		
		
	}

}
