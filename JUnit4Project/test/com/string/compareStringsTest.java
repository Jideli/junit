

package com.string;
import static org.junit.Assert.*;

import org.junit.Test;
public class compareStringsTest {

	@Test
	public void test() {
		// create object of compareStrings class
		compareStrings demo = new compareStrings();
		
		//assertTrue and assertFalse methods
		// assertTrue("helo and hello fails",demo.compareString("hello", "hello"));
		assertFalse("helo and hello fails",demo.compareString("hello", "hello"));
	}

}
