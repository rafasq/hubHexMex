package demo.basics;

//import java.util.Arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		// linear, homogenous, static
		int num[] = {5,2,1,55};
//		1, 2, 5, 22, 55
		java.util.Arrays.sort(num);
		for(int n : num)
		{
			System.out.println(n);
		}
		int index = Arrays.binarySearch(num,7);
		System.out.println("Index :" + index);
		// declaration & initialization (0's)
//		int number;
//		number = number * number;
//		System.err.println(number);
		int array1[] = new int[9];
		System.out.println(array1.length);
		for(int i = 0; i< 9; i++) {
			System.err.println(array1[i]);
		}
		// declaration & initialization	
		int array2[] = {40,55,63};
		System.out.println(array2.length);
		for(int i = 0; i< 3; i++) {
			System.err.println(array2[i]);
		}
		// int array
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
		
		for(int i = 0; i< 9; i++) {
			System.err.println(array[i]);
		}
		// 5 th element
		System.err.println(array[4]);
		
		System.err.println("for-each");
		for(int number : array) {
			System.err.println(number);
		}
		//IP accept 1 to 9 using switch case and display the number in the index.
	}
}
