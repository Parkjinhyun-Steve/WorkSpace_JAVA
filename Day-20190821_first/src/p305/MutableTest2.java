package p305;

public class MutableTest2 {

	public static void main(String[] args) {  
		someMethod();	  // 위임  

	}

	public static void someMethod() {
		StringBuilder text=new StringBuilder("This is ");
		System.out.println("조작 전 : "+text);
		write(text);
		System.out.println("조작 후 : "+text);
	}
	
	public static void write(StringBuilder text) {
		text.append("an apple.");
	}

}
