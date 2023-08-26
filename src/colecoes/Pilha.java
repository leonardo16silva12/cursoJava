package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		// Add e Push -> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		// .add() retorna verdadeiro ou falso caso a fila esteja cheia.
		// .push() lançará uma exceção caso a fila esteja cheia. 
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
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

