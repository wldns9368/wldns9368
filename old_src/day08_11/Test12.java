package day08_11;

public class Test12 {
	public static void main(String[] args) {
		// int[][] array = {{10,20,30,40},{40,50,60,70}};
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * ***** 
		 * 중첩 for문만 이용해서
		 */
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i+1; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
