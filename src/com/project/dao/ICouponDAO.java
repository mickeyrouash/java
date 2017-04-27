package com.project.dao;
import java.util.List;

import com.project.coupons.*;

public interface ICouponDAO {
	 void createCoupon(Coupon C);
	 void removeCoupon(Coupon C);
	 void updateCoupon(Coupon C);
	 Coupon getCoupon(long id);
	 List<Coupon> getAllCoupons();
	 List <Coupon> getCouponsByType(CouponType ct);
	

}
