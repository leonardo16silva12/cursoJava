package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 21;
		d1.mes = 1;
		d1.ano = 2003;
		String data1 = d1.formatarData();
		
		var d2 = new Data();
		d2.dia = 30;
		d2.mes = 8;
		d2.ano = 2000;
		String data2 = d2.formatarData();
		
		System.out.println("Primeira Data: " + data1);
		System.out.println("Segunda Data: " + data2);
	}
	
}
