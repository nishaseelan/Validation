package com.example.demo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
import jakarta.persistence.Id;

@Entity
@Table(name = "User_Table")
public class User {
	@Id
	private long Id;

	//@NotNull(message = "username should'nt be null")
	@NotBlank(message = "username should'nt be null")
	private String Name;
   @Email(message = "Email  is invalid")
	private String email;
//	@NotNull
//  @Pattern(regexp = "/^[0-9]{1,10}$/",message = "invalid mobile number")
	private int mobile;
	@Min(18)
	@Max(25)
	private int age;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String email, int mobile, int age) {
		super();
		Id = id;
		Name = name;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
	}

}
