package com.xiudun.beans;

import java.io.Serializable;

public class Person	implements Serializable{
	private static final long serializableUID = 1L;
	private Integer id;
	private String username;
	private transient String password;
	private String sex;
	
	public Person() {
		super();
	}
	public Person(Integer id, String username, String password, String sex) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
