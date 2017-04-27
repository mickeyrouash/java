package com.project.dao;
import java.util.List;

import com.project.coupons.*;

public interface ICompanyDAO {
 void createCompany(Company C);
 void removeCompany(Company C);
 void updateCompany(Company C);
 Company getCompany(long id);
 List<Company> getAllCompanies();
 List <Coupon> getCoupons();
 boolean login(String compName, String password);
 
}
