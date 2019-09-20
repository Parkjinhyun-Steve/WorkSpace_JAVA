package kr.jpub.java.junit;
public class Greeting {
	public String getMessage(int hour) {
		String message;
		if (hour >= 5 && hour <11 ) {
			message = "좋은 아침입니다";
			
		}else if (hour > 11 && <17) {
			message = "안녕하세요";
			
		}else {
			message = "수고가 많으십니다."
		}
		return message;
		
	}

}
