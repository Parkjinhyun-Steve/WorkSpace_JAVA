package p330;

public class useThread {
	
	public static void main(String[] args) {

		useThread test=new useThread();  // 객체 생성
		Thread t1=new AddThread("박진현",20);
		Thread t2=new AddThread("문재인",20);
		Thread t3=new AddThread("유시민",20);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
