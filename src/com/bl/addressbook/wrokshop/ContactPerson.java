package com.bl.addressbook.wrokshop;

public class ContactPerson {

	private String firstName, age, city, state;
	private long phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", age=" + age + ", city=" + city + ", state=" + state
				+ ", phoneNumber=" + phoneNumber + ", getFirstName()=" + getFirstName() + ", getAge()=" + getAge()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
