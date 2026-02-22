package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		// Interface funcional que recebe dois parâmetros do mesmo tipo e retorna um
		// valor do mesmo tipo
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		// Utilizando composição (.andThen)
		Function<Double, String> conceito = m -> m >= 7 ? m + " | Aprovado" : m + " | Reprovado";
		System.out.println(media.andThen(conceito).apply(9.0, 5.0));

		// Interface funcional que é possível definir o tipo de cada parâmetro e
		// resultado
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? notaFinal + " | Aprovado" : notaFinal + " | Reprovado";
		};

		System.out.println(resultado.apply(7.0, 5.0));

	}

}
