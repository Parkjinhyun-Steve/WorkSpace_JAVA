package p323;

public interface Bar {
	String say();
	
	static Bar newInstance(String message) {  // *** 객체를 만들어 주는 클래스 : factory 클래스   -> factory 함수
		
		return new DefaultBar(message);  // 익명 클래스  // 객체 이름이 없다.
		 
		// DefaultBar a = new DifaultBar(message)  // <-- 보통 이렇게 쓴다.. a = 객체이름
		// return a
	}
	
	
	
}
