package p77_2;  // Account Ŭ���� ��� ����

public class CheckingAccount extends Account { // ������ �Լ� super�� ������ �ʱ�ȭ ��
	String cardNo; // ī��ѹ� �߰�

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo=cardNo;
		
	}
	
	public int pay(String cardNo, int amount) throws Exception {  //pay��� �Լ��� ����� // ī�� �ѹ��� ���� ������ �߰��� ��� �Ѵ�.
	
		if(!cardNo.equals(this.cardNo) || balance<amount) {  // ī��ѹ��� ���Ʈ�� �ִٸ� ����ο� �Ҽ� �ֵ��� �Ѵ�.
			throw new Exception("������ �Ұ����մϴ�.");
		}		
		return withdraw(amount);
	
	}
}

