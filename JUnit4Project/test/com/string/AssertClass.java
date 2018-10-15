package com.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AssertClass {
	int num;
	String temp,str;
	
	@Before
	public void setUp()
	{
		num=5;
		temp=null;
		str="Junit is working fine";
	}
	
	@Test
	public void test() {
		// check for equality
		assertEquals("Junit is working fine", str);
		
		// check for false condition
		assertFalse(num > 6);
		
		// check for not null value
		assertNotNull(str);
		
		// check for null value
		assertNull(temp);
		
		//check for true condition
		assertTrue(num==5);
	}
}




