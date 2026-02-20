package lambdas;

// Obriga a interface a ter no máximo, um método/função **abstrata**
// Útil nas funções lambdas
@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);

	// Mas posso adicionar métodos default/estáticos e usar
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
