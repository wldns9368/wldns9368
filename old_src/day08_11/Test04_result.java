package day08_11;

import java.util.Scanner;

public class Test04_result {
	/*
	 * ���� �̸�, ����, ���� ���� �Է��� �ٹ�����
	 * �� �Ѳ����� ��� �ϱ�
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = s.next();
		System.out.println("���� : ");
		int age = s.nextInt();
		System.out.println("���� : ");
		String gender = s.next();
		System.out.println("�̸�: "+ name+"\n���� : "+age+"\n���� : "+gender);
	}
}
