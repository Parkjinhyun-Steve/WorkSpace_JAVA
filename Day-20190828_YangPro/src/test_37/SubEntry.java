package test_37;

public class SubEntry extends Entry {  // extends Entry  -> Entry Ŭ���� ��� : Entry �޼ҵ�  ��밡��    
	String definition; // �ʵ� �߰�
	int year;
	
	SubEntry(){ // ������  �޼ҵ�
		
	}
	
	SubEntry(String w){  // ������ �޼ҵ�
		// super();  // super ��� Ű���带 ����Ͽ� ���� Ŭ����  ȣ��  // this�� �ڱ� �ڽŵ�(Ŭ����) ȣ�� // super�� ���� Ŭ���� ȣ��
		super(w);  // ?????????????????? �� �ȴ���?
		
	}
	SubEntry(String word, String definition, int year) {  // ������ �żҵ�(�Ķ����, �Ķ����, �Ķ����)
		this(word);				// this�� �ڱ� �ڽŵ�(Ŭ����) ȣ�� // super�� ���� Ŭ���� ȣ��
		this.definition=definition;  
		this.year=year; 
	
	}
	
	public void printView() {
		super.writeView();
		System.out.println("����: " + definition);
		System.out.println("�ñ�: " + year);
		
	}
	

}
