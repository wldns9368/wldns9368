package day08_11;

import java.util.Random;
import java.util.Scanner;

public class Test08_result02 {
	/*
	 * ���� ���α׷�
	 * 
	 * Ȧ ¦ ���� ���� 10000 ����
	 * 
	 * ó���� ������ �����Ұ��� ���������� �Է� ���� ���۽� Ȧ(1) ¦(2) �����ϰ� �ű⿡ �ݾ��� �Ǵ�. �׸��� ���� �Լ��� ����Ͽ� ��������
	 * Ȧ ¦ ���� �ϳ� ������ �ؼ� �̱�� �� �ݾ��� 2�� ���� �� �ݾ� ����
	 */
	public static void main(String[] args) {
		int mymoney = 10000;
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			if(mymoney==0) {
				System.out.println("0�� ���� �ȹ޾�");
				break;
			}
			int random = r.nextInt(2);
			System.out.println("1.���� / 2.����");
			int choice = s.nextInt();
			
			if (choice == 1) {
				System.out.println("������ ���� �Ǿ����ϴ�.\n1.Ȧ / 2.¦");
				int readychoice = s.nextInt();
				System.out.println("�ݾ��� �ɾ��ּ��� : ");
				int money = s.nextInt();
				if(mymoney < money) {
					System.out.println("��� ū������ �����ҷ��� �Ѥ�");
					break;
				}
				
				if(readychoice==random+1) {
					System.out.println("��÷!");
					mymoney=mymoney+money;
					System.out.println("���� �ܾ� : "+mymoney);
				}
				else {
					System.out.println("��÷ X");
					mymoney=mymoney-money;
					System.out.println("���� �ܾ� : "+mymoney);
				}

			} else {
				System.out.println("���� �Ǵ� ����");
				break;
			}

		}
	}
}
