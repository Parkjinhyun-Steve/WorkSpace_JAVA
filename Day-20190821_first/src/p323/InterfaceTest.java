package p323;

public class InterfaceTest {

	public static void main(String[] args) {
		Bar bar=Bar.newInstance("Hello Bar!");  // 객체를 만들어 주는 함수를 만듬.
		
		System.out.println(bar.say());
		
	}

}
