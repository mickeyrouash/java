package com.project.coupons;

import java.util.ArrayList;

import com.project.dao.CompanyDBDAO;
import com.project.dao.ICompanyDAO;

public class TestCoupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Company comp1 = new Company("comp3","12345","comp3@mail.com");
		//company_dao1.createCompany(comp1);
		CompanyDBDAO company_dao1 = new CompanyDBDAO();
		
		ArrayList<Company> comp_list=(ArrayList<Company>) company_dao1.getAllCompanies();
		
		
	}

}
