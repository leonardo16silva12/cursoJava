package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TestDrive {

	public static void main(String[] args) {

		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari(400);

		System.out.println("Civic e Ferrari vão acelerar 2 vezes...");

		civic.acelerar();
		civic.acelerar();

		ferrari.acelerar();
		ferrari.acelerar();

		System.out.println("(Civic) " + civic);
		System.out.println("(Ferrari) " + ferrari);

		System.out.println("Civic e Ferrari vão frear 3 vezes...");

		civic.frear();
		civic.frear();
		civic.frear();

		ferrari.frear();
		ferrari.frear();
		ferrari.frear();

		System.out.println("(Civic) " + civic);
		System.out.println("(Ferrari) " + ferrari);
	}

}
