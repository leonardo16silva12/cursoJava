package controle.exercicios;

import java.util.Scanner;

// 3. Criar um programa que receba duas notas parciais, calcular a média final. 
// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
// se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
// caso contrário imprime no console "Reprovado".
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		System.out.println("Média Final: " + media);
		
		if(media >= 7) {
			System.out.println("Aprovado. :)");
		} else if (media < 7 && media > 4) {
			System.out.println("Em recuperação. :o");
		} else {
			System.out.println("Reprovado. :(");
		}
		

		entrada.close();
		
		
	}
}
