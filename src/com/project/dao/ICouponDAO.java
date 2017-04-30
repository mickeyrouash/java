package com.project.dao;
import java.util.List;

import com.project.coupons.*;

public interface ICouponDAO {
	 void createCoupon(Coupon C) throws DaoException;
	 void removeCoupon(Coupon C) throws DaoException;
	 void updateCoupon(Coupon C) throws DaoException;
	 Coupon getCoupon(long id) throws DaoException;
	 List<Coupon> getAllCoupons() throws DaoException;
	 List <Coupon> getCouponsByType(CouponType ct) throws DaoException;
	

}
