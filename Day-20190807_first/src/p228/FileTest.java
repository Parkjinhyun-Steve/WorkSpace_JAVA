package p228;

import java.io.File;
import java.io.IOException;

public class FileTest {

	// ���� Ŭ������ ����ϱ� ���ؼ�
	// 1. ���� ��ü ���� (�ΰ��� ���)
	//    ���� ������ / ���� �����
	// File file new = File("�����̸�")
	// File file new = File("���丮 ���", "�����̸�");

	
	public void Test() throws IOException {   // �Լ� Test �����
		File file=new File("C:/DEV/WorkSpace_JAVA/sample.txt"); //sample.txt ������ ������� ������ �о File ��ü�� �����Ѵ�.		
		File dir=new File("C:\\DEV\\WorkSpace_JAVA\\DirTest");	// ���丮 �����
		
		
		if(file.exists()) {  // ������ ���� ������ Ȯ���Ҽ� �ִ� �Լ� -> exists
			System.out.println("������ �������� �ʽ��ϴ�.");
			
			file.createNewFile(); // ���ϻ��� �Լ� -> creatNewFile
			System.out.println("�� ������ ��������ϴ�.");		
		}
			
		// ���丮 �����
		dir.mkdir();
		System.out.println("DirTest��� ���丮�� ��������ϴ�.");
		
		File dirlist = new File(".");
		
		for(String str : dirlist.list()) {
			System.out.println(str);		
		}	
		
	}
	
	
	
	public static void main(String[] args) {  // �����Լ�
		FileTest ft = new FileTest();
		
		try {
			ft.Test();			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();		
			
		}
		
	}
	
}
