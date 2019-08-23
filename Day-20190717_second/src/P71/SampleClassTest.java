package P71;  // 클래스를 포함하고 있는 공간들을 구분하기 위해 패키지를 쓴다.

public class SampleClassBase {  
	private String name=null;
	
	public String action() {
	
	//1. 클래스를 실행 할 수 있도록 엔트리 함수를 만든다.	
	public static void main(String[] args) {
		
		//2. 객체 변수를 인스턴스 한다.
		SampleClassbase sample=new SampleClassbase();
		
		
		//3. 함수를 호출하여 반환값을 저장한다.
		String response=sample.action();
		
		
		//4. 저장된 반환값을 프린트 한다.
		System.out.println(response);
		
	


}

