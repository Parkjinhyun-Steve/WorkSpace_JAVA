package test_37;

public class SubEntry extends Entry {  // extends Entry  -> Entry 클래스 상속 : Entry 메소드  사용가능    
	String definition; // 필드 추가
	int year;
	
	SubEntry(){ // 생성자  메소드
		
	}
	
	SubEntry(String w){  // 생성자 메소드
		// super();  // super 라는 키워드를 사용하여 상위 클래스  호출  // this는 자기 자신도(클래스) 호출 // super는 상위 클래스 호출
		super(w);  // ?????????????????? 왜 안대지?
		
	}
	SubEntry(String word, String definition, int year) {  // 생성자 매소드(파라메터, 파라메터, 파라메터)
		this(word);				// this는 자기 자신도(클래스) 호출 // super는 상위 클래스 호출
		this.definition=definition;  
		this.year=year; 
	
	}
	
	public void printView() {
		super.writeView();
		System.out.println("원어: " + definition);
		System.out.println("시기: " + year);
		
	}
	

}
