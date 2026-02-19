package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		// LIST
		// Aceita repetição
		// Indexada
		// Ordenada

		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);

		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));

		for (Usuario u : lista) {
			System.out.println(u);
		}

		System.out.println();

		// Buscando um elemento específico na lista, acessando pelo índice
		System.out.println("Buscando elemento específico - " + lista.get(3));

		// Remover pelo index ou pelo objeto
		lista.remove(1);
		lista.remove(new Usuario("Manu"));
		
		System.out.println();

		// Verficando se a lista contém determinado elemento
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		System.out.println();

		for (Usuario u : lista) {
			System.out.println(u);
		}

	}

}
