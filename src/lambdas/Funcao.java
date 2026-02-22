package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		// Interface funcional que vai receber dois parâmetros, um para a entrada e o
		// outro para o resultado
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		System.out.println(parOuImpar.apply(32)); // .apply para executar a função

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		Function<String, String> encafifado = valor -> valor + "???";

		// .andThen para executar uma função antes do apply
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(resultadoFinal1);

		// Dica da aula: Quanto menor for a função, mais fácil será a reutilização dela
		// em outro ponto.
		// Funções grandes tendem a serem mais díficeis de serem reutilizadas.

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(encafifado).apply(32);

		System.out.println(resultadoFinal2);

	}

}
