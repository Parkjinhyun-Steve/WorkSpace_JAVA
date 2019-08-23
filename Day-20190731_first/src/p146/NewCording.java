// JAVA 8 새로운 코딩 방식

package p146;

import java.util.Arrays;
import java.util.List;

public class NewCording {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;

		// 기존방식 코딩
		for(String name : names) {      
			if(name.contains("a")) {    
				count++;				
			}							
		}								
		
		System.out.println("Count : "+count);

		// 새로운 방식 코딩 (스트림 -> 새로운 구문 JAVA 8에서 나옴)
		count=names.stream().filter(name->name.contains("a")).count();  //new
		
		System.out.println("Count : "+count);

	}

}
