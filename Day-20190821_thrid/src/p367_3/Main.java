package p367_3;

public class Main { // 사용자 정보를 가지고 있는 모델 클래스 생성

	private static final int Thread_Num=10;

	public static void main(String[] args) {		
		UserThread[] user=new UserThread[Thread_Num];
		for(int i=0; i<Thread_Num; i++) {
			user[i]=new UserThread((i+1)+"thread");
			user[i].start();
			
		}

	}

}
