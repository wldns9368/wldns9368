package day08_12;

import java.util.Scanner;

/*
 * ���� ���α׷�
 * �� �޼��带
 * sum
 * min
 * gob
 * nan
 * ���� ����ؼ� ����ϱ�
 * 
 */
public class Test01_result {
	
	public static void main(String[] args) {
		Test01_result t = new Test01_result();
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �� �ΰ��� �� : ");
		int choice = s.nextInt();
		System.out.println("���� �� �ΰ��� �� : ");
		int choice2 = s.nextInt();
		
		System.out.println("���� �� : "+t.sum(choice, choice2));
		System.out.println(t.min(20, 30));
		System.out.println(t.gob(2, 3));
		System.out.println(t.nan(10, 5));
	
	}
	
	int sum(int a1, int a2) {
		System.out.println("���� ���� �Դϴ�.");
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
