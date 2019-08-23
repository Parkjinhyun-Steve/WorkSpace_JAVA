package p162;  // 빈즈 클래스 -> 모델 클래스

public class Student {
	
	//학생이름
	private String name;
	//학생성적
	private int score;
	
	Student() {
	
	}
		
	Student(String name, int score){
		this.name=name;
		this.score=score;
		
	}

	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
		
	@Override
	public String toString() {
		return name +":" +score;
		
	}
	
}