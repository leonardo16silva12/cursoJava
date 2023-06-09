package classe;

import java.text.DecimalFormat;

public class ProdutoTeste {

	public static void main(String[] args) {
		
        String formato = "R$#,##0.00";
        DecimalFormat d = new DecimalFormat(formato);
		
		Produto p1 = new Produto("Notebook", 4000);
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1500;
		
		Produto.desconto = 0.50;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double totalCarrinho = precoFinal1 + precoFinal2;

		System.out.println(p1.nome + " custa " + d.format(precoFinal1));
		System.out.println(p2.nome + " custa " + d.format(precoFinal2));
		System.out.println("Total será " + d.format(totalCarrinho));

	}

}
