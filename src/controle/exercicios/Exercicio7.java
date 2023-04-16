package controle.exercicios;

import java.util.Scanner;

// 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
// caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
public class Exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n = 0;
		int t = 0;

		while (n >= 0) {
			System.out.println("Digite um numero inteiro (ou negativo para sair): ");
			n = entrada.nextInt();
			if (n >= 0) {
				t += n; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma: %d\n", t);
			}
		}

		entrada.close();

	}

}
