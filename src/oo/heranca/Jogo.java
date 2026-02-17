package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Heroi j1 = new Heroi();
		j1.x = 10;
		j1.y = 10;

		Monstro j2 = new Monstro();
		j2.x = 10;
		j2.y = 11;

		System.out.println("Jogador 1 (X): " + j1.x + " (Y): " + j1.y);
		System.out.println("Jogador 2 (X): " + j2.x + " (Y): " + j2.y);

		System.out.println("Jogador 1 (Vida): " + j1.vida);
		System.out.println("Jogador 2 (Vida): " + j2.vida);

		System.out.println("Jogador 1 vai atacar jogador 2...");
		j1.atacar(j2);

		System.out.println("Jogador 1 (Vida): " + j1.vida);
		System.out.println("Jogador 2 (Vida): " + j2.vida);
		
		System.out.println("Jogador 2 vai atacar jogador 1...");
		j2.atacar(j1);

		System.out.println("Jogador 1 (Vida): " + j1.vida);
		System.out.println("Jogador 2 (Vida): " + j2.vida);

	}

}
