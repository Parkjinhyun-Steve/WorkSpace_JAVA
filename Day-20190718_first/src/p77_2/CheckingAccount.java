package p77_2;  // Account 클래스 상속 받음

public class CheckingAccount extends Account { // 생성자 함수 super를 가지고 초기화 함
	String cardNo; // 카드넘버 추가

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo=cardNo;
		
	}
	
	public int pay(String cardNo, int amount) throws Exception {  //pay라는 함수를 만든다 // 카드 넘버가 없기 때문에 추가해 줘야 한다.
	
		if(!cardNo.equals(this.cardNo) || balance<amount) {  // 카드넘버와 어마운트가 있다면 위드로우 할수 있도록 한다.
			throw new Exception("지불이 불가능합니다.");
		}		
		return withdraw(amount);
	
	}
}

