package com.project.coupons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.project.dao.CompanyDBDAO;
import com.project.dao.DaoException;
import com.project.dao.ICompanyDAO;

public class TestCoupon {

	public static void main(String[] args) throws FileNotFoundException, IOException, DaoException {
		// TODO Auto-generated method stub
		
		Company comp1 = new Company("comp4","12345","comp3@mail.com");
		CompanyDBDAO company_dao1 = new CompanyDBDAO();
		try {
			company_dao1.createCompany(comp1);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<Company> comp_list= null;
		try {
			comp_list = (ArrayList<Company>) company_dao1.getAllCompanies();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Company company : comp_list) {
			
			try {
				company_dao1.removeCompany(company);
			} catch (DaoException e) {
				// TODO Auto-generated catch block
				throw new DaoException();
			}
			}
		}
		
		
	}


