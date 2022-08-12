package com.exception;

import java.util.Scanner;

public class CustomExceptionEx {
	public static void main(String[] args) {
		int age = 18;
		try {
			if(age < 18 || age > 68) {
				AgeInvalidException ageInvalidException = new AgeInvalidException("Emp age should be 18-68");
				throw ageInvalidException;
			}
			System.err.println("Congrats! begin working!");
		} catch (AgeInvalidException ageInvalidException) {
			String messageString = ageInvalidException.getMessage();
			System.err.println(messageString);
		}
		System.err.println("main done");
	}

}
// Unchecked exception
class AgeInvalidException extends RuntimeException {
	public AgeInvalidException(String message) {
		super(message);
	}
}