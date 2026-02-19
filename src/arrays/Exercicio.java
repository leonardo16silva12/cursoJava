package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		// Pode colocar o [] antes do nome da váriavel ou depois:
		// double[] notasAlunos = new double[3];
		double notasAlunos1[] = new double[3];

		notasAlunos1[0] = 9.0;
		notasAlunos1[1] = 7.5;
		notasAlunos1[2] = 10;

		// Metodo para converter array para string
		System.out.println(Arrays.toString(notasAlunos1));

		double total1 = 0;

		// Colocamos o .length para não ter que ficar editando o tamanho do for
		for (int i = 0; i < notasAlunos1.length; i++) {
			// o [i] vai fazer com que o for vai pegar index por index
			total1 += notasAlunos1[i];
		}

		System.out.println("Total: " + total1 / notasAlunos1.length);

		final double notaArmazenada = 5.9;

		// Utiliza-se par de chaves para definir a literal de cada index em sua
		// declaração
		// Pode-se utilizar váriaveis dentro do array também
		double[] notasAlunos2 = { 6.9, 8.9, notaArmazenada, 10 };

		System.out.println(Arrays.toString(notasAlunos2));

		// Pegar primeiro registro do array
		System.out.println(notasAlunos2[0]);

		// Pegar último registro do array
		System.out.println(notasAlunos2[notasAlunos2.length - 1]);

		double total2 = 0;

		for (int i = 0; i < notasAlunos2.length; i++) {
			// o [i] vai fazer com que o for vai pegar index por index
			total2 += notasAlunos2[i];
		}

		System.out.println("Total: " + total2 / notasAlunos2.length);
	}

}
