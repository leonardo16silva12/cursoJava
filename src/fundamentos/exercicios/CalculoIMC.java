package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		// IMC = PESO / ALTURA²

		double imc;
		double p;
		double h;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
	    p = entrada.nextDouble();
	    
		System.out.println("Informe sua altura: ");
	    h = entrada.nextDouble();
	    
		imc = p / Math.pow(h, 2);
		
		System.out.printf("Seu IMC é: %.2f", imc);
		
		entrada.close();
		
	}

}
