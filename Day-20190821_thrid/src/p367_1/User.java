package p367_1;

public class User {

	private String name;

	public User(String name) {
		this.name=name;
	}

	public void print() {  // 위임을 해보자!!
		Printer printer = Printer.getPrinter();
		printer.print(this.name + "print using" + printer.toString() + ".");
		
	}

}
