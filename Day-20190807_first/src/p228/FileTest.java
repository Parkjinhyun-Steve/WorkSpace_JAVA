package p228;

import java.io.File;
import java.io.IOException;

public class FileTest {

	// 파일 클래스를 사용하기 위해서
	// 1. 파일 객체 생성 (두가지 방법)
	//    파일 절대경로 / 파일 상대경로
	// File file new = File("파일이름")
	// File file new = File("디렉토리 경로", "파일이름");

	
	public void Test() throws IOException {   // 함수 Test 만들기
		File file=new File("C:/DEV/WorkSpace_JAVA/sample.txt"); //sample.txt 파일이 있을경우 파일을 읽어서 File 객체에 대입한다.		
		File dir=new File("C:\\DEV\\WorkSpace_JAVA\\DirTest");	// 디렉토리 만들기
		
		
		if(file.exists()) {  // 파일의 존재 유무를 확인할수 있는 함수 -> exists
			System.out.println("파일이 존재하지 않습니다.");
			
			file.createNewFile(); // 파일생성 함수 -> creatNewFile
			System.out.println("빈 파일은 만들었습니다.");		
		}
			
		// 디렉토리 만들기
		dir.mkdir();
		System.out.println("DirTest라는 디렉토리를 만들었습니다.");
		
		File dirlist = new File(".");
		
		for(String str : dirlist.list()) {
			System.out.println(str);		
		}	
		
	}
	
	
	
	public static void main(String[] args) {  // 메인함수
		FileTest ft = new FileTest();
		
		try {
			ft.Test();			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();		
			
		}
		
	}
	
}
