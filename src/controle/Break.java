package controle;

public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			// Quando utilizado, a partir do momento que a expressão for true, irá sair do laço e continuará o código
			if(i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
			System.out.println("Fim.");
		
	}
}
