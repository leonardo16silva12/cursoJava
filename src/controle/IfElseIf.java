package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua nota: ");
		double nota = entrada.nextDouble();
		
		// O else if "encurta" o código, deixando o mais intuitivo, porém, fazendo com if e else puro, também chegaria no mesmo resultado.
		if (nota > 10 || nota < 0) {
			System.out.println("Nota digitada é inválida. ");
		} else if (nota >= 7.5) {
				System.out.println("Parabéns!! Vocè foi aprovado. ");
		} else if(nota >= 4) {
				System.out.println("Vocè está em recuperação. ");
		} else {
			System.out.println("Vocè foi reprovado. ");
		}
		
		System.out.println("Fim. ");
		
		entrada.close();
		
	}
}
