package model;

import java.sql.*;

public class User {
	private String id;
	private String password;
	private String email;
	private String name;
	private String age;
	private String sex;
	private String money;
	
	public User(String id,String password,String email,String name,String age,String sex,String money) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.money = money;
	}
	
	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
