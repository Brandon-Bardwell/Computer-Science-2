package Roster;

public class Person {

	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;


	public Person(String name) {
		this.name = name;	
	}

	public String getName() {
		return name;
	}

	//get address
	public String getAddress() {
		return address;
	}

	//set address
	public void setAddress(String address) {
		this.address = address;
	}

	//get phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

	//set phone number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//get email
	public String getEmail() {
		return email;
	}

	//set email
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}






}
