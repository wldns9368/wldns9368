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
//		result =  JOptionPane.showInputDialog("이름를 입력하세요 : ");
//		array[index] = result.split(", ");	
		
		array[index][0] = JOptionPane.showInputDialog("0입력");
		array[index][1] = JOptionPane.showInputDialog("1입력");
		array[index][2] = JOptionPane.showInputDialog("2입력");
		index ++;
	}

	void delete() {
		boolean check = false;
		String name = JOptionPane.showInputDialog("삭제할 이름 정보를 입력해 주세요.");
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
			JOptionPane.showMessageDialog(null, "검색하신 이름의 정보가 없습니다.");
		}
	}

	void select() {
		boolean check = false;
		String name = JOptionPane.showInputDialog("찾으실 이름을 입력해 주세요");
		for (int i = 0; i < index; i++) {
			if (array[i][0].equals(name)) {
				JOptionPane.showMessageDialog(null, array[i]);
				check = true;
			}
		}
		if (check == false) {
			JOptionPane.showMessageDialog(null, "찾으신 정보가 없습니다.");
		}

	}

	String list() {
		String result = "목록보기 입니다.\n";
		if (index == 0) {
			JOptionPane.showMessageDialog(null, "저장된 정보가 없습니다.");

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
