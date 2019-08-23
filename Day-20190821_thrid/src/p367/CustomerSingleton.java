package p367;

public class CustomerSingleton {
	
	private static CustomerSingleton instance=new CustomerSingleton();  // static 은 단 하나 만듬을 말한다.
	
	private CustomerSingleton() {
		
	}
	
	public static CustomerSingleton getInstance() {
		return instance;
		
	}

}
