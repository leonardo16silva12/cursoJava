package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite o dia da semana: ");
		String diaSemana = entrada.next();
		
		// Não usar "==" para comparar strings, utilize sempre ".equals"
		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (diaSemana.equalsIgnoreCase("terca") ||diaSemana.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (diaSemana.equalsIgnoreCase("sabado") || diaSemana.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia inválido. ");
		}

		entrada.close();
	}
}
