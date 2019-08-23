package p60;

public class WrapperTest2 {

	public static void main(String[] args) {
		//int -> Integer
		Integer num01=new Integer(10);  // 안 좋은 방법   // new -> 클래스, 말록 함수
		Integer num02=Integer.valueOf(10);  // 좋은 방법  .사용후 선택   // Integer는 클래스?? 참조에 의한 변수??
		
		//Integer -> int
		int num03=num02.intValue();   // int로 안되는 부분 때문에 Integer라는 클래스를 만들어 둠. 메모리 문제?? 값에 의한 변수?
				
		//String -> Integer
		Integer num04=new Integer("10"); // 안좋은 방법
		Integer num05=Integer.valueOf("10");  // 좋은 방법
		Integer num06=Integer.valueOf("11", 2);  // 안좋은 방법
		
		System.out.println(num06);
		
		//String -> int  ; 문자를 숫자로; 가장 많이 사용하는 케이스
		int num07=Integer.parseInt("10");  // 좋은 방법
		int num08=Integer.parseInt("11", 2); // 안좋은 방법
		
		//int -> String ; 숫자를 문자로
		String num09=Integer.toString(10);  // 좋은 방법; 가장 많이 사용하는 케이스
		
		//Integer -> String
		Integer num10=Integer.valueOf(10);
		String num11=num10.toString();				

	}

}