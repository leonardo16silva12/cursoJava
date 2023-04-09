package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoBhaskara {

	public static void main(String[] args) {
		
		// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
		// utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe (a): ");
	    a = entrada.nextDouble();
	    
		System.out.printf("Informe (b): ");
	    b = entrada.nextDouble();
	    
		System.out.printf("Informe (c): ");
	    c = entrada.nextDouble();
	    
	    System.out.println();
	    
	    delta = Math.pow(b, 2) - (4 * a * c);
	    
	    System.out.printf("Delta: %.2f", delta);
	    
	    System.out.println();
	    
	    x1 = (-b + (Math.sqrt(delta))) / (2 * a);
	    
	    System.out.printf("X1: %.2f", x1);
	    
	    System.out.println();
	    
	    x2 = (-b - (Math.sqrt(delta))) / (2 * a);
	    
	    System.out.printf("X2: %.2f", x2);
	    
		entrada.close();
		
	}
	
}
