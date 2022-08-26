package demo.basics;

public class LoopEx {
	public static void main(String[] args) {
		// print 1 - 10
//	(init; test; incr/decr)
//		0 .. n times
//		for (int i = 1; i < 11; i++) {
//			System.err.println(i);
//		}
//
//		// IP print even numbers from 1-10
//		// 0 .. n times
//		int j = 11;
//		while(j<11) {
//			System.err.println(j);
//			j++;
//		}
//
//		int k = 11;
//		// 1 .. n times
//		do {
//			System.err.println(k);
//			k++;
//		} while(k<11);

//		System.out.println("***********");
		System.out.println("====================");
		// break and continue
		for (int i = 1; i < 11; i++) {
			
			if(i== 9) {
				break;
			}
			if(i== 5 ) {
				continue;
			}
			System.err.print(i + " ");
		}
	}
}
