package P71;

public class SampleClassTestBase {

	private String name=null;  // 값을 초기화 할때 null을 써줘야 된다 !!

	public String action() {

		name="SampleClassd예제";

		String responseStr=name+">"+"입니다.";

		return responseStr;
	}	


}

