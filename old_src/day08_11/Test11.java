package day08_11;

import java.util.Scanner;

public class Test11 {
	/*
	 * for�� while��
	 * 
	 * for(int i = 0; i <10; i++) {
	 * }
	 */
	/*
	 * �迭
	 * 1.�ڷ���[] �迭�� = new �ڷ���[����];
	 * 2.�ڷ��� �迭��[] = {}; ��
	 * 3.�ڷ���[] �迭��;
	 */
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		Scanner s = new Scanner(System.in);
		String top = "������";
		System.out.println("�̸��� �˾� ���� �ּ��� : ");
		String choice = s.next();
		if(choice.equals(top)) {
			System.out.println("����");
		}else {
			System.out.println("Ʋ��");
		}
	}
}
