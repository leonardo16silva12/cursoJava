package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		// Deque
		// Implementa pilha(stack)
		// LIFO - Last In / First Out

		Deque<String> livros = new ArrayDeque<String>();

		// Add e Push -> Adicionam elementos na pilha
		// Diferença é o comportamento quando a pilha está cheia
		// .add() retorna verdadeiro ou falso caso a pilha esteja cheia.
		// .push() lançará uma exceção caso a pilha esteja cheia.
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		// Peek e Element -> Buscam o último elemento na pilha
		// Diferença é o comportamento quando a pilha está vazia
		// .peek() retornará null
		// .element() retorna a exceção "NoSuchElementException"
		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println();

		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println();

		// Poll retorna null
		// Remove e Pop retornam noSuchElementException
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());

//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();		
	}
}
