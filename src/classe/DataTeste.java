package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 21;
		d1.mes = 01;
		d1.ano = 2003;
		
		var d2 = new Data();
		d2.dia = 30;
		d2.mes = 8;
		d2.ano = 2000;
		
		System.out.println("Primeira Data: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.println("Segunda Data: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
	}
	
}
