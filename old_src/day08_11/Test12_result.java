package day08_11;

import java.util.Scanner;

public class Test12_result {
	/*
	 * ������
	 * �Է¹��� ���� ������ ���
	 * 1
	 * 1��
	 * 1 * 1 = 2
	 * 1 * 2 = 2
	 * 9
	 * 9��
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ϴ� ������ �Է�: ");
		int number = s.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(number+"x"+i+"="+(number*i));
		}
	}
}
