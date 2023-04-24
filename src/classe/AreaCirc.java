package classe;

public class AreaCirc {

	double r;
	//  O static permite alterações, porém se inserir o "final", não serão permitidas mais alterações
 	static double pi = 3.14;
	
	AreaCirc(double rInicial) {
		r = rInicial;
	}
	
	double area() {
		return pi * Math.pow(r, 2);
	}
	
}
