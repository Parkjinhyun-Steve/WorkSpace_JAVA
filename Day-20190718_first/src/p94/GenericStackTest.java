package p94;

public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<String> genStack = new GenericStack<>();
		
		genStack.push("ȫ�浿");
		genStack.push("�ڹ���");
		genStack.push("�̼���");
		
		String genElement = genStack.pop();
		if (genElement != null) {
			System.out.println(genElement);
		}
				

	}

}
