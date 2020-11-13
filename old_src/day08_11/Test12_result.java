package day08_11;

import java.util.Scanner;

public class Test12_result {
	/*
	 * 구구단
	 * 입력받은 값에 구구단 출력
	 * 1
	 * 1단
	 * 1 * 1 = 2
	 * 1 * 2 = 2
	 * 9
	 * 9단
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 구구단 입력: ");
		int number = s.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(number+"x"+i+"="+(number*i));
		}
	}
}
