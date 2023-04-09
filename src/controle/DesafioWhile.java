package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int qtdeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Digite a nota: (ou -1 p/ sair)");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				qtdeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida. ");
			}

		}
		
		// Total de Notas Digitadas
		System.out.println("Total de Notas Digitadas = " + qtdeNotas);

		// Calcular Media
		double media = total / qtdeNotas;
		System.out.println("Média = " + media);


		entrada.close();
	}
}