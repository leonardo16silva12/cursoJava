package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		// Interface funcional que não recebe nenhum parâmetro, mas te retorna algo
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

		// .get para imprimir a lista
		System.out.println(umaLista.get());

		// Simples, não possui composição(.andThen, .and, .or).
	}

}
