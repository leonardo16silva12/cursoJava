package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	public abstract String mamar();
	
	@Override
	public String andar() {
		return "Saindo do lugar...";
	}
}
