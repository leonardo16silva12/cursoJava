package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 1) {
				// Quando utilizado, a partir do momento que a expressão for true, em vez de encerrar o laço, ele não mostra
				// o syso de quando a expressão for true
				continue;
			}
			
			System.out.println(i);
		}
		
	}
}
