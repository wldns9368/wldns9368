package day08_16;

import javax.swing.JOptionPane;

public class Arr {
	public static void main(String[] args) {
		int[][] arrincom = new int[2][3];// ���� �Է¹޾� ����
		String[][] arrname = { { "������A", "������A", "�д���A" }, { "������B", "������B", "�д���B" } };
		int[] aSum = new int[2]; // ���ɺ� ����
		int[] bSum = new int[3]; // ������ ����
		int Asum = 0; // ��ü ����

		double[] aAvg = new double[2];// ���ɺ� ���
		double[] bAvg = new double[3];// ������ ���
		double AAvg = 0.0; // ��ü ���
		String[] name1 = { "Ű��", "����" };
		String[] name2 = { "������", "������", "�д���" };
		String result = "";// ����� ����� ���� ����

		int rLength = arrincom.length;
		int cLength = arrincom[0].length;
		for (int i = 0; i < rLength; i++) {// (���ɺ�, ������, ��ü) ���� ���ϴ� �ݺ���
			for (int j = 0; j < cLength; j++) {
				arrincom[i][j] = Integer.parseInt(JOptionPane.showInputDialog(arrname[i][j] + " " + "������� �Է��ϼ���."));
				aSum[i] += arrincom[i][j];//�Է� ���� ���ɺ� �հ� ������ �ݺ��ؼ� ����
				bSum[j] += arrincom[i][j];//�Է� ���� ������ �հ� ������ �ݺ��ؼ� ����
				Asum += arrincom[i][j];//�Է� ���� ��ü �հ� ������ �ݺ��ؼ� ����
			}
		}
		
		for (int i = 0; i < aAvg.length; i++) {// ���ɺ� ��� ���ϱ�
			aAvg[i] = Double.parseDouble(String.format("%.2f", (double) aSum[i] / bSum.length));
		}
		for (int i = 0; i < bAvg.length; i++) {// ������ ��� ���ϱ�
			bAvg[i] = Double.parseDouble(String.format("%.2f", (double) bSum[i] / aSum.length));
		}
		AAvg = Double.parseDouble(String.format("%.2f", (double) Asum / (rLength * cLength)));// ��ü ��� ���ϱ�
		for (int i = 0; i < rLength; i++) {// ���ɺ� ����� ���
			for (int j = 0; j < cLength; j++) {
				result += arrname[i][j] + " ����� : " + arrincom[i][j] + " ����\n";
			}
			result += name1[i] + " �� ����� : " + aSum[i] + " ����\n";
			result += name1[i] + " ��� ����� : " + aAvg[i] + " ����\n";
		}

		for (int i = 0; i < bSum.length; i++) {// ������ ����� ���
			result += name2[i] + " �� ����� : " + bSum[i] + " ����\n";
			result += name2[i] + " ��� ����� : " + bAvg[i] + " ����\n";
		}
		result += " ��ü �� ����� : " + Asum + " ����\n";
		result += " ��ü ��� ����� : " + AAvg + " ����\n";
		JOptionPane.showMessageDialog(null, result);

	}

}
