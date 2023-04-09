package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número: ");
	    double num1 = entrada.nextDouble();
	    
		System.out.println("Informe a operação: ");
		String op = entrada.next();
	    
		System.out.println("Informe outro número: ");
	    double num2 = entrada.nextDouble();
	    
		double r = "+".equals(op) ? num1 + num2 : 0;
		r = "-".equals(op) ? num1 - num2 : r;
		r = "*".equals(op) ? num1 * num2 : r;
		r = "/".equals(op) ? num1 / num2 : r;
		r = "%".equals(op) ? num1 % num2 : r;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, r);
		
		entrada.close();
		
	}
}
