
package com.string;
import static org.junit.Assert.*;

import org.junit.Test;
public class compareStringsTest {
	/*
	// assertTrue and assertFalse methods --> Boolean methods
	@Test
	public void testCompareString() {
		// create object of compareStrings class
		compareStrings demo = new compareStrings();
		// assertTrue("helo and hello fails",demo.compareString("hello", "hello"));
		assertFalse("helo and hello fails",demo.compareString("hello", "hello"));
	}

	
	// assertEquals(expected, actual) method --> if actual, returns true
	@Test
	public void testConcatString() {
		compareStrings demo = new compareStrings();
	    assertEquals("HelloWorld", demo.concatString("Hello", "World")); // Hello is expectation and World is actual result
	    assertEquals("HellWorld", demo.concatString("Hel", "World")); // Hello is expectation and World is actual result
	    assertEquals("HiWorld", demo.concatString("Hi", "World")); // Hello is expectation and World is actual result
	}
	
	// assertArrayEquals(expected, actual) method
	@Test
	public void testAddOneToArray() {
		compareStrings demo = new compareStrings();
		int expected[] = new int[]{3,8};
		assertArrayEquals(expected, demo.addOneToArray(new int[]{2,7})); // this test will pass, add one to 2 and 7 will make 3 and 8
		
	}
	
	// assertArrayEquals(expected, actual) method
	@Test(timeout = 30) // testing if it will time out in 30 milliseconds
	public void testPerformance() {
		compareStrings demo = new compareStrings();
		demo.performance();
	}*/
		
	
	@Test (expected = ArithmeticException.class)
	public void testException() {
		compareStrings demo = new compareStrings();
		demo.exception(0); // 0 will pass, 1 will fail
	}
}






