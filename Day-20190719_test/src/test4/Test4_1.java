package test4;

public class Test4_1 {

	public static void main(String[] args) {
		// ����ó�� ���Ǵ� Ŭ���� Count�� ����ÿ�.
		// Ŭ������ Count
		// �ʵ�� count:Int (�ʱⰪ )
		// �޼���
		// add():void  -count �� 1 ����
		// sub():void  -count �� 1 ����
		
		
		//  Ŭ������  ��ü�� = new �����ڸ�	   -> ��ü ����	
		Count count1 = new Count();
		Count count2 = new Count();
				
		System.out.println(count1.count + "   " + count2.count);
		count1.add();
		count2.add();
		
		System.out.println(count1.count + "   " + count2.count);
		count1.sub();
		count2.sub();
		
		System.out.println(count1.count + "   " + count2.count);
		
		
	}

}
