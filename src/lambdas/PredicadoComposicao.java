package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

		// .and para utilizar a composição na validação das duas condições do predicate
		System.out.println(isPar.and(isTresDigitos).test(150));

		// .or para validar uma das duas condições do predicate
		System.out.println(isPar.or(isTresDigitos).test(98));
	}
}
