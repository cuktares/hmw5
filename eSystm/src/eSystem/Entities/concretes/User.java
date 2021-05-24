package eSystem.Entities.concretes;

import eSystem.Entities.abstracts.Entity;

public class User implements Entity{
	private String name;
	private String surName;
	private String email;
	private String password;
	private boolean verify;
	
	public User(String name, String surName, String email, String password, boolean verify) {
		super();
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.password = password;
		this.verify = verify;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
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

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}
	
	

}
