package fundamentos.exercicios;

import java.util.Scanner;

public class ConverterCelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		// (C × 9/5) + 32 = 32 °F

		double f;
		final double ajuste = 32;
		final double fator = 9.0 / 5.0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
	    int c = entrada.nextInt();
	    
		f = (c * fator) + ajuste;
		
		System.out.printf(c + " Celsius = " + "%.2f" + " Fahrenheit", f);
		
		entrada.close();
		
	}
}
