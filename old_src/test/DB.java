package test;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class DB {
	String[][] array = new String[100][3];
	String[][] array1 = new String[100][3];
	
	int index = 0;

	void insert() {
		String result = "";
//		
//		result =  JOptionPane.showInputDialog("�̸��� �Է��ϼ��� : ");
//		array[index] = result.split(", ");	
		
		array[index][0] = JOptionPane.showInputDialog("0�Է�");
		array[index][1] = JOptionPane.showInputDialog("1�Է�");
		array[index][2] = JOptionPane.showInputDialog("2�Է�");
		index ++;
	}

	void delete() {
		boolean check = false;
		String name = JOptionPane.showInputDialog("������ �̸� ������ �Է��� �ּ���.");
		for (int i = 0; i < index; i++) {
			if (name.equals(array[i][0])) {
				for (int j = i; j < index+i; j++) {
					array[j] = array[j+1];
					
					array[j][0] = array[j + 1][0];
					array[j][1] = array[j + 1][1];
					array[j][2] = array[j + 1][2];
				}
				index--;
				check = true;
			}
		}
		if (check == false) {
			JOptionPane.showMessageDialog(null, "�˻��Ͻ� �̸��� ������ �����ϴ�.");
		}
	}

	void select() {
		boolean check = false;
		String name = JOptionPane.showInputDialog("ã���� �̸��� �Է��� �ּ���");
		for (int i = 0; i < index; i++) {
			if (array[i][0].equals(name)) {
				JOptionPane.showMessageDialog(null, array[i]);
				check = true;
			}
		}
		if (check == false) {
			JOptionPane.showMessageDialog(null, "ã���� ������ �����ϴ�.");
		}

	}

	String list() {
		String result = "��Ϻ��� �Դϴ�.\n";
		if (index == 0) {
			JOptionPane.showMessageDialog(null, "����� ������ �����ϴ�.");

		}
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < array[0].length; j++) {
				result += j == array[0].length - 1 ? array[i][j] : array[i][j] + ", ";
				// JOptionPane.showMessageDialog(null, array[i]);
			}
			result += "\n";
		}
		return result;
	}
}
