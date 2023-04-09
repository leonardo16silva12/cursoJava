package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// if(...) sentença; ou {}
		// while(...) sentença; ou {}
		// for(...;...;...) sentença; ou {}
		
		// O do while, o bloco vem por primeiro e na finalização, utiliza-se ;
		// do "sentença; ou {}" while(...);
		// Outra diferença, é que no do while, vai executar obrigatoriamente no minimo uma vez, diferente do while comum que se na 
		// primeira execução a condição fosse false, ele não executaria nenhuma vez
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Diga as palavras mágicas... ");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
		
		// Professor comenta que as estruturas de repetição mais utilizadas no dia a dia em uma escala do mais para o menos é a seguinte:
		// 1 - For
		// 2 - While
		// 3 - Do While
		
		
	}

}
