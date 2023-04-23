package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(21, 1, 2003);
		String data1 = d1.formatarData();
		
		var d2 = new Data();
		d2.dia = 30;
		d2.mes = 8;
		d2.ano = 2000;
		String data2 = d2.formatarData();
		
		Data d3 = new Data();
		String data3 = d3.formatarData();
		
		System.out.println("Primeira Data: " + data1);
		System.out.println("Segunda Data: " + data2);
		System.out.println("Terceira Data: " + data3);
	}
	
}
