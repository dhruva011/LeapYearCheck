package org.sol.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.sol.LeapYear;

class TestCase {
	LeapYear yr = new LeapYear();

	@Test
	public void testDivisibleBy400() {
		//All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)
		yr.setYear(2000);
		assertEquals(yr.isLeap(),true);
	}
	
	@Test
	public void testDivisibleBy100not400() {
		//All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
		yr.setYear(1700);
		assertEquals(yr.isLeap(),false);
	}
	
	@Test
	public void testDivisibleBy4not100() {
		//All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
		yr.setYear(2008);
		assertEquals(yr.isLeap(),true);
	}
	
}
