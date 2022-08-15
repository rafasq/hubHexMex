package demo.basics;

public class ArrayStringStoredInHeap {


	public static void main(String[] args) {
//		stored in stack
		String name;
		int numArray[];
//		rambo is stored inside the heap
		name = "Rambo";
		numArray = new int[]{2,3};
		System.err.println(name);
		//for each loop
		for(int num : numArray ) {
			System.err.println(num);
			System.err.println("Message");

		}
	}
}
