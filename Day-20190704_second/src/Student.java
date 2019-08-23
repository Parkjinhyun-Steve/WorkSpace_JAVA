//
//
// 작성일 : 2019.07.04
// 작성자 : 박진현
// 요 약 : 클래스와 객체의 정의 및 만드는 방법




public class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;
	public int score;
	public static final int MAX_SCORE = 100;
	
	public void setScore(int nowScore) {
	
	}
	
	public void PrintScore() {
		System.out.println(name + "씨는" + MAX_SCORE + "점 만점 중," );
	}
	
	public int getScore() {
		return score;
	
	}
}
