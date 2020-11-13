package day08_11;

import java.util.Scanner;

public class Test04_result {
	/*
	 * 너의 이름, 나이, 성별 까지 입력을 다받으면
	 * 다 한꺼번에 출력 하기
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = s.next();
		System.out.println("나이 : ");
		int age = s.nextInt();
		System.out.println("성별 : ");
		String gender = s.next();
		System.out.println("이름: "+ name+"\n나이 : "+age+"\n성별 : "+gender);
	}
}
