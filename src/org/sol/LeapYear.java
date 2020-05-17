package org.sol;

public class LeapYear {
	private int year;
	
	//All years divisible by 100 but not by 400 are NOT leap years 
	public boolean isLeap() {
		if(this.year%400==0)
			return true;
		return false;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
}
