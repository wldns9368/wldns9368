package day08_11;

import java.util.Scanner;

public class Test06_result {
	/*
	 * �� ���� Ctrl + shift + f �Է��� ����, ����, ����, ��ȸ ����� ���Ͽ� 
	 * ��� 30 �����̸� C 
	 * ��� 60 �����̸� B 
	 * ��� 80 �����̸� A
	 * 
	 * �Է� ������ �����ų� 100 �ʰ� �� �����Դϴ�. �ٽ� ó������ �Է��� �ּ���
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			
			System.out.println("����: ");
			int g = s.nextInt();
			if(g > 100 || g < 0) {
				System.out.println("������");
			}
				

			System.out.println("����: ");
			int m = s.nextInt();
			if(m > 100 || m < 0) {
				System.out.println("������");
			}

			System.out.println("��ȸ: ");
			int c = s.nextInt();
			if(c > 100 || c < 0) {
				System.out.println("������");
			}

			System.out.println("����: ");
			int s1 = s.nextInt();
			if(s1 > 100 || s1 < 0) {
				System.out.println("������");
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
				System.out.println("���� �� �� �ó� �ù�");
			}
			
			
		}
	}
}
