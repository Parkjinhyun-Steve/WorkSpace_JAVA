package test2;

public class Test2_3 {

	public static void main(String[] args) {
		// ��Ģ������ �����ϴ� �޼ҵ�(�Լ�) �����
		
		int x=10, y=3;
		System.out.println(add(x,y));  // ���Ѱ�
		System.out.println(sub(x,y));  // ����
		System.out.println(mul(x,y));  // ���Ѱ�
		System.out.println(div(x,y));  // ������(��) - ���� �Ҽ������� ���
		System.out.println(rem(x,y));  // ������(��������)  
		
		Calculator cal1 = new Calculator(10,3);
		//Ŭ�����̸�   ��ü���� = new ������(Ŭ���� �̸��� �Ȱ���)
				
		System.out.println(cal1.add());
		System.out.println(cal1.sub());
		
		
		Calculator cal2 = new Calculator(3,7);

		System.out.println(cal2.add());
		System.out.println(cal2.sub());
		
		

	}

	private static int rem(int x, int y) {
		
		return x%y;
	}

	private static double div(int x, int y) {
		
		return (double)x/y;
	}

	private static int mul(int x, int y) {
		
		return x*y;
	}

	private static int sub(int x, int y) {
		
		return x-y;
	}

	private static int add(int x, int y) {
		
		return x+y;
				
				
		
	}
}

