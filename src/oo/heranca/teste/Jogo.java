package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi(10, 10);
		Monstro monstro = new Monstro(10, 11);

		System.out.println("Herói(X): " + heroi.x + " (Y): " + heroi.y);
		System.out.println("Monstro(X): " + monstro.x + " (Y): " + monstro.y);

		System.out.println("Herói(Vida): " + heroi.vida);
		System.out.println("Monstro (Vida): " + monstro.vida);

		System.out.println("Herói vai atacar Monstro...");
		heroi.atacar(monstro);
		
		System.out.println("Monstro vai atacar Herói...");
		monstro.atacar(heroi);

		System.out.println("Herói(Vida): " + heroi.vida);
		System.out.println("Monstro(Vida): " + monstro.vida);

	}

}
