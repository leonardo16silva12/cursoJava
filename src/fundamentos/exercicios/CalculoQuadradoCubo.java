package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoQuadradoCubo {

	public static void main(String[] args) {

		double n;
		double q;
		double c;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe o número: ");
	    n = entrada.nextDouble();

		q = Math.pow(n, 2);
		
		c = Math.pow(n, 3);
		
		System.out.printf("Ao quadrado: %.2f", q);
		System.out.println();
		System.out.printf("Ao cubo: %.2f", c);
		
		entrada.close();
		
	}
}
