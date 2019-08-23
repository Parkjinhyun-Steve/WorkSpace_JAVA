package p246;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File file = new File("C:/DEV/WorkSpace_JAVA/sample1.txt");  // 파일 객체 만들기
		boolean flag=file.delete();
		
		System.out.println(flag);
		

	}

}
