package controle.exercicios;

import java.util.Scanner;

// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int n = entrada.nextInt();
		
		if (n >= 0 && n <= 10) {
			System.out.println("O número está entre 0 e 10.");
		} else {
			System.out.println("O número não está entre 0 e 10");
		}
		
		if (n % 2 == 0) {
			System.out.println("E o número é par.");
		} else {
			System.out.println("E o número é ímpar.");
		}

		entrada.close();
		
	}
}
