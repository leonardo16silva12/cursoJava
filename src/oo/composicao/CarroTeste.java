package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println("Está ligado? " + c1.estaLigado());

		c1.ligar();
		System.out.println("Está ligado? " + c1.estaLigado());
		
		System.out.println("Giros do Motor: " + c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Giros do Motor: " + c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		// Faltou encapsulamento:
		// c1.motor.fatorInjecao = -30;
		
		System.out.println("Giros do Motor: " + c1.motor.giros());
		
		
	}

}
