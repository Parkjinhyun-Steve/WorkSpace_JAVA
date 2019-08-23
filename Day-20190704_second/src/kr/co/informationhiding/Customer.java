package kr.co.informationhiding;

public class Customer {
	private String FirstName;
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	private String LastName;	
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	private int Age;
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	private String Address;
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	private String Description;
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

/*	public Customer(String firstname, String lastname) {
		this.FirstName=firstname;
		this.LastName=lastname;
	} */

}
