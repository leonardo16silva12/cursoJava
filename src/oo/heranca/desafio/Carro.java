package oo.heranca.desafio;

public class Carro {

	int velocidade;

	void acelerar() {
		velocidade += 5;
	}

	void frear() {
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
