package p77_2;  // 은행 계좌를 만든다

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance) { // 생성자 함수 만들기
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
		
	}
		
	int withdraw(int amount) throws Exception {
		if(balance<amount) {
			throw new Exception("잔액이 부족합니다.");
		}		
		balance-=amount;
		return amount;
		
	}

	public int pay(String string, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
