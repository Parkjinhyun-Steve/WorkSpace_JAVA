package p60;

public class WrapperTest2 {

	public static void main(String[] args) {
		//int -> Integer
		Integer num01=new Integer(10);  // �� ���� ���   // new -> Ŭ����, ���� �Լ�
		Integer num02=Integer.valueOf(10);  // ���� ���  .����� ����   // Integer�� Ŭ����?? ������ ���� ����??
		
		//Integer -> int
		int num03=num02.intValue();   // int�� �ȵǴ� �κ� ������ Integer��� Ŭ������ ����� ��. �޸� ����?? ���� ���� ����?
				
		//String -> Integer
		Integer num04=new Integer("10"); // ������ ���
		Integer num05=Integer.valueOf("10");  // ���� ���
		Integer num06=Integer.valueOf("11", 2);  // ������ ���
		
		System.out.println(num06);
		
		//String -> int  ; ���ڸ� ���ڷ�; ���� ���� ����ϴ� ���̽�
		int num07=Integer.parseInt("10");  // ���� ���
		int num08=Integer.parseInt("11", 2); // ������ ���
		
		//int -> String ; ���ڸ� ���ڷ�
		String num09=Integer.toString(10);  // ���� ���; ���� ���� ����ϴ� ���̽�
		
		//Integer -> String
		Integer num10=Integer.valueOf(10);
		String num11=num10.toString();				

	}

}