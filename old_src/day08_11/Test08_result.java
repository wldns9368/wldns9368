package day08_11;

import java.util.Random;
import java.util.Scanner;

public class Test08_result {
	/*
	 * ���� ���α׷�
	 * 
	 * Ȧ ¦ ����
	 * ���� 10000 ����
	 * 
	 * ó���� ������ �����Ұ��� ���������� �Է�
	 * ���� ���۽� Ȧ(1) ¦(2)
	 * �����ϰ� �ű⿡ �ݾ��� �Ǵ�.
	 * �׸��� ���� �Լ��� ����Ͽ� �������� Ȧ ¦ ���� �ϳ� ������ �ؼ�
	 * �̱�� �� �ݾ��� 2��
	 * ���� �� �ݾ� ����
	 */
	public static void main(String[] args) {
		int money = 10000;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			int rd = r.nextInt(2);
			System.out.println("1.����\n2.����");
			int a1 = s.nextInt();
			if(a1 == 1) {
				System.out.println("����ݾ�: "+ money);
				System.out.println("1.Ȧ 2.¦");
				int choice1 = s.nextInt();
				System.out.println("�ݾ��� �ɾ��ּ���: ");
				int money1 = s.nextInt();
				if(choice1 == 1 && rd == 0) {
					money = money-money1;
				}
				
				else if(choice1 == 1 && rd == 1) {
					money = money+(money1*2);
				}
				
				else if(choice1 == 2 && rd == 0) {
					money = money+(money1*2);
				}
				
				else if(choice1 == 2 && rd == 1) {
					money = money-money1;
				}
				else {
					System.out.println("����");
				}
				System.out.println("���� ��:" + money);
			}
			else if(a1 == 2) {
				System.out.println("�̰ſ� ��");
				break;
			}
		}
	}
	
}
