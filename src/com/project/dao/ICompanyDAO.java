package com.project.dao;
import java.util.List;

import com.project.coupons.*;

public interface ICompanyDAO {
 void createCompany(Company C) throws DaoException;
 void removeCompany(Company C) throws DaoException;
 void updateCompany(Company C) throws DaoException;
 Company getCompany(long id) throws DaoException;
 List<Company> getAllCompanies() throws DaoException;
 List <Coupon> getCoupons() throws DaoException;
 boolean login(String compName, String password) throws DaoException;
 
}
