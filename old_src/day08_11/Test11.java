package day08_11;

import java.util.Scanner;

public class Test11 {
	/*
	 * for문 while문
	 * 
	 * for(int i = 0; i <10; i++) {
	 * }
	 */
	/*
	 * 배열
	 * 1.자료형[] 배열명 = new 자료형[길이];
	 * 2.자료형 배열명[] = {}; ★
	 * 3.자료형[] 배열명;
	 */
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		Scanner s = new Scanner(System.in);
		String top = "정지운";
		System.out.println("이름을 알아 맞쳐 주세요 : ");
		String choice = s.next();
		if(choice.equals(top)) {
			System.out.println("맞음");
		}else {
			System.out.println("틀림");
		}
	}
}
