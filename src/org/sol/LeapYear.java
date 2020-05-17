package org.sol;

public class LeapYear {
	private int year;
	
	//Handling Year which are divisible by 400
	public boolean isLeap() {
		if(this.year%400==0)
			return true;
		return false;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
}
