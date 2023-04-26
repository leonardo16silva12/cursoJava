package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantos notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaSala = new double[qtdeAlunos][qtdeNotas];

		double total = 0;
		
		for (int a = 0; a < notasDaSala.length; a++) {
			for (int n = 0; n < notasDaSala[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);				
				notasDaSala[a][n] = entrada.nextDouble();
				total += notasDaSala[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média Final da Sala: " + media);
		
		for(double [] notasDoAluno: notasDaSala) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();

	}

}
