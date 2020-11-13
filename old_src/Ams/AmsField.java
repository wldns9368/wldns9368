package Ams;

import javax.swing.JOptionPane;

public class AmsField {
	String[][] arrPlane = new String[100][5];

	int cnt = 0;
	int rLength = cnt;
	int cLength = arrPlane[0].length;
	int updateIndex = 0;

	boolean a(String keyword) {//�����ϱ⿡�� �Է��� ���� �޸𸮿� �ִ��� Ȯ�����ִ� �޼���
		boolean check = true;
		for (int i = 0; i < cnt; i++) {
			if(arrPlane[i][1].equals(keyword)) {
				check = false;
			}
			check = true;

		}
		return check;
	}

	// �߰��ϱ�
	void insert(String[] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}

	// �˻��ϱ�
	String search(String keyword, int index) {
		String result = "";
		int arIndex[];
		int cnt = 0;
		for (int i = 0; i < this.cnt; i++) {
			if (keyword.equals(arrPlane[i][index])) {// �Է��� ���� ����Ǿ� �ִ� ���� ���ڰ��� ��ġ�ϴ��� �˻�
				cnt++;
				updateIndex = i;
				result += "" + i + ", ";// ���ڿ� result�� i��(��������)�� ����
			}
		}
		arIndex = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arIndex[i] = Integer.parseInt(result.split(", ")[i]);// �˻��� ����� �ɸ� i���� �迭�� ����
		}
		return show(arIndex);
	}

	// �˻� ��Ϻ���
	String show(int[] arIndex) {
		String result = "";
		for (int i = 0; i < arIndex.length; i++) {
			result += "��";
			for (int j = 0; j < cLength; j++) {
				result += j == cLength - 1 ? arrPlane[arIndex[i]][j] : arrPlane[arIndex[i]][j] + ", ";

			}
			result += "\n";
		}
		if (arIndex.length == 0) {
			result = "�˻� ��� ����";
		}
		return result;
	}

	// �����ϱ�
	// �����, ������
	// ����� ���� ������ ����
	// �װ��� ��ȣ�� ������ �� JOption.showOptionDialog()����ϱ�
	// �װ��� ��ȣ�� �Է¹ް� �ش� �װ����� ������� �������� ����
	// ������� �������� �����ϸ� ���� ����
	void update(String keyword, int fixNum/* ��ĥ �׸��� ��ȣ(�����, ������) */, String newValue/* ���Ӱ� �鿩�� �� */) {
		String result = "";
		if (fixNum == 0) {
			result = "�����";
		} else {
			result = "������";
		}
		String beforeValue = arrPlane[updateIndex][fixNum + 3];
		arrPlane[updateIndex][fixNum + 3] = newValue;
		String afterValue = arrPlane[updateIndex][fixNum + 3];
		JOptionPane.showMessageDialog(null, "'" + keyword + "'" + " �װ��� ��ȣ�� " + result + " �׸��� ���� " + "\n'"
				+ beforeValue + "  ��  " + afterValue + "'" + " ������ ����Ǿ����ϴ�.");
	}

	// �����ϱ�
	boolean delete(String keyword) {
		boolean check = false;
		for (int i = 0; i < cnt; i++) {
			if (keyword.equals(arrPlane[i][1])) {
				JOptionPane.showMessageDialog(null, "�װ����ȣ : " + "'" + arrPlane[i][1] + "'" + " ��ȣ�� ���� ������ �����Ǿ����ϴ�.");
				for (int j = i; j < cnt; j++) {// ��ĥ Ƚ��
					arrPlane[j][0] = arrPlane[j +1][0];
					arrPlane[j][1] = arrPlane[j +1][1];
					arrPlane[j][2] = arrPlane[j +1][2];
					arrPlane[j][3] = arrPlane[j +1][3];
					arrPlane[j][4] = arrPlane[j +1][4];
					
				}
				check = true;
				cnt--;
			}
		}
		return check;
	}
	/*
	 * boolean delete(String keyword) { boolean check = false; for (int i = 0; i <
	 * cnt; i++) { if (keyword.equals(arrPlane[i][1])) {
	 * JOptionPane.showMessageDialog(null, "�װ����ȣ : " + "'" + arrPlane[i][1] + "'" +
	 * " ��ȣ�� ���� ������ �����Ǿ����ϴ�."); for (int j = 0; j < cnt - i; j++) {// ��ĥ Ƚ�� for (int
	 * j2 = 0; j2 < arrPlane[0].length; j2++) { arrPlane[i][j2] = arrPlane[i +
	 * 1][j2]; } i++; } cnt--; check = true; } } return check; }
	 */

	// ��Ϻ���
	String show() {

		String result = "�װ���, �װ����ȣ, �ִ�°���, �����, ������\n";
		if (cnt == 0) {
			result += "\n                     (������ �����ϴ�)\n'�߰��ϱ�'(��)�� ���ؼ� ������ �Է����ּ���.";
		} else {
			for (int i = 0; i < cnt; i++) {
				result += "��";
				for (int j = 0; j < cLength; j++) {
					result += j == cLength - 1 ? arrPlane[i][j] : arrPlane[i][j] + ", ";

				}
				result += "\n";
			}
		}
		return result;
	}
}
