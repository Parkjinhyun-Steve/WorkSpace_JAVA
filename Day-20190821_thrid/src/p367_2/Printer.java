package p367_2;

public class Printer {

	private static Printer printer=null;  // ������ ��ü ����

	public static Printer getPrinter() {
		if(printer==null) {
			try {
				Thread.sleep(1);
				
			}catch(InterruptedException e) {}
			
			printer=new Printer();
		}		
		return printer;
	}

	private int counter;

	public void print(String str) {
		counter++;
		System.out.println(str+counter);
		
	}

}