package org.sol;

public class LeapYear {
	private int year;
	
	//Fail for All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016) 
	public boolean isLeap() {
		if(this.year%400==0)
			return true;
		return false;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
}
