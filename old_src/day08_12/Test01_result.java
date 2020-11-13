package day08_12;

import java.util.Scanner;

/*
 * °è»ê±â ÇÁ·Î±×·¥
 * ´Ü ¸Þ¼­µå¸¦
 * sum
 * min
 * gob
 * nan
 * À¸·Î »ç¿ëÇØ¼­ Ãâ·ÂÇÏ±â
 * 
 */
public class Test01_result {
	
	public static void main(String[] args) {
		Test01_result t = new Test01_result();
		Scanner s = new Scanner(System.in);
		
		System.out.println("µ¡¼À ÇÒ µÎ°¡Áö °ª : ");
		int choice = s.nextInt();
		System.out.println("µ¡¼À ÇÒ µÎ°¡Áö °ª : ");
		int choice2 = s.nextInt();
		
		System.out.println("µ¡¼À °ª : "+t.sum(choice, choice2));
		System.out.println(t.min(20, 30));
		System.out.println(t.gob(2, 3));
		System.out.println(t.nan(10, 5));
	
	}
	
	int sum(int a1, int a2) {
		System.out.println("µ¡¼À °è»ê±â ÀÔ´Ï´Ù.");
		return a1+a2;
	}
	int min(int a1, int a2) {
		return a1-a2;
	}
	int gob(int a1, int a2) {
		return a1*a2;
	}
	double nan(int a1, int a2) {
		return a1/a2;
	}
	

}
