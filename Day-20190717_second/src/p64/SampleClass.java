package p64;  // 클래스를 포함하고 있는 공간들을 구분하기 위해 패키지를 쓴다.

public class SampleClass {  // 클래스란 사용자가 만들어서 사용하는 자료형이다. 
	                        // 클래스란 다른 타입의 자료형을 인캡슐레이션(포함) 하고 있는 자료형이다.
	                        // 클래스는 자료형 뿐만 아니라 함수또한 인캡슐레이션 하고 있다.
							// 클래스란 객체변수를 만들어 사용하기 위해서는 객체변수를 인트턴스를 해줘야 한다.
	
	private String name=null;  // 값을 초기화 할때 null을 써줘야 된다 !!
	
	private String action() {
		
		//5. 업무로직 추가
		name="SampleClassd예제";
		
		String responseStr=name+">"+"입니다.";
				
		return responseStr;
	}
		// TODO Auto-generated method stub
	
		
	
	//1. 클래스를 실행 할 수 있도록 엔트리 함수를 만든다.	
	public static void main(String[] args) {
		
		//2. 객체 변수를 인스턴스 한다.
		SampleClass sample=new SampleClass();
		
		
		//3. 함수를 호출하여 반환값을 저장한다.
		String response=sample.action();
		
		
		//4. 저장된 반환값을 프린트 한다.
		System.out.println(response);
	}

}

