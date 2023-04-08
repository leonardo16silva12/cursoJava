package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Olá mundo!!!";
		
		// Método para deixar letras maiúsculas
		s = s.toUpperCase();
		
		// Método para substituir termos 
		s = s.replace("!!!", "...");
		
		// Método para concatenar
		s = s.concat(" HEHEHEHEHE");
		
		
		System.out.println(s);
		
		// Posso utilizar a notação de ponto dentro do SYSO
		System.out.println("Leo".toUpperCase());
		
		
		// Outra situação
		String y = "Bom dia X".replace("X", "Leo");
		System.out.println(y);
		
		// Tipos Primitivos (INT, double, etc...) NÃO TEM NOTAÇÃO ".";
	
		
		
	}
}
