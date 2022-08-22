package com.prodapt.Registration.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="registration1")
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    String firstname;
    String lastname;
    String password;
    String repeatpassword;
    int age;
    String number;
    String email;
    String city;
    int pincode;
    String aadharnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(String aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", repeatpassword=" + repeatpassword + ", age=" + age + ", number=" + number + ", email="
				+ email + ", city=" + city + ", pincode=" + pincode + ", aadharnumber=" + aadharnumber + "]";
	}
	public Registration(int id, String firstname, String lastname, String password, String repeatpassword, int age,
			String number, String email, String city, int pincode, String aadharnumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.repeatpassword = repeatpassword;
		this.age = age;
		this.number = number;
		this.email = email;
		this.city = city;
		this.pincode = pincode;
		this.aadharnumber = aadharnumber;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}