package p323;

public interface Bar {
	String say();
	
	static Bar newInstance(String message) {  // *** ��ü�� ����� �ִ� Ŭ���� : factory Ŭ����   -> factory �Լ�
		
		return new DefaultBar(message);  // �͸� Ŭ����  // ��ü �̸��� ����.
		 
		// DefaultBar a = new DifaultBar(message)  // <-- ���� �̷��� ����.. a = ��ü�̸�
		// return a
	}
	
	
	
}