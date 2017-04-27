package com.project.coupons;
import com.project.dao.*;
public class Company {
	private static long ID;
	private String compName;
	private String password;
	private String email;

	public Company(String compName, String password, String email) {
		
		this.compName = compName;
		this.password = password;
		this.email = email;
		
	}

	public Company() {

	}

	public static long getID() {
		return ID;
	}

	public static void setID(long iD) {
		ID = iD;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
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

	@Override
	public String toString() {
		return "Company [compName=" + compName + ", password=" + password + ", email=" + email + "]";
	}

}
