package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	void addItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void addItem(String nome, double preco, int qtde) {
		this.itens.add(new Item(new Produto(nome, preco), qtde));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.qtde * item.produto.preco;
		}
		
		return total;
	}

}
