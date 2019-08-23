package p94;

public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<String> genStack = new GenericStack<>();
		
		genStack.push("홍길동");
		genStack.push("박문수");
		genStack.push("이순신");
		
		String genElement = genStack.pop();
		if (genElement != null) {
			System.out.println(genElement);
		}
				

	}

}
