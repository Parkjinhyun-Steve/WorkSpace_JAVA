package kr.co.iotmit;

public class MoneyDTO {
	private int no;  // 변수 선언  // 객체생성(??)
	private String date; // 변수 선언
	private String category;  // 변수 선언
	private String particulars;  // 변수선언
	private int money;  // 변수선언
	
	
	// 메소드를 get을 통해서 읽거나, set를 통해서 쓸 수 있다. 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

}
