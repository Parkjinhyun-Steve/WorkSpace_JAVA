package temp;

public class Temp {

	public static void main(String[] args) {
				
		int[] dtemp = {28, 31, 35, 24, 31, 32, 35};
		int[] wtemp = {16, 20, 23, 16, 20, 19, 22};		
		
		for (int i = 0 ; i <= 7 ; i++ ) {
			
			int disIndex = (int) ((dtemp[i] + wtemp[i]) * 0.72 + 40.6);
			
			if (disIndex <= 70)
				System.out.println((i+1) + "�� �������� : "+ disIndex + "\n -> ����\n");
			else if (disIndex <= 75)
				System.out.println((i+1) + "�� �������� : "+ disIndex + "\n -> �Ҽ��� ����� ����\n");
			else if (disIndex <= 80)
				System.out.println((i+1) + "�� �������� : "+ disIndex + "\n -> �ݼ��� ����� ����\n");
			else
				System.out.println((i+1) + "�� �������� : "+ disIndex + "\n -> �ټ��� ����� ����\n");
			}
		
	}
	
}

