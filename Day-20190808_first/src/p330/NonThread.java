package p330;

public class NonThread {
	private void add(String username, int target) {
		
		for(int i=0; i<100; i++) {
			try {
				System.out.println(username+ "�����Ȳ: " + target);
				Thread.sleep(1);
				target++;				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}				
			
		}
		
		System.out.println(username+"��(��) ��û�� ��� : " + target);
		
	}
	
	public static void main(String[] args) {
		NonThread test=new NonThread();  // ��ü ����
		test.add("������",20);
		test.add("������",20);
		test.add("���ù�",20);

	}

}