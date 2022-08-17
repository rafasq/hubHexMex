package com.exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		int array[];
		// new operator allocates 4*9 bytes of memory
		array = new int[9];
		array[0] = 40;
		array[1] = 55;
		array[2] = 63;
		array[3] = 17;
		array[4] = 22;
		array[5] = 68;
		array[6] = 89;
		array[7] = 97;
		array[8] = 89;
		try {
		System.out.println(array[4]);
		System.out.println(array[9]);
		}
		catch (ArrayIndexOutOfBoundsException	arrayIndexOutOfBoundsException) {
			System.err.println("Please enter a valid index " + arrayIndexOutOfBoundsException);
		}

		System.err.println("done");
	}

}
