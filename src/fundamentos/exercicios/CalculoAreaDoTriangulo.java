package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoAreaDoTriangulo {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		double b;
		double h;
		double a;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe a base do triângulo: ");
	    b = entrada.nextDouble();
	    
		System.out.printf("Informe a altura do triângulo: ");
	    h = entrada.nextDouble();

		a = b * (h/2);
	
		System.out.printf("Área do Triângulo: %.2f", a);
		
		entrada.close();
		
	}

}
