package p64;  // Ŭ������ �����ϰ� �ִ� �������� �����ϱ� ���� ��Ű���� ����.

public class SampleClass {  // Ŭ������ ����ڰ� ���� ����ϴ� �ڷ����̴�. 
	                        // Ŭ������ �ٸ� Ÿ���� �ڷ����� ��ĸ�����̼�(����) �ϰ� �ִ� �ڷ����̴�.
	                        // Ŭ������ �ڷ��� �Ӹ� �ƴ϶� �Լ����� ��ĸ�����̼� �ϰ� �ִ�.
							// Ŭ������ ��ü������ ����� ����ϱ� ���ؼ��� ��ü������ ��Ʈ�Ͻ��� ����� �Ѵ�.
	
	private String name=null;  // ���� �ʱ�ȭ �Ҷ� null�� ����� �ȴ� !!
	
	private String action() {
		
		//5. �������� �߰�
		name="SampleClassd����";
		
		String responseStr=name+">"+"�Դϴ�.";
				
		return responseStr;
	}
		// TODO Auto-generated method stub
	
		
	
	//1. Ŭ������ ���� �� �� �ֵ��� ��Ʈ�� �Լ��� �����.	
	public static void main(String[] args) {
		
		//2. ��ü ������ �ν��Ͻ� �Ѵ�.
		SampleClass sample=new SampleClass();
		
		
		//3. �Լ��� ȣ���Ͽ� ��ȯ���� �����Ѵ�.
		String response=sample.action();
		
		
		//4. ����� ��ȯ���� ����Ʈ �Ѵ�.
		System.out.println(response);
	}

}

