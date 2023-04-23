package classe;

import java.text.DecimalFormat;

public class ProdutoTeste {

	public static void main(String[] args) {
		
        String formato = "R$#,##0.00";
        DecimalFormat d = new DecimalFormat(formato);
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.15;
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1299.99;
		p2.desconto = 0.10;		
		
		double precoFinal1 = p1.preco *(1 - p1.desconto);
		double precoFinal2 = p2.preco *(1 - p2.desconto);
		double totalCarrinho = precoFinal1 + precoFinal2;

		System.out.println(p1.nome + " custa " + d.format(precoFinal1));
		System.out.println(p2.nome + " custa " + d.format(precoFinal2));
		System.out.println("Total será " + d.format(totalCarrinho));

	}

}
