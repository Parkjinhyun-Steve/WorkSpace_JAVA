package p62;

public class BoxingTest {

	public static void main(String[] args) {
		//UnBoxing
		
		int num=10;  // type -> ũ�⸦ ������						
		
		//Integer num02=Integer.valueOf(10); -> ���� ���(����)   ���� �־��ٶ��� valueOf �ҷ��ö��� intValue
		Integer numInt=10;  // ������ ��� ; ����ڽ� -> Ŭ������ ���� �ڵ� 
		
		
		//Integer sum=num + numInt.intValue(); -> ���� ���
		Integer sum=num + numInt; //������ ��� ;
				                  //10�̶� ����ڽ̵Ǿ� �ִ� ���� ���� ����Ϸ��� ��ڽ��� �ؾ� �� -> ���� -> ���� ����ֱ� ���ؼ� ����ڽ��� �� �ؾ� ��
		
		// * ��� : 4���� �ܿ��� -> valueOf intValue parseInt toString *	
		
	}

}
