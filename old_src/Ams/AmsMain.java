package Ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sun.net.httpserver.Authenticator.Result;



public class AmsMain {
	public static void main(String[] args) {
		String result1 = "1, 2, 3, 4, 5";
		String result2 = "6, 7, 8, 9, 0";
		AmsField af = new AmsField();
		String[] arPlane = new String[5];
		int[] ar = new int[2];
		int choice = 0;
		String keyword = "";
		String insertMsg = "[�߰��Ͻ� ������ �״�� �Է��ϼ���](, ����)]\n" + "�װ���," + " �װ����ȣ, �ִ�°���, �����, ������";
		String[] serchMenu = { "�װ���", "�װ��� ��ȣ", "�ִ�°���", "�����", "������" };
		String[] fixMenu = { "�����", "������" };
		ImageIcon img = new ImageIcon("src/img/1.gif");
		while (true) {
			String[] menu = { "�߰��ϱ�", "�˻��ϱ�", "�����ϱ�", "�����ϱ�", "��Ϻ���" };
			choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, img, menu, null);

			if (choice == -1) {
				break;
			}

			switch (choice) {
			// �߰��ϱ�
			case 0: {
				arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
				if (arPlane.length != 5) {
					JOptionPane.showMessageDialog(null, "���� �̻��մϴ�.");
					break;
				}
				af.insert(arPlane);

				break;
			}
			// �˻��ϱ�
			case 1: {
				int index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, img, serchMenu, null);
				if (index != -1) {
					keyword = JOptionPane.showInputDialog("�˻��Ͻ� " + serchMenu[index] + " (��)�� �Է����ּ���.");
					JOptionPane.showMessageDialog(null, af.search(keyword, index));
				} else {
					JOptionPane.showMessageDialog(null, "�����⸦ �����̽��ϴ�.\n���� �޴��� ���ư��ϴ�.");
					break;
				}
				break;
			}
			// �����ϱ�
			// �����, ������
			// ����� ���� ������ ����
			// �װ��� ��ȣ�� �Է¹ް� �ش� �װ����� ������� �������� ����
			// ������� �������� �����ϸ� ���� ����
			case 2: {
				
				keyword = JOptionPane.showInputDialog("�����Ͻ� �װ��� ��ȣ�� �Է����ּ���");
				if (keyword == null) {// ���ڿ� ������ ����� 'JOptionpane'�� ���������ϸ� ��Ʈ�� ������ ���� '-1'�� ������
										// ���ڿ��� �������� �ƹ� ���� ���� �ʾ�
										// �ּڰ��� 'null'�̹Ƿ� 'keyword'�� �ּڰ��� 'null'�̶� ���Ͽ� �������� ������ �߰���.
										// String ���� Ŭ�������� ���ڰ��� ���Ƶ� �ּڰ��� �ٸ���.

					// int, double���� �⺻�� �������� ���� Ÿ�Գ��� ���ڰ��� ������ �ּڰ��� ����.
					// (�迭�� ����) (�� Ÿ���� �ٸ��� ���� ������ �ּڰ��� �ٸ��� ��)
					// (�� �ּڰ��� ���� �� �Ҵ�� ���� ���� ��)

					// 2���� �迭�� ����ȣ ���� '='�ϸ� �ּڰ��� �Ҵ����ִ°��� (�Ʒ��� ���)
					// ���� �׷��� ��ó�� �ߴٸ� �ٽ� ���ȣ ����ȣ �� �� �־ �Ҵ��� �ص� �ּ� ���ȣ �ּڰ��� ��������.
					// �׷��� ���� �ּڰ��� ���� ���� �ϳ��� �� ��ȣ�� ���� ������ �ּڰ��� ���� �ٸ� ���ȣ�� ���� �� ��ȣ �ȿ� //���� ���� ������
					// (�ּڰ��� ���� ����)
					// ��� ���� ���� �״�� ����

					// a[][]<2�����迭
					// a[1] = a[2] �̷����ϸ� ���ȣ 1, 2������ �� �ּڰ��� ��������.
					// �� �׷��� ���� ó�� �ߴٰ� a[1]�� �ּڰ��� a[1][n]�� ���� �������� ���� �ƴϴ� ��
					//(�� �ּڰ��� �� �ּڰ��� ���� ���ٴ� ���� �ƴ϶�� �� )
         			// �� ����ó�� �ϱ� �������� a[1] = a[2]�� �ּڰ��� a[1] = a[2]�ȿ� �� ���� ���� ���Ƶ� �ּڰ��� �ٸ��� ��
					
					// �׷��� a[2][1] = "�ȳ��ϼ���" �̷��� ������
					// �ٸ� �� ���� �� ��ȣ�� a[1][1]���� ���� �Ȱ��� ����.
					
					// �ٽ� a[1][1] = �ݰ����ϴ�" �̷��� ������
					// a[2][1]���� ���� �Ȱ��� ����. (�ּڰ��� ���� ������ ���� ���ļ� ���� ���������� ���� ���� ���ο��� �����Ų��)
					
					//�� �켱���� (�� �ּڰ� > �� �ּڰ�) << �� �ּڰ��� ������ �� �ּڰ��� �޶� ���� �����ȴ�.
					// ��
					String [][]a = new String[5][5];
					System.out.println(System.identityHashCode(a[1]));
					System.out.println(System.identityHashCode(a[2]));
					a[1] = a[2];
					System.out.println(System.identityHashCode(a[1]));
					System.out.println(System.identityHashCode(a[2]));
					
					a[1][2]= "��";
					System.out.println(System.identityHashCode(a[1]));
					System.out.println(System.identityHashCode(a[2][2]));
					System.out.println(System.identityHashCode(a[1][2]));

					
					a[3] = a[1];
					a[1][2]= "��";
					System.out.println(a[1][2]);
					System.out.println(a[3][2]);
					a[2][2] = "��";
					System.out.println(a[1][2]);
					System.out.println(a[3][2]);
					JOptionPane.showMessageDialog(null, "��������");
					break;
				}
				if (af.a(keyword) == true) {
					JOptionPane.showMessageDialog(null, "�ش� �װ��� ��ȣ�� �����ϴ�.");
				} else {
					int fixNum = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, img, fixMenu, null);
					String newValue = JOptionPane.showInputDialog("���� �ٲٽ� " + fixMenu[fixNum] + "(��)�� �Է����ּ���.");
					af.update(keyword, fixNum, newValue);
					break;
				}
				break;
			}

			// �����ϱ�
			case 3: {
				keyword = JOptionPane.showInputDialog("������ �װ��� ��ȣ�� �Է����ּ���.");
				if (af.delete(keyword)) {
					JOptionPane.showMessageDialog(null, "���� �Ϸ�");
				} else {
					JOptionPane.showMessageDialog(null, "���� ����");
				}
				break;

			}
			// ��Ϻ���
			case 4: {

				JOptionPane.showMessageDialog(null, af.show());
				break;
			}
			}
		}
	}
}
