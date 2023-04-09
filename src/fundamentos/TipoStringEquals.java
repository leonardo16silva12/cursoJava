package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		
		// Por mais que o conteúdo seja o mesmo, ele irá retornar false comparando com ==
		System.out.println("2" == s);
		
		// Com o .equals, irá ser comparado diretamente o conteúdo, ignorando outros aspectos da linguagem
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		// .next() tira espaços em branco e .nextLine() não tira
		String s2 = entrada.nextLine();
		
		// trim() para remover espaços em branco em uma string
		System.out.println("2" == s2.trim());
		
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}

}
