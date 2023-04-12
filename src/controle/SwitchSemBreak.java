package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		// if(boolean)...
		// while(boolean)...
		// for(;boolean;)...
		// switch(valor)...

		String faixa = "Amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("XXXXXXXX");
		case "marrom":
			System.out.println("YYYYYYYY");
		case "roxa":
			System.out.println("ZZZZZZZZ");
		case "verde":
			System.out.println("AAAAAAAA");
		case "laranja":
			System.out.println("BBBBBBBB");
		case "vermelha":
			System.out.println("CCCCCCCC");
		case "amarela":
			System.out.println("DDDDDDDD");
		}

	}
}
