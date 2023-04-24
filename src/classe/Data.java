package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;

		// "this()" - Chamar um construtor a partir de outro construtor, o que vai
		// variar é o número de parâmetros passados e a ordem dos parâmetros.
		// Sempre que utilizado como método, significa que está chamando um construtor.
		// Só pode ser utilizado como método dentro de outro construtor.
		// Não pode chamar dois this() em dois construtores, pois vai criar um loop, um
		// chamando o outro indefinidamente,
		// Sempre chamar um construtor que em algum deles crie um objeto corretamente
		this(1, 1, 1970);
	}

	Data(int dia, int mesInicial, int anoInicial) {
		// "this" - Acessar a váriavel de instância, mesmo se não houver conflito de
		// nomes
		// Não pode chamar o this em métodos static, porque o método é associado a
		// classe e o this é associado a instância
		// utilizado para chamar atributos, métodos 
		this.dia = dia;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}

	String formatarData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
