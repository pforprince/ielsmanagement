package com.example.ielts.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	private String name;
	private String email;
	private String password;
	private String contactNumber;
	private String type;
	private String gender;
	private String role;
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", type=" + type + ", gender=" + gender + ", role=" + role + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String name, String email, String password, String contactNumber, String type,
			String gender, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.type = type;
		this.gender = gender;
		this.role = role;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
