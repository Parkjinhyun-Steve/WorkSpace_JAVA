package p367_1;

public class Printer {

	private static Printer printer=null;  // ������ ��ü ����

	public static Printer getPrinter() {
		if(printer==null) {
			printer=new Printer();
		}		
		return printer;
	}

	public void print(String str) {
		System.out.println(str);
		
	}

}