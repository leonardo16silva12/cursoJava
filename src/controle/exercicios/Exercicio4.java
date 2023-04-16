package controle.exercicios;

import java.util.Scanner;

// 4. Criar um programa que receba um número e diga se ele é um número primo.
public class Exercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int n = entrada.nextInt();

		// Esse não tankei o cálculo, pedi ajuda ao chatgpt
		if (n > 1) {
			boolean esPrimo = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				System.out.println(n + " é primo.");
			} else {
				System.out.println(n + " não é primo.");
			}
		} else {
			System.out.println(n + " não é primo.");
		}

		entrada.close();

	}

}
