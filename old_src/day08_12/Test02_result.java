package day08_12;

import java.util.Scanner;

import day08_11.Test02;

public class Test02_result {
	/*
	 * ���� ���α׷� ����, ����, ������, ���� �Է� �ް� �ΰ��� �� �Է� �޾Ƽ� ����� �ż���� ����
	 */
	public static void main(String[] args) {
		Test02_result t = new Test02_result();
		t.re();
	}
	
	
	void re() {
		Scanner s = new Scanner(System.in);
		System.out.println("���ϴ� ������ ����ּ���.");
		System.out.println("1.���� / 2.���� / 3.���� / 4.������");
		int choice = s.nextInt();
		result(choice);
	}
	
	void result(int a1) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� ���� �Է����ּ���.");
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		if(a1 == 1) {
			System.out.println(number1+"+"+number2+"="+sum(number1, number2));
		}
		else if(a1 == 2) {
			System.out.println(number1+"-"+number2+"="+min(number1, number2));
		}
		else if(a1 == 3) {
			System.out.println(number1+"*"+number2+"="+gob(number1, number2));
		}
		else if(a1 == 4) {
			System.out.println(number1+"/"+number2+"="+nan(number1, number2));
		}
		else {
			System.out.println("����");
		}
	}
	
	int sum(int a1, int a2) {
		return a1 + a2;
	}

	int min(int a1, int a2) {
		return a1 - a2;
	}

	int gob(int a1, int a2) {
		return a1 * a2;
	}

	int nan(int a1, int a2) {
		return a1 / a2;
	}
}
