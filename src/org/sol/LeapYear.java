package org.sol;

public class LeapYear {
	private int year;
	
	//All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019). 
	public boolean isLeap() {
		if(this.year%400==0)
			return true;
		if(this.year%4==0 && this.year%100!=0)
			return true;
		return false;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
}
