package test;

import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		String[] ate = new String[5];
		while (true) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog("�Է��ϼ��� ��ȣ"));
		
			switch (choice) {
			case 1:
				ate = JOptionPane.showInputDialog("���� �Է��ϼ���").split(", ");
				t.a(ate);
				break;

			case 2:
				int a = Integer.parseInt(JOptionPane.showInputDialog("�Է����ּ��� �迭 ��"));
				t.c(a);
			}
		}
	}
}
