package com.string;

public class TestSuiteClass {
	
	private static String message;
	

	//Constructor
	//@param message to be printed
	public void TestSuiteClass(String message){
		this.message = message;
	}
	
	// prints the message
	public static String printMessage() {
		System.out.println(message);
		return message;
	}
	
	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
