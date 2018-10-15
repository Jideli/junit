package com.string;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseClass extends TestCase {
	
	@Override
	@Before
	public void setUp() {
	}

	@Test
	public void testCaseDemo() {
		//count the number of test cases
		System.out.println("No of test cases = " + this.countTestCases());
		
		//test getName
		String name = this.getName();
		System.out.println("Test case name = " + name);
		
		//test setName
		this.setName("testNewAdd");
		String newName = this.getName();
		System.out.println("Updated test case name = " + newName);
	}
	
	// tearDown used to close the connection or clean up activities
	@Override
	@After
	public void tearDown() {
	}
}
