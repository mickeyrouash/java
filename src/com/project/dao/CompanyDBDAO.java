package com.project.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.project.coupons.Company;
import com.project.coupons.Coupon;

public  class  CompanyDBDAO implements ICompanyDAO {
	
	private static  String TABLE_NAME = "";
	
    public CompanyDBDAO () throws FileNotFoundException, IOException{
    	Properties props = new Properties();
    	props.load(new FileInputStream("coupon.properties"));
    	TABLE_NAME = props.getProperty("company_table");
	}
	
	
	private Connection createConnection() throws FileNotFoundException, IOException {

		try {
			// Dynamically load a class to the jvm
			// this is the common way of loading jdbc
			// drivers - to allow maximum flexibility
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("------Driver loaded");
		// get db properties
		Properties props = new Properties();
		props.load(new FileInputStream("coupon.properties"));
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dbusrl = props.getProperty("dburl");
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbusrl, user, password);
			// 2. create a connection
			System.out.println("--- connection established");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	@Override
	public void createCompany(Company C) throws DaoException{

		try (Connection con = createConnection()) {
			// 3. create a statement
			

			// 4. execute a query
			
			String sql = "insert into " +TABLE_NAME  + " (COMP_NAME,PASSWORD,EMAIL)"
					+ " values(?,?,?)";
			PreparedStatement myStmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			myStmt.setString(1, C.getCompName());
			myStmt.setString(2, C.getPassword());
			myStmt.setString(3, C.getEmail());
			
			
			if(myStmt.executeUpdate()> 0) {
			    ResultSet rs = myStmt.getGeneratedKeys();
			    rs.next();
			    C.setID(rs.getInt(1));
			} 
			System.out.println("Finished update:" + myStmt.toString());
		} catch (IOException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new DaoException(e1);
		}

	}

	@Override
	public void removeCompany(Company C) throws DaoException {
		try (Connection con = createConnection()) {
			// 3. create a statement
			

			// 4. execute a query
			
			String sql = "DELETE FROM " +TABLE_NAME  + "WHERE "
					+ " COMP_ID="+C.getID();
			PreparedStatement myStmt = con.prepareStatement(sql);
			String sql1 = sql;
			
			
			if(myStmt.executeUpdate()> 0) {
			   System.out.println("Finished Delete:" + myStmt.toString());
			} 
			
		} catch (IOException | SQLException e1) {
			// TODO Auto-generated catch block
			
			throw new DaoException(e1);
		}


	}

	@Override
	public void updateCompany(Company C) {
		// TODO Auto-generated method stub

	}

	@Override
	public Company getCompany(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	// get list of all companies 
	@Override
	public List<Company> getAllCompanies() throws DaoException {
		List<Company> comp_list = new ArrayList<>();
		try (Connection con = createConnection()) {
			// 4. execute a query
			
			String sql = "select * from company ";
					
			//PreparedStatement myStmt = con.prepareStatement(sql);
			Statement myStmt = con.createStatement();
			ResultSet sql_result =myStmt.executeQuery(sql);
            //ResultSetMetaData rsmd = rs.getMetaData();
			
			// Every next call - moves the result set to the next
			// record (row). When there no more records, it returns
			// false
			while (sql_result.next())
			{
				long COMP_ID = sql_result.getLong("COMP_ID");
				String COMP_NAME = sql_result.getString("COMP_NAME");
				String PASSWORD = sql_result.getString("PASSWORD");
				String EMAIL = sql_result.getString("EMAIL");
				System.out.println("COMP_ID: " + COMP_ID);
				System.out.println("COMP_NAME: " + COMP_NAME);
				System.out.println("PASSWORD: " + PASSWORD);
				System.out.println("EMAIL: " + EMAIL);
				comp_list.add(new Company(COMP_ID,COMP_NAME,PASSWORD,EMAIL));
				System.out.println("-----------------------------------------");
			}
			
			
			
			System.out.println("Finished get Company list");
		} catch (IOException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new DaoException(e1);
		}

		return comp_list;
	}

	@Override
	public List<Coupon> getCoupons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String compName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
