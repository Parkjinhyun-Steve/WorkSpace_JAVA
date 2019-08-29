package test_37;

public class Entry {
	String word;
	
	Entry(){	// 생성자
		System.out.println("*** 약어사전 ***");		
		
	}
	
	Entry(String w){	// 생성자
		this();		    // Entry()호출  // 가장 첫줄에 있어야함
		word=w;         // 필드명 초기화  this.word = word; 와 같다.
		 	
	}
	
	public void writeView() {   // writeView 라는 메소드 생성
		System.out.println("약어: " + word);
	}
	
	

}
