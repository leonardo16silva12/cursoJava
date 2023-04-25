package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Leonardo", 90.0);
		System.out.println(p1.apresentarPeso());

		Comida c1 = new Comida("Açaí", 0.500);
		Comida c2 = new Comida("Paçoca", 0.500);

		p1.comer(c1);
		System.out.println(p1.apresentarPeso());

		p1.comer(c2);
		System.out.println(p1.apresentarPeso());

	}

}
