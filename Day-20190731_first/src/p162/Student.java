package p162;  // ���� Ŭ���� -> �� Ŭ����

public class Student {
	
	//�л��̸�
	private String name;
	//�л�����
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