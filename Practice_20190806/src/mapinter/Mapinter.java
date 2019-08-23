package mapinter;

import java.util.HashMap;
import java.util.Map; 

public class Mapinter {

	public static void main(String[] args) {		
		Map<String, Integer> scores = new HashMap<>();  // scores HashMap ��ü ����  
		scores.put("Ken", 100);  // ��� �߰��ϱ�  // key -> Ken   value -> 100 
		scores.put("Shin", 60);
		scores.put("Jung", 80);
		System.out.println("�� Map�� ����: " + scores.toString());
		
		scores.put("Shin", 50);  // Shin�� ������ 50������ �Է� -> ������ 60�� -> 50������ ġȯ 
		System.out.println("�� Map�� ����: " + scores.toString());
		
		Integer jungScore = scores.get("Jung");     //Jung�� ������  integer���� jungScore�� �����ϱ�   
		System.out.println("�� Jung�� ����: " + jungScore);
		
		scores.remove("Shin");   //"Shin"�� key��  value�� �����ϱ�
		System.out.println("�� Map�� ����: " + scores.toString());
		
		// scores HashMap�� �ִ� ����� ����  int size ������ �����ϱ� 
		int size = scores.size();  
		System.out.println("�� ����� ��: " + size);
		
		// Ken�̶�� key�� �˻��ؼ� boolean existKen ������ �����ϱ� (t/f)
		boolean existKen = scores.containsKey("Ken");    
		System.out.println("�� ���� ���� : " + existKen);
		
		// 80�� value �� �˻��ؼ� boolean exist80 ������ �����ϱ� (t/f)
		boolean exist80 = scores.containsValue(80); 
		System.out.println("�� 80���� ���� : " + exist80);
		
	}
}
