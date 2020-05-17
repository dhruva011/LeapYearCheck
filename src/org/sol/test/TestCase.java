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
	
}
