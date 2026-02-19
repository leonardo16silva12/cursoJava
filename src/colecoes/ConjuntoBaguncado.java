package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	// SET
	// Não aceita repetição
	// Pode ser ordenado(mas não é por padrão)
	// Não é indexado

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// Exemplo abaixo é de um set heterogêneo
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double (Conversão para uma classe)
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String (Não precisa pois é um objeto)
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Caractere

		// Tamanho do conjunto
		System.out.println(conjunto.size());

		// Não houve repetição, pois é case sensitive
		conjunto.add("teste");
		System.out.println(conjunto.size());

		// Remover um elemento do conjunto
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.size());

		// Verificar se o conjunto contém algum elemento específico
		System.out.println(conjunto.contains('x'));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println("Nums: " + nums);
		System.out.println("Conjunto: " + conjunto);

		// União entre dois conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);

		// Intersessão entre dois conjuntos (ficando somente os elementos iguais em
		// ambos)
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		// Limpar conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}
}