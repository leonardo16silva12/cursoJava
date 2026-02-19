package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Exemplo abaixo é de um set homogêneo
		// Inserindo o tipo "<String>", estou dizendo que a lista será obrigatoriamente
		// do tipo String
//		Set<String> listaAprovados = new HashSet<>();
		Set<String> listaAprovados = new TreeSet<>(); // Posso usar esse TreeSet para ordenar

		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Beatriz");
		listaAprovados.add("Guilherme");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		// Conjuntos homogêneos
		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(7);

		for (int n : nums) {
			System.out.println(n);
		}

	}

}
