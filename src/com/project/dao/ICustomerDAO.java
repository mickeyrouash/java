package com.project.dao;
import java.util.List;

import com.project.coupons.*;

public interface ICustomerDAO {
	 void createCustomer(Customer C) throws DaoException;
	 void removeCustomer(Customer C) throws DaoException;
	 void updateCustomer(Customer C) throws DaoException;
	 Company getCustomer(long id) throws DaoException;
	 List<Customer> getAllCustomer() throws DaoException;
	 List <Coupon> getCoupons() throws DaoException;
	 boolean login(String compName, String password) throws DaoException;
}
