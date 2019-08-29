package p000;

public class Entry {
	private String word;
	
	// 클래스명과 똑같은 메소드는 '생성자'//생성자도 메소드중 하나
	public Entry() {   // 생성자
		System.out.println("*** 약어사전 ***");		
	}
		
	
	// 클래스명과 똑같은 메소드는 '생성자'  
    // 파라메터를 다르게 해서 각각의 메소드를 만들수 있다.
	// 오버로딩 -> 같은 이름의 메소드에 다른 파라메터를 넣어서 생성한다.
    // 오버라이딩 -> 메소드명은 같으나 메소드 내용이 다르다.	
	public Entry(String word) {    // 생성자
		this();	        	//  <- this라는 키워드를 이용해서 메소드를 호출한다. 
		this.word = word;   //  <- this.word라는 키워드를 이용해서 메소드를 호출한다.
	}
	
	public void writeView() {   // writeView 라는 메소드 생성
		System.out.println("약어: " + word);
	}	

}
