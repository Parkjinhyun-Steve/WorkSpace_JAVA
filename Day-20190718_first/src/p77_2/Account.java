package p77_2;  // ���� ���¸� �����

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance) { // ������ �Լ� �����
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
		
	}
		
	int withdraw(int amount) throws Exception {
		if(balance<amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}		
		balance-=amount;
		return amount;
		
	}

	public int pay(String string, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
