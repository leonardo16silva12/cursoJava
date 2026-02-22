package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		// Interface funcional que recebe um parâmetro e não retorna nada(void)
		Consumer<Produto> imprimirNome = p -> System.out.println("Nome: " + p.nome);

		Produto p1 = new Produto("Caneta", 2.00, 0.01);
		imprimirNome.accept(p1); // .accept para utilizar o lambda

		Produto p2 = new Produto("Lápis", 3.50, 0.02);
		Produto p3 = new Produto("Lapiseira", 4.99, 0.03);
		Produto p4 = new Produto("Caderno", 14.90, 0.04);
		Produto p5 = new Produto("Borracha", 1.90, 0.05);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome); // O ForEach passa o accept automaticamente
		produtos.forEach(p -> System.out.println("Preço: " + p.preco)); // Usando lambda
		produtos.forEach(System.out::println); // Depende do toString na classe Produto
	}

}
