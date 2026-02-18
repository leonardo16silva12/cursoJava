package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", "Silva", 30);
		p1.setIdade(18);
		
		System.out.println(p1);
	}
}
