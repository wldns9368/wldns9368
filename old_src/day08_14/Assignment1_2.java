package day08_14;//������ ����

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignment1_2 {
	
	int My_money;
	String Name;
	public Assignment1_2(){}//�⺻ ������ 
	public Assignment1_2(int my_money, String name) {
		My_money = my_money;
		Name = name;
		System.out.println(""+Name +My_money);
	}

	Random r = new Random();
	Scanner s = new Scanner(System.in);

	void question() {
		int price = 0;
		int choice1 = 0;
		boolean check_1 = true;
		int random_number = r.nextInt(2);
		while (check_1) {// check_1=true ���� Ȯ���� ���� Ȧ¦ ������ �� �̻��� �� ���� �� �ٽ� �õ��ϴ� �ݺ���
			choice1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Ȧ\n2.¦"));
			if (!(choice1 == 1 || choice1 == 2)) {
				JOptionPane.showMessageDialog(null, "�����Դϴ�.\n�ٽ� �õ� ���ּ���.");
				continue;
			} else {
				check_1 = false;
			}
		}

		while (true) {// �ݾ� �Է½� �ݾ��� 0���� �̰ų� ���� �ݾ׺��� ���� �� �ٽ� �õ��ϴ� �ݺ���
			price = Integer.parseInt(JOptionPane.showInputDialog(null, "���� �ݾ�: "+My_money+"\n1.���� - (+1��)\n2.���� - (-1��)�Ž� �ݾ��� �Է����ּ���."));
			if (price <= 0 || price > My_money) {
				JOptionPane.showMessageDialog(null, "�ٽ� �Է� �ϼ���.");
			} else {
				break;
			}
		}

		if (choice1 == (random_number + 1)) {
			My_money += price;
			JOptionPane.showInternalMessageDialog(null, Name+"\n"+"���� ���� �ݾ�: "+My_money);
		} else if (choice1 != (random_number + 1)) {
			My_money -= price;
			JOptionPane.showInternalMessageDialog(null, Name+"\n"+"���� ���� �ݾ�: "+My_money);
		}
	}
}
