package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		// Interface funcional que recebe um parâmetro e retorna um boolean
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto)); // .test para validar a condição passada no lambda
	}
}
