package controle;

import java.util.Scanner;

// É denominado de indeterminado, pois é dada uma condição que não sabemos quantas terão, pois o usuário pode digitar quantas strings
// quiser, o programa só vai encerrar quando o usuário digitar "sair"
public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	String valor = "";
	
	while(!valor.equalsIgnoreCase("sair")) {
		System.out.print("Você digitou: ");
		valor = entrada.nextLine();
	}
	
	entrada.close();
}
}

