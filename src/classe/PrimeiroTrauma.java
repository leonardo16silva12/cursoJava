package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		
		// Acessar um atributo de instância criando outra instância
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		// Ou é possível acessar, transformando o atributo em static
		System.out.println(b);
		
	}
	
}
