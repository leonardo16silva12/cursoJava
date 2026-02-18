package oo.heranca.desafio;

public class Carro {

	public final int velocidade_maxima;
	protected int velocidade;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		this.velocidade_maxima = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidade + getDelta() > velocidade_maxima) {
			velocidade = velocidade_maxima;
		} else {
			velocidade += getDelta();
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

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
