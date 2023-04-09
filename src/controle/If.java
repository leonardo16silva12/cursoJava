package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		// No IF, será colocada uma expressão, que obrigatoriamente precisa retornar true/false
		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado. :D");
		} 
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Em recuperação. o.o");
		}
		
		// Se houverem muitos IFs, o ideal é quebrar em variáveis como exemplo abaixo:
		boolean criterioReprova = media < 4.5 && media >= 0;
		if (criterioReprova) {
			System.out.println("Reprovado. :(");
		}
		
		entrada.close();
		
	}

}
