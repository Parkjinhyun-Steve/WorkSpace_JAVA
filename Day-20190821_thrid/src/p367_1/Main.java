package p367_1;

public class Main { // 사용자 정보를 가지고 있는 모델 클래스 생성

	private static final int User_NUM = 5;

	public static void main(String[] args) {		
		User[] user = new User[User_NUM];
		for(int i=0; i<User_NUM; i++) {
			user[i]=new User((i+1)+"-user");
			user[i].print();
			
		}

	}

}
