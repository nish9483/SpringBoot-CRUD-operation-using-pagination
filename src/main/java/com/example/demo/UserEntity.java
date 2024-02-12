package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private String userName;
	private String Password;
	
	UserEntity()
	{
		
	}
	public UserEntity(String user, String userName, String password) {
		super();
		
		this.userName = userName;
		Password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserEntity [  userName=" + userName + ", Password=" + Password + "]";
	}
	
	

}
