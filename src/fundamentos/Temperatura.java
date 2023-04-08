package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		
		double f = 86;
		double c;
		
		final double ajuste = 32;
		final double fator = 5.0 / 9.0;
				
		c = (f - ajuste) * fator;
		
		System.out.println(f + " Fahrenheit = " + c + " Celsius");
		
		
		
		
		
	}
}
