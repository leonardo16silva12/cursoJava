package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFahrenheitParaCelsius {

	public static void main(String[] args) {
		
		// (°F - 32) * 5/9 = °C
		
		double c;
		final double ajuste = 32;
		final double fator = 5.0 / 9.0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
	    int f = entrada.nextInt();
	    
		c = (f - ajuste) * fator;
		
		System.out.printf(f + " Fahrenheit = " + "%.2f" + " Celsius", c);
		
		entrada.close();
	}
}
