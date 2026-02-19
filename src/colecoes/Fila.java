package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		// QUEUE
		// Implementa fila
		// FIFO - First In / First Out

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		// .add() lançará uma exceção caso a fila esteja cheia.
		// .offer() retorna falso caso a fila esteja cheia.
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> Buscam o primeiro elemento na fila
		// Diferença é o comportamento quando a fila está vazia
		// .peek() retornará null
		// .element() retorna a exceção "NoSuchElementException"
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		// Poll e Remove -> Removem elementos na fila
		// Diferença é o comportamento quando a fila está vazia
		// .poll() retornará null
		// .remove() retorna a exceção "NoSuchElementException"
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		System.out.println(fila.size()); // Tamanho da fila
		System.out.println(fila.isEmpty()); // Fila está vazia?
		System.out.println(fila.contains("Gui")); // Contém esse elemento na fila?
		fila.clear(); // Limpar fila
	}
}
