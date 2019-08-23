package mapinter;

import java.util.HashMap;
import java.util.Map; 

public class Mapinter {

	public static void main(String[] args) {		
		Map<String, Integer> scores = new HashMap<>();  // scores HashMap 객체 생성  
		scores.put("Ken", 100);  // 요소 추가하기  // key -> Ken   value -> 100 
		scores.put("Shin", 60);
		scores.put("Jung", 80);
		System.out.println("① Map의 내용: " + scores.toString());
		
		scores.put("Shin", 50);  // Shin의 점수를 50점으로 입력 -> 점수가 60점 -> 50점으로 치환 
		System.out.println("② Map의 내용: " + scores.toString());
		
		Integer jungScore = scores.get("Jung");     //Jung의 점수를  integer변수 jungScore에 대입하기   
		System.out.println("③ Jung의 점수: " + jungScore);
		
		scores.remove("Shin");   //"Shin"의 key와  value를 삭제하기
		System.out.println("④ Map의 내용: " + scores.toString());
		
		// scores HashMap에 있는 요소의 수를  int size 변수에 대입하기 
		int size = scores.size();  
		System.out.println("⑤ 요소의 수: " + size);
		
		// Ken이라는 key값 검색해서 boolean existKen 변수에 대입하기 (t/f)
		boolean existKen = scores.containsKey("Ken");    
		System.out.println("⑥ 켄의 존재 : " + existKen);
		
		// 80점 value 값 검색해서 boolean exist80 변수에 대입하기 (t/f)
		boolean exist80 = scores.containsValue(80); 
		System.out.println("⑦ 80점의 존재 : " + exist80);
		
	}
}
