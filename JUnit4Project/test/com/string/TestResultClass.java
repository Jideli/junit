package com.string;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestResultClass extends TestResult {

	// add the error
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}
	
	// add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}
	
	@Test
	public void testAdd() {
		Assert.assertEquals(5, 6);
		// add any test
	}
	
	// Marks that the test run should stop
	@Override
	public synchronized void stop() {
		// stop test here
	}
}
