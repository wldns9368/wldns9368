package day08_11;

import java.util.Scanner;

public class Test06_result {
	/*
	 * 줄 정리 Ctrl + shift + f 입력을 수학, 영어, 과학, 사회 평균을 구하여 
	 * 평균 30 이하이면 C 
	 * 평균 60 이하이면 B 
	 * 평균 80 이하이면 A
	 * 
	 * 입력 받을때 음수거나 100 초과 면 오류입니다. 다시 처음부터 입력해 주세요
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			
			System.out.println("국어: ");
			int g = s.nextInt();
			if(g > 100 || g < 0) {
				System.out.println("오류야");
			}
				

			System.out.println("수학: ");
			int m = s.nextInt();
			if(m > 100 || m < 0) {
				System.out.println("오류야");
			}

			System.out.println("사회: ");
			int c = s.nextInt();
			if(c > 100 || c < 0) {
				System.out.println("오류야");
			}

			System.out.println("과학: ");
			int s1 = s.nextInt();
			if(s1 > 100 || s1 < 0) {
				System.out.println("오류야");
			}

			int p = (g + m + c + s1) / 4;

			if (p <= 30 && p >= 0) {
				System.out.println("C");
			} else if (p <= 60 && p > 30) {
				System.out.println("B");
			} else if (p > 60) {
				System.out.println("A");
			} 
			 else {
				System.out.println("시험 개 못 봤네 시발");
			}
			
			
		}
	}
}
