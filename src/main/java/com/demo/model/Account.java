package com.demo.model;

//import javax.validation.constraints.*;

public class Account {
	
	//@Size(min=5,max=10)
	private String FirstName;
//	@Size(min=5,max=10)
	private String LastName;
//	@Size(min=5,max=100)
	private String Address;
//	@org.hibernate.validator.constraints.Email
	private String Email;
//	@NotNull @Min(15)
	private int Age=15;
	public int getAge() 
	{
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
