package p323;

public class DefaultBar implements Bar {
	private String message;
	
	public DefaultBar(String message) {
		this.message = message;
		
	}

	@Override
	public String say() {		
		return this.message;
	}

}
