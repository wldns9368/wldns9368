package GameMain1;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



import Field.EasyMonster1;
import Field.MonsterPhysical;
import Field_main.Dd;
import Field_main.Field1;


public class Main {
	static int count = 0;

	
	public static void main(String[] args) {

		ImageIcon img = new ImageIcon("game/img/dddddddddddddddddds212221.jpg");
		ImageIcon img1 = new ImageIcon("game/img/����.jfif");
		ImageIcon img2 = new ImageIcon("game/img/���̷�.jpg");
		ImageIcon img3 = new ImageIcon("game/img/��Ű������.png");

		String[] start1 = { "���ӽ���", "������" };
		String[] start2 = { "��������", "ü�� ȸ��", "�� ����", "���̷�" };
		String[] start3 = { "�ϱ޴���", "�߱޴���", "��޴���" };
		String[] start4 = { "���� ������ �˻�", "���� ������ ����", "���� ������ ����", "���� ������ ���" }; 
		int inputStart1 = JOptionPane.showOptionDialog(null, "", "�������� �̼��� Ž��", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, img, start1, null);
		if (inputStart1 == 1) {
			JOptionPane.showMessageDialog(null, "�����⸦ �����̽��ϴ�.");
		} else {
			/*
			 * Timer timer1 = new Timer();// Ÿ�̸� ��ü ���� TimerTask task1 = new TimerTask() {
			 * // �۾� ��ü ����
			 * 
			 * @Override public void run() {
			 * 
			 * if (count == 0) { JOptionPane.showMessageDialog(null, "�̼���� �������ϴ�...");
			 * count++; } else if (count == 1) { JOptionPane.showMessageDialog(null, ".");
			 * count++; } else if (count == 2) { JOptionPane.showMessageDialog(null, "..");
			 * count++; } else if (count == 3) { JOptionPane.showMessageDialog(null, "...");
			 * count++; } else if (count == 4) { JOptionPane.showMessageDialog(null,
			 * "��! ���ⱸ��!"); timer1.cancel(); } } }; timer1.schedule(task1, 500, 1000);
			 */
			// �ִ�ü��, ����ü��, ���ݷ�, ����
			Field1 f1 = new Field1(100, 100, 20, 5);
			String name = f1.setName();
			f1.setName(name);
			f1.showMyinpormation();
			Dd a23 = new Field1();
			a23.ff();
			while (true) {
				int inputstart2 = JOptionPane.showOptionDialog(null, "", "�������� �̼��� Ž��", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE, img, start2, null);
				if (inputstart2 == -1) {
					JOptionPane.showMessageDialog(null, "�������Ḧ �����̽��ϴ�. \n����˴ϴ�.");
					break;
				}
				switch (inputstart2) {

				case 0://���� ����
					int inputstart3 = JOptionPane.showOptionDialog(null, "", "�������� �̼��� Ž��", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, img1, start3, null);//���� ����
					switch (inputstart3) {

					case 0:
						Random r1 = new Random();
						f1.monsterFight(1); //���� ���� �ѹ�, ���� �ѹ� //�ϱ޴��� = 1
					case 1:

					case 2:
					}

					/*
					 * JOptionPane.showMessageDialog(null, "����dfsdsadsadasdsadsadsadsa", "���� ����",
					 * JOptionPane.WARNING_MESSAGE, img);//���� ����� �̹��� ���
					 */

					break;
				case 1://ȸ���ϱ�
					f1.HpRecover();
					break;
				case 2://�� ����
					f1.showMyinpormation();
					break;
				case 3://�� ������	ww
					int inputstart4 = JOptionPane.showOptionDialog(null, "����� ���̷��Դϴ�.", "�������� ���̷�", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, img2, start4, null);//������ ���� ����
					switch (inputstart4) {
					case 0://������ �˻�
						
						String keyword = (String) JOptionPane.showInputDialog(null, "��Ű�����Ϳ��� ���� ��� ������ �������", "�����̵� �����", JOptionPane.PLAIN_MESSAGE, img3,null , null);
						f1.searchParts(keyword);
						break;
					case 1://������ ����
						int number = Integer.parseInt(JOptionPane.showInputDialog("�ٲٽ� ��� ��ȣ�� �Է����ּ���."));
						f1.renamePartsReCheck(number);
						break;
					case 2://������ ����
						
						break;
					case 3://������ ���
						f1.showPartsList();
						break;
					}
					break;
				}

			} // while ���
		} // ���� else ���
	}
}
