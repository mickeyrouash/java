package com.project.coupons;

import java.util.List;

public class Customer {
	private static long GlobalID=0;
	private long ID;
	private String custName;
	private String password;
	// TODO to define Collection <Coupon>
	private List <Coupon> coupons;

	public Customer(String custName,String password ) {
	  this.ID=++Customer.GlobalID;      
	  this.custName= custName;
      this.password= password;
	}

	public  long getID() {
		return ID;
	}

	public  void setID(long iD) {
		ID = iD;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List <Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List <Coupon> coupons) {
		this.coupons = coupons;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", password=" + password + ", coupons=" + coupons + "]";
	}

}
