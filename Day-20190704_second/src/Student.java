//
//
// �ۼ��� : 2019.07.04
// �ۼ��� : ������
// �� �� : Ŭ������ ��ü�� ���� �� ����� ���




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
		System.out.println(name + "����" + MAX_SCORE + "�� ���� ��," );
	}
	
	public int getScore() {
		return score;
	
	}
}
