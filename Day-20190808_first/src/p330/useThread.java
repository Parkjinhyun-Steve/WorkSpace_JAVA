package p330;

public class useThread {
	
	public static void main(String[] args) {

		useThread test=new useThread();  // ��ü ����
		Thread t1=new AddThread("������",20);
		Thread t2=new AddThread("������",20);
		Thread t3=new AddThread("���ù�",20);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
