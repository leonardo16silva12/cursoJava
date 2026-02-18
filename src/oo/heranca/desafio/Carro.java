package oo.heranca.desafio;

public class Carro {

	public final int velocidade_maxima;
	protected int velocidade;
	protected int delta = 5;

	protected Carro(int velocidadeMaxima) {
		this.velocidade_maxima = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidade + delta > velocidade_maxima) {
			velocidade = velocidade_maxima;
		} else {
			velocidade += delta;
		}
	}

	public void frear() {
		if (velocidade >= 5) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}
	}

	public String toString() {
		return "Velocidade atual é " + velocidade + "Km/h.";
	}
}
