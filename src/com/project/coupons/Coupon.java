package com.project.coupons;

public class Coupon {
private static long ID;
private String title ;
private String startDate;
private String endDate;
private int amount;
private CouponType type;
private String  message ;
private double price ;
private String image ;
public Coupon (){
	
}
@Override
public String toString() {
	return "Coupon [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount
			+ ", type=" + type + ", message=" + message + ", price=" + price + ", image=" + image + "]";
}
public static long getID() {
	return ID;
}
public static void setID(long iD) {
	ID = iD;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public CouponType getType() {
	return type;
}
public void setType(CouponType type) {
	this.type = type;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}


}
