package day08_11;

import java.util.Random;
import java.util.Scanner;

public class Test010_result03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			int try1 = 0;
			int randomnumber = r.nextInt(20);
			randomnumber = randomnumber + 1;
			while (true) {
				System.out.println("1���� 20���� ���ڸ� �Է����ּ���.");
				int numberchoice = s.nextInt();
				if (numberchoice > 20 || numberchoice < 0) {
					System.out.println("�����߻�");
					break;
				} else {
					if (randomnumber > numberchoice) {
						try1 = try1 + 1;
						System.out.println("�� Ů�ϴ�."+" �õ� Ƚ��: "+try1);
					} else if (randomnumber < numberchoice) {
						try1 = try1 + 1;
						System.out.println("�� �۽��ϴ�."+" �õ� Ƚ��: "+try1);
					} else if (randomnumber == numberchoice) {
						try1 = try1 + 1;
						System.out.println("�� "+try1+"�� �õ��Ͽ� ������ ���߼̽��ϴ�.");
						break;
					}
				}
			}
		}
	}
}
