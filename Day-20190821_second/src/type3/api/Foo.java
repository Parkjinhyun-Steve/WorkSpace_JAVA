package type3.api;

public interface Foo {
	String say();
	
	static Foo newInstance(String message) {
		return new DefaultFoo(message);
	}

}
