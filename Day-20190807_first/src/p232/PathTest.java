package p232;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		Path path1=Paths.get("C:/DEV/WorkSpace_JAVA/sample1.txt");
		
		
		//���� Ŭ���� 
		URI uri=URI.create("file:///C://DEV/sample1.txt");
		Path path2=Paths.get(uri);
		
		System.out.println(path1.getParent());
		System.out.println(path2.getParent());
		
		System.out.println(path2.resolveSibling("sample1.txt));
		
		

	}

}
