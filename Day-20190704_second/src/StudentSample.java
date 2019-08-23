//
//
// 작성일 : 2019.07.04
// 작성자 : 박진현
// 요 약 : 객체의 정의 및 만드는 방법





public class StudentSample {
	
	public static void main(String[] args) {
		// Student shion; //객체 쓰레기가 만들어진다.

		// Student shion=null; //객체 만들어진다.(객체 :  클레스에 대한 변수를 선언하는 것인다. 객체에는 인스턴스 처리가 이루어져야 된다.)
		// shion=new Student();
		
		Student shion=new Student();
		shion.name="홍길동";
		shion.score=80;
		shion.PrintScore();		
		
	}
}
