// JAVA 8 ���ο� �ڵ� ���

package p146;

import java.util.Arrays;
import java.util.List;

public class NewCording {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;

		// ������� �ڵ�
		for(String name : names) {      
			if(name.contains("a")) {    
				count++;				
			}							
		}								
		
		System.out.println("Count : "+count);

		// ���ο� ��� �ڵ� (��Ʈ�� -> ���ο� ���� JAVA 8���� ����)
		count=names.stream().filter(name->name.contains("a")).count();  //new
		
		System.out.println("Count : "+count);

	}

}
