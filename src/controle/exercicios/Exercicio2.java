package controle.exercicios;

import java.util.Scanner;

// 2. Criar um programa informa se o ano atual é um ano bissexto;
public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano é bissexto.");
		} else {
			System.out.println("O ano não é bissexto.");
		}

		entrada.close();
		
	}


}
