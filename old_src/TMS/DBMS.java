package TMS;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DBMS {
	/*
	 * ó���� ���� ���̿ɼ����� 1�� �Է� 2�� ã�� 3�� �˻� 4�� ���
	 * �Է� �� : �̸�, ����, ����
	 * DB class �� ���� ���� �ҷ�����
	 */
	DB db = new DB();

	public void start() {
		ImageIcon img = new ImageIcon("src/img/1.gif");
		String[] menu = {"�Է�","ã��","�˻�","���"};
		int choice = JOptionPane.showOptionDialog(null, 
				"", "menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
				img, menu, null);
		System.out.println(choice);
		if(choice == 0) {
			input();
		}
		else if(choice == 1) {
			
		}
		else if(choice == 2) {
			
		}
		else if(choice == 3) {
	
		}
		else {
			System.out.println("�ݱ�");
			System.exit(0);
		}
		
		
	}
	
	public void input() {
		String age = JOptionPane.showInputDialog("���̸� �Է� �ϼ��� : ");
		db.setAge(age);
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ��� : ");
		db.setAge(name);
		String gender = JOptionPane.showInputDialog("������ �Է��ϼ��� : ");
		db.setGender(gender);
		memory();
		
	}
	
	public void memory() {
		
	}
}
