package controle.exercicios;

import java.util.Scanner;

// 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int mv = 0;
		int c = 0;

		do {
			System.out.println("\nDigite um número: ");
			int v = scanner.nextInt();

			if (v > mv) {
				mv = v;
			}

			c++;
		} while (c != 10);

		System.out.printf("Maior valor informado: " + mv);
		scanner.close();
		
	}

}
