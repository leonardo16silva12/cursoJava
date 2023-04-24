package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribuição por Valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por Referência  (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println("Data 1: " + d1.formatarData());
		System.out.println("Data 2: " + d2.formatarData());
		
		// Chamada do método para voltar datas para valor padrão, como ambos os objetos estão atribuídos 
	    // na mesma referência, ambas as datas serão alteradas.
		voltarDataPadrao(d1); 
		
		System.out.println("Data 1: " + d1.formatarData());
		System.out.println("Data 2: " + d2.formatarData());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	// O valor primitivo terá o mesmo comportamento de uma atribuição de um primitivo, ou seja,
	// o que é passado para um método é uma cópia e não a referência.
	static void alterarPrimitivo(int c) {
		c++;
	}

}
