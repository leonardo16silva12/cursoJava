package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Informações do Funcionário
		
		// Tipos Numéricos Inteiros
		
		byte anosDeEmpresa = 23;
		
		short numeroDeVoos = 542;
		
		int id = 56789;
		
		// Para tipos longos, é necessário inserir o "L" no final do valor para definir que esse é um valor long;
		long pontosAcumulados = 2234845223L;
		
		
		// Tipos Númericos Reais
	
		// Para definir um valor em uma variável float (e não Double), é necessário inserir o "F" no final do valor 
		float salario = 11445.44F;
		
		double vendasAcumuladas = 2991797103.01;
		
		// Tipo Booleano
		
		boolean estaDeFerias = false;
		
		// Tipo Caractere
		
		char status = 'A';
		
		// Dias de Empresa
		System.out.println("Dias de Empresa: " + anosDeEmpresa * 365);
		
		// Número de Viagens
		System.out.println("Número de Viagens: " + numeroDeVoos / 2);
		
		// Pontos Acumulados
		System.out.println("Pontos Acumulados: " + pontosAcumulados / vendasAcumuladas);
		
		// Salario
		System.out.println("ID: " + id + " ganha " + salario);
		
		// Férias
		System.out.println("Férias: " + estaDeFerias);
		
		// Status
		System.out.println("Status: " + status);
		
		
		
		
		 
		
	}
}
