package p000;

public class Entry {
	private String word;
	
	// Ŭ������� �Ȱ��� �޼ҵ�� '������'//�����ڵ� �޼ҵ��� �ϳ�
	public Entry() {   // ������
		System.out.println("*** ������ ***");		
	}
		
	
	// Ŭ������� �Ȱ��� �޼ҵ�� '������'  
    // �Ķ���͸� �ٸ��� �ؼ� ������ �޼ҵ带 ����� �ִ�.
	// �����ε� -> ���� �̸��� �޼ҵ忡 �ٸ� �Ķ���͸� �־ �����Ѵ�.
    // �������̵� -> �޼ҵ���� ������ �޼ҵ� ������ �ٸ���.	
	public Entry(String word) {    // ������
		this();	        	//  <- this��� Ű���带 �̿��ؼ� �޼ҵ带 ȣ���Ѵ�. 
		this.word = word;   //  <- this.word��� Ű���带 �̿��ؼ� �޼ҵ带 ȣ���Ѵ�.
	}
	
	public void writeView() {   // writeView ��� �޼ҵ� ����
		System.out.println("���: " + word);
	}	

}
