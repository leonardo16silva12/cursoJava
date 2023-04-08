package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na Terça (V ou F)
		boolean trabalho1 = true;
		
		// Trabalho na Quinta (V ou F)
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2; // Ele vai comprar a TV de 50 se os dois trabalhos derem certo;
		boolean tv32 = trabalho1 ^ trabalho2; // Utiliza-se o OU exclusivo, pois se nenhum der certo, não vai comprar nenhuma e se os dois derem certo também não, pois já vai ter comprado a TV de 50;
		boolean sorvete = trabalho1 || trabalho2; // Vai tomar sorvete se algum dos trabalhos derem certo;
		
		// Se um dar certo, vai comprar TV de 32 polegadas
		System.out.println("Comprou TV 32? " + tv32);
		
		// Se os dois darem certo, vai comprar TV de 50 polegadas
		System.out.println("Comprou TV 50? " + tv50);
		
		// Nos dois casos, se houver uma compra de TV, a familia vai tomar sorvete
		System.out.println("Comprou Sorvete? " + sorvete);
		
		// Nenhum trabalho deu certo, familia vai ficar em casa sem sorvete e sem TV
		// Operador Unário
		System.out.println("Ficou em casa e mais saudável? " + !sorvete);
		
		
	}
}
