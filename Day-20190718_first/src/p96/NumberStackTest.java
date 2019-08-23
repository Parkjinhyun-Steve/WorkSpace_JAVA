package p96;

public class NumberStackTest {

	public static void main(String[] args) {
		NumberStack<Integer> intStack = new NumberStack<>();
		
		NumberStack<Long> longStack = new NumberStack<>();
		
		intStack.push(100);
		intStack.push(200);
		
		Integer numElement = intStack.pop();
		
		if (numElement != null) {
			System.out.println(numElement);
		}

	}

}
