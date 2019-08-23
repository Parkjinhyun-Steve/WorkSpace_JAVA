package test4;

public class Test4_1 {

	public static void main(String[] args) {
		// 다음처럼 사용되는 클래스 Count를 만드시오.
		// 클래스명 Count
		// 필드명 count:Int (초기값 )
		// 메서드
		// add():void  -count 값 1 증가
		// sub():void  -count 값 1 감소
		
		
		//  클래스명  객체명 = new 생성자명	   -> 객체 생성	
		Count count1 = new Count();
		Count count2 = new Count();
				
		System.out.println(count1.count + "   " + count2.count);
		count1.add();
		count2.add();
		
		System.out.println(count1.count + "   " + count2.count);
		count1.sub();
		count2.sub();
		
		System.out.println(count1.count + "   " + count2.count);
		
		
	}

}
