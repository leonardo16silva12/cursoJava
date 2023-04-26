package arrays;

import java.util.Scanner;

public class DesafioArrays {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Pegando o tamanho do array
		System.out.println("Digite o número de notas que serão digitadas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		// Primeiro for (normal), vai pegar e gravar cada nota
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0.0;
		
		// Segundo for (each), vai pegar todas as notas e soma-las
		for(double nota: notas) {
			total += nota;
		}
		
		// Por fim, pegando o total e dividindo pelo tamanho do array
		double media = total / notas.length;
		
		System.out.println("Média Final: " + media);

		entrada.close();
	}

}
