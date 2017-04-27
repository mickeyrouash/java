package com.project.dao;
import java.util.List;

import com.project.coupons.*;

public interface ICustomerDAO {
	 void createCustomer(Customer C);
	 void removeCustomer(Customer C);
	 void updateCustomer(Customer C);
	 Company getCustomer(long id);
	 List<Customer> getAllCustomer();
	 List <Coupon> getCoupons();
	 boolean login(String compName, String password);
}
