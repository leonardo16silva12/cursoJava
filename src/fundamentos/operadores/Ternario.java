package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 9.0;
		// Utilizando uma condicional que será true ou false, o ternário (?) 
		// serve para identificar os valores caso a expressão for true ou false
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado. o.o";
		String resultadoFinal1 = media >= 7.0 ? "aprovado. e.e" : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal1);
		
		// Porém, o recomendável, é não utilizar um ternário dentro do outro
		String resultadoFinal2 = media >= 7.0 ? "aprovado. e.e" : "reprovado. o.o";
		System.out.println("O aluno está " + resultadoFinal2);

		
		// Utilizado para tratar true/false
		double nota = 7.5;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String r = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", r);
		
		
	}

}
