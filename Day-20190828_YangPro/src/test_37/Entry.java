package test_37;

public class Entry {
	String word;
	
	Entry(){	// ������
		System.out.println("*** ������ ***");		
		
	}
	
	Entry(String w){	// ������
		this();		    // Entry()ȣ��  // ���� ù�ٿ� �־����
		word=w;         // �ʵ�� �ʱ�ȭ  this.word = word; �� ����.
		 	
	}
	
	public void writeView() {   // writeView ��� �޼ҵ� ����
		System.out.println("���: " + word);
	}
	
	

}
