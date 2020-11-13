package day08_11;

import java.util.Scanner;

public class Test03 {
	//A.B -> A 안에 B
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String choice = s.next();
		System.out.println(choice);
		
		System.out.println("정수형 입력 : ");
		int choice1 = s.nextInt();
		System.out.println(choice1);
		
		System.out.println("실수형 입력 : ");
		double choice2 = s.nextDouble();
		System.out.println(choice2);
		
	}
}
