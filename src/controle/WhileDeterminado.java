package controle;

// É denominado de "Determinado" pois nesse caso, eu sei quantas vezes quero repetir
public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		// Com o While, é inserida uma expressão que vai retornar true/false, onde a cada vez a retornar true, o código vai se repetir, até que a expressão retorne false
		while (contador <= 10) {
			System.out.printf("%d\n", contador);
			// Se não modificar o valor dentro do while, vai virar um laço infinito
			contador+= 2;
		}
		
	}

}
