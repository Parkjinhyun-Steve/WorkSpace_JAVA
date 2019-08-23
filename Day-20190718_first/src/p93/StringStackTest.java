package p93;

public class StringStackTest {

	public static void main(String[] args) {
		StringStack strStack=new StringStack();
		
		String strElement=strStack.pop();
		strStack.push("홍길동");
		strStack.push("박문수");
		strStack.push("이순신");
		
		strElement=strStack.pop();
		
		if(strElement != null) {
			
			System.out.println(strElement);
			
		}
		

	}

}
