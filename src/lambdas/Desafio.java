package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 2199.99, 0.10);

		// Minha Resposta

		// Preço Final(com desconto)
		Function<Produto, Double> precoComDesconto = prod -> prod.preco * (1 - prod.desconto);

		// Imposto Municipal(>= 2500(8,5%) | < 2500(Isento))
		Function<Double, Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;

		// Frete(>= 3000(100) | < 3000 (50))
		Function<Double, Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

		// Arredondar(duas casas decimais)(pesquisei no GPT)
		Function<Double, Double> arredondar = preco -> Math.round(preco * 100.0) / 100.0;

		// Formatar para R$X.XXX,XX (pesquisei no GPT)
		Function<Double, String> formatar = preco -> NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))
				.format(preco);

		String resultado1 = precoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p1);

		System.out.println(resultado1);

		// Resposta do Professor
		Produto p2 = new Produto("iPad", 3235.89, 0.13);

		Function<Produto, Double> precoP = prod -> prod.preco * (1 - prod.desconto);

		UnaryOperator<Double> impostoP = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> freteP = preco -> preco >= 3000 ? preco + 100 : preco + 50;

		UnaryOperator<Double> arredondarP = preco -> Double.parseDouble(String.format(Locale.US, "%.2f", preco));
		
		Function<Double, String> formatarP = preco -> ("R$" + preco).replace(".", ",");

		String resultado2 = precoP
				.andThen(impostoP)
				.andThen(freteP)
				.andThen(arredondarP)
				.andThen(formatarP)
				.apply(p2);

		System.out.println(resultado2);
	}

}
