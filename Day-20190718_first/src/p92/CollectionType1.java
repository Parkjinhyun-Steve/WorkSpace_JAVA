package p92;

import java.util.ArrayList;
import java.util.List;

public class CollectionType1 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("java");
		
		String element=list.get(0).toString();  // ��ڽ� 
		
		System.out.println(element);		
		
	}

}
