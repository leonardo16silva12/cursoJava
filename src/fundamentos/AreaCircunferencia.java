package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		// Double para números quebrados
		double r = 3.4;
		
		// Forma de deixar constante o valor de uma variável
		final double pi = 3.14159;
		
		// Fórmula da Circunferência
		double area = pi * r * r;
		
		System.out.println(area);
		
		r = 10;
		area = pi * r * r;
		System.out.println("Área = " + area);
	}
}
