package test;

import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		String[] ate = new String[5];
		while (true) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog("입력하세요 번호"));
		
			switch (choice) {
			case 1:
				ate = JOptionPane.showInputDialog("정보 입력하세요").split(", ");
				t.a(ate);
				break;

			case 2:
				int a = Integer.parseInt(JOptionPane.showInputDialog("입력해주세요 배열 값"));
				t.c(a);
			}
		}
	}
}
