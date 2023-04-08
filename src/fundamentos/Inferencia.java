package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e Inicialização
		System.out.println(a);
		
		// Se inserir a váriavel como "var", o JAVA vai observar e definir o tipo automaticamente
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		// Porém, o JAVA proíbe alterar o tipo da variável após sua definição ( No JS existe tipos mais flexíveis)
		// Exemplo:
		// c = 4.5;
		
		double d; // Declaração
		d = 123.45; // Inicialização
		System.out.println(d); // Utilização
		
		// Na variável "var", não é possível inicializar a variável na linha abaixo da declaração, precisa ser na mesma linha;
		// var e;
		// e = 123.45;
		
	}
}
