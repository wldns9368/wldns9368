package Field_main;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.ChangedCharSetException;

import Field.Character_Monster_Com;
import Field.EasyMonster1;
import Field.EasyMonster2;
import Field.MonsterPhysical;


public class Field1 extends Character_Monster_Com implements Dd {

	// ImageIcon monsterimg = new ImageIcon("game/img/������.jfif");
	ImageIcon exit = new ImageIcon("game/img/Ż�ⱸ.jfif");
	ImageIcon victory = new ImageIcon("game/img/�¸�.jfif");
	ImageIcon death = new ImageIcon("game/img/�й�.jfif");
	ImageIcon chest = new ImageIcon("game/img/��������.png");
	ImageIcon recover = new ImageIcon("game/img/ü��ȸ��.jpg");
	ImageIcon renameParts = new ImageIcon("game/img/����.jfif");

	String[] recoverChoice = { "50% ȸ��", "100% ȸ��", "������" };
	String[] reGameChoice = { "�� �� �� ����", "������" };
	boolean lifeCheck = true;
	ImageIcon[] easyMonsterImg = { new ImageIcon("game/img/������.jfif"), new ImageIcon("game/img/������2.png" + "") };
	ImageIcon[] nomalMonsterImg;
	ImageIcon[] hardMonsterImg;

	Character_Monster_Com[] eazyMonster1 = { new EasyMonster1(), new EasyMonster2() };
	Character_Monster_Com[] nomalMonster;
	Character_Monster_Com[] hardMonster;

	public Field1() { // Character_Monster_Com Ŭ������ ������ ȣ��
		super();
		// TODO Auto-generated constructor stub
	}

	public Field1(int maxhp, int hp, int atk, int dfe) {
		super(maxhp, hp, atk, dfe);
		// TODO Auto-generated constructor stub
	}

	/*
	 * �÷��̾� ���� �޼���
	 */

	// public String[][] Parts = new String[8][4];

	public void reinforcementParts() {// ��� ��ȭ

	}

	public void deleteParts() {// ��� ����

	}

	public void renamePartsReCheck(int number) {
		if (number <= Cnt ) { //�Է��� ��� ��ȣ�� ������ ��� �� ������ �� ����
			while (true) {
				String changeName = JOptionPane.showInputDialog("'" + number + "��' �������� �ٲٽ� �̸��� �Է����ּ���.");
				int choice = Integer.parseInt(JOptionPane.showInputDialog("����" + "'" + number + "��' �� �̸���\n'"
						+ Parts[number - 1][0] + "' ����" + "'" + changeName + "'�� �ٲٽðڽ��ϱ�?\n1.�ٲٰڽ��ϴ�.\n2.�ٽ� �Է��ϰڽ��ϴ�."));
				if (choice == 1) {
					renameParts(number, changeName);
					break;
				}
				if (choice == 0) {
					JOptionPane.showMessageDialog(null, "������ �г����� �ٽ� �Է����ּ���.");
				}
			}
		}
		if (number > Cnt) { //�Է��� ��� ��ȣ�� ������ ��� ������ Ŭ ��
			JOptionPane.showMessageDialog(null, "�Է��� ��ȣ�� ��� �������� �����ϴ�.");
		}
	}

	public void renameParts(int number, String changeName) {// �˻��� ��� �̸� �ٲٱ�
		String before = Parts[number - 1][0];
		String after = Parts[number - 1][0] = changeName;
		JOptionPane.showMessageDialog(null, "��� �̸��� ���� �Ǿ����ϴ�.\n" + "'" + before + "'" + " �� " + "'" + after + "'",
				"��� �̸� ����", JOptionPane.DEFAULT_OPTION, renameParts);
	}

	public void searchParts(String keyword) {// �˻��� ��� ���� ���
		String result1 = "[ 1��° �˻��� ��� ���� ]\n\n";
		String result2 = "[ 2��° �˻��� ��� ���� ]\n\n";
		String a = "'";
		int[] saveSearchNumber; // �˻��� ������ ��� �迭 ���ȣ ����
		int cnt = 0; // �˻��� ��� ����
		int hang = 0; // saveSearchNumber[a]�迭�� i���� ������ �� 'a'�� ��ȣ ��
		for (int i = 0; i < Cnt; i++) {// �迭 ���ȣ�� �����ϴ� �迭�� ũ�⸦ �����ֱ� ���� �ݺ���
			if (keyword.equals(Parts[i][0])) {
				cnt++;
			}
		}
		saveSearchNumber = new int[cnt];// �迭 ũ�� ����
		for (int i = 0; i < Cnt; i++) {
			if (keyword.equals(Parts[i][0])) {
				saveSearchNumber[hang] = i;
				hang++;
			}
		}
		if (cnt == 0) {
			result1 += a + keyword + a + "��� �̸��� \n���� ��� �������� �����ϴ�.\n";
			JOptionPane.showMessageDialog(null, result1);
		} else if (cnt > 0 && cnt < 5) { // �˻��� ��� ������ 1�� �̻� 4�� ������ ��
			for (int i = 0; i < cnt; i++) {
				result1 += "( " + (saveSearchNumber[i] + 1) + "�� ��� ������ )\n";
				for (int j = 0; j < 4; j++) {
					if (j == 0) {
						result1 += "��� ������ �̸� : " + Parts[saveSearchNumber[i]][j] + "\n";
					} else if (j == 1) {
						result1 += "��� ���ݷ� : " + Parts[saveSearchNumber[i]][j] + "\n";
					} else if (j == 2) {
						result1 += "��� ���� : " + Parts[saveSearchNumber[i]][j] + "\n";
					} else if (j == 3) {
						result1 += "��� �ִ�ü�� : " + Parts[saveSearchNumber[i]][j] + "\n";
					}
				}
				result1 += i == cnt - 1 ? "" : "\n";
			}
			JOptionPane.showMessageDialog(null, result1);
		} else if (cnt >= 5) {// �˻��� ��� ������ 5�� �̻� ���� ��
			for (int i = 0; i < cnt; i++) {
				if (i < 4) {
					result1 += "( " + (i + 1) + "�� ��� ������ )\n";
					for (int j = 0; j < 4; j++) {
						if (j == 0) {
							result1 += "��� ������ �̸� : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 1) {
							result1 += "��� ���ݷ� : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 2) {
							result1 += "��� ���� : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 3) {
							result1 += "��� �ִ�ü�� : " + Parts[saveSearchNumber[i]][j] + "\n";
						}
					}
					result1 += i == cnt - 1 ? "" : "\n";

				} else if (i >= 4) {
					result2 += "( " + (i + 1) + "�� ��� ������ )\n";
					for (int j = 0; j < cnt; j++) {
						if (j == 0) {
							result2 += "��� ������ �̸� : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 1) {
							result2 += "��� ���ݷ� : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 2) {
							result2 += "��� ���� : " + Parts[saveSearchNumber[i]][j] + "\n";
						} else if (j == 3) {
							result2 += "��� �ִ�ü�� : " + Parts[saveSearchNumber[i]][j] + "\n";
						}
					}
					result2 += i == cnt - 1 ? "" : "\n";
				}

			}
			JOptionPane.showMessageDialog(null, result1);
			JOptionPane.showMessageDialog(null, result2);
		}

	}

	public void showPartsList() { // �� ���� ��� ������ ��� ��� �޼���
		String result1 = "[ ���� ������ 1��° ��� ] \n\n";
		String result2 = "[ ���� ������ 2��° ��� ]\n\n";
		if (Cnt == 0) {
			result1 += "������ ��� �������� ���� �����ϴ�.\n�������� ȹ���Ͽ� �ּ���.";
			JOptionPane.showMessageDialog(null, result1);
		} else if (Cnt > 0 && Cnt < 5) { // ��� ������ 1�� �̻� 4�� ������ ��
			for (int i = 0; i < Cnt; i++) {
				result1 += "( " + (i + 1) + "�� ��� ������ )\n";
				for (int j = 0; j < 4; j++) {
					if (j == 0) {
						result1 += "��� ������ �̸� : " + Parts[i][j] + "\n";
					} else if (j == 1) {
						result1 += "��� ���ݷ� : " + Parts[i][j] + "\n";
					} else if (j == 2) {
						result1 += "��� ���� : " + Parts[i][j] + "\n";
					} else if (j == 3) {
						result1 += "��� �ִ�ü�� : " + Parts[i][j] + "\n";
					}
				}
				result1 += i == Cnt - 1 ? "" : "\n";
			}
			JOptionPane.showMessageDialog(null, result1);
		} else if (Cnt >= 5) {// ��� ������ 5�� �̻� ���� ��
			for (int i = 0; i < Cnt; i++) {
				if (i < 4) {
					result1 += "( " + (i + 1) + "�� ��� ������ )\n";
					for (int j = 0; j < 4; j++) {
						if (j == 0) {
							result1 += "��� ������ �̸� : " + Parts[i][j] + "\n";
						} else if (j == 1) {
							result1 += "��� ���ݷ� : " + Parts[i][j] + "\n";
						} else if (j == 2) {
							result1 += "��� ���� : " + Parts[i][j] + "\n";
						} else if (j == 3) {
							result1 += "��� �ִ�ü�� : " + Parts[i][j] + "\n";
						}
					}
					result1 += i == Cnt - 1 ? "" : "\n";

				} else if (i >= 4) {
					result2 += "( " + (i + 1) + "�� ��� ������ )\n";
					for (int j = 0; j < Cnt; j++) {
						if (j == 0) {
							result2 += "��� ������ �̸� : " + Parts[i][j] + "\n";
						} else if (j == 1) {
							result2 += "��� ���ݷ� : " + Parts[i][j] + "\n";
						} else if (j == 2) {
							result2 += "��� ���� : " + Parts[i][j] + "\n";
						} else if (j == 3) {
							result2 += "��� �ִ�ü�� : " + Parts[i][j] + "\n";
						}
					}
					result2 += i == Cnt - 1 ? "" : "\n";
				}

			}
			JOptionPane.showMessageDialog(null, result1);
			JOptionPane.showMessageDialog(null, result2);
		}

	}

	public void HpRecover() { // �÷��̾� HPȸ�� �޼���
		boolean check = true;
		while (check) {
			int choice = JOptionPane.showOptionDialog(null, "����� ġ���� �帱�Կ�.\n\n����ü�� : " + getHp() + "/" + getMaxHp(),
					"����", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, recover, recoverChoice, null);
			switch (choice) {
			case -1:
				JOptionPane.showMessageDialog(null, "�������Ḧ �����̽��ϴ�. \n����˴ϴ�.");
				check = false;
			case 0:
				setHp((int) (getMaxHp() * 0.5));
				JOptionPane.showMessageDialog(null, "ü���� 50%�� ȸ���Ǿ����ϴ�.\n" + "���� ü�� : " + getHp() + "/" + getMaxHp());
				break;
			case 1:
				setHp(getMaxHp());
				JOptionPane.showMessageDialog(null, "ü���� 100%�� ȸ���Ǿ����ϴ�.\n" + "���� ü�� : " + getHp() + "/" + getMaxHp());

				break;
			case 2:
				JOptionPane.showMessageDialog(null, "�����⸦ �����̽��ϴ�.\n���� �޴��� �̵��մϴ�.");
				check = false;
				break;
			}
		}
	}

	public String setName() {// ���� ���� �� �г��� ���� �޼���
		String name = JOptionPane.showInputDialog("�ڽ��� �г����� �Է����ּ���.");
		return name;
	}

	public void showMyinpormation() { // �� ���� ��� �޼���
		String a = "�� �г��� : " + getName() + "\n���� ü�� : " + getHp() + "/" + getMaxHp() + "\n���� ���ݷ� : " + getAtk()
				+ "\n���� ���� : " + getDfe() + "\n���� �Ӵ� : " + getMoney();
		JOptionPane.showMessageDialog(null, a);
	}

	/*
	 * ��� ȹ�� �˰��� ���� �޼���
	 */

	public void partsDrop(int dungunNumber/* ���� ��ȣ�� ���� ��� ����� �޶��� */) {// ������ Ȯ���� ��� ȹ���ϴ� �޼���
		Random r = new Random();
		Random r1 = new Random();
		int a = r.nextInt(99);
		int b = r1.nextInt(99);
		if (dungunNumber == 1) {// �߱� ������ ��
			if (b < 40) {// (Ȯ�� 40%)
				JOptionPane.showMessageDialog(null, "���� óġ�Ͽ� ��� ȹ���ϼ̽��ϴ�!", "������ ȹ��", JOptionPane.DEFAULT_OPTION,
						chest);
				if (a < 50 && a >= 0) {// ������ ��ü 100 �߿��� 0~49�� ���ȹ�� (Ȯ�� : 50%)
					easyDrop(Cnt);
				} else if (a >= 50 && a < 85) {// (Ȯ�� 35%)
					nomalDrop(Cnt);
				} else if (a >= 85) { // (Ȯ�� 15%);
					hardDrop(Cnt);
				}
			} else if (b >= 40) {// (Ȯ�� 60%)
				JOptionPane.showMessageDialog(null, "���� óġ������ ��� ȹ������ ���߽��ϴ�.");
			}
		}
		if (dungunNumber == 2) {// �߱� ������ ��
			if (b < 40) {// (Ȯ�� 40%)
				JOptionPane.showMessageDialog(null, "���� óġ�Ͽ� ��� ȹ���ϼ̽��ϴ�!", "������ ȹ��", JOptionPane.DEFAULT_OPTION,
						chest);
				if (a < 30 && a >= 0) {// (Ȯ�� : 30%)
					easyDrop(Cnt);
				} else if (a >= 30 && a < 75) {// (Ȯ�� 45%)
					nomalDrop(Cnt);
				} else if (a >= 75) { // (Ȯ�� 25%);
					hardDrop(Cnt);
				}
			} else if (b >= 40) {// (Ȯ�� 60%)
				JOptionPane.showMessageDialog(null, "���� óġ������ ��� ȹ������ ���߽��ϴ�.");
			}
		}
		if (dungunNumber == 3) {// ��� ������ ��
			if (b < 40) {// (Ȯ�� 40%)
				JOptionPane.showMessageDialog(null, "���� óġ�Ͽ� ��� ȹ���ϼ̽��ϴ�!", "������ ȹ��", JOptionPane.DEFAULT_OPTION,
						chest);
				if (a >= 0 && a < 60) {// (Ȯ�� 60)
					nomalDrop(Cnt);
				} else if (a >= 60) { // (Ȯ�� 15%);
					hardDrop(Cnt);
				}
			} else if (b >= 40) {// (Ȯ�� 60%)
				JOptionPane.showMessageDialog(null, "���� óġ������ ��� ȹ������ ���߽��ϴ�.");
			}
		}
	}

	public void partsPutOn(String[][] partsTypeElement, int a) { // ��� ȹ��� ��� ���� ��ŭ �ɷ�ġ�� �߰�
		setAtk(Integer.parseInt(partsTypeElement[a][1]));
		setDfe(Integer.parseInt(partsTypeElement[a][2]));
		setMaxHp(Integer.parseInt(partsTypeElement[a][3]));
		setHp(Integer.parseInt(partsTypeElement[a][3]));
	}

	public void easyDrop(int cnt) {// �ʱ� ��� ȹ��
		if (cnt == 8) {
			JOptionPane.showMessageDialog(null, "���ĭ�� �� ����\n�� �̻� ��� ȹ���� �Ұ����մϴ�.");
		} else {
			Random r = new Random();
			int a = r.nextInt(4);
			Parts[cnt] = partsTypeElement[a];// ��� ������ ����
			partsDropShow(a);
			partsPutOn(partsTypeElement, a);
			Cnt++;
		}
	}

	public void nomalDrop(int cnt) {// �߱� ��� ȹ��
		if (cnt == 8) {
			JOptionPane.showMessageDialog(null, "���ĭ�� �� ����\n�� �̻� ��� ȹ���� �Ұ����մϴ�.");
		} else {
			Random r = new Random();
			int a = r.nextInt(8); // +4
			Parts[cnt] = partsTypeElement[a + 4];
			partsDropShow(a + 4);
			partsPutOn(partsTypeElement, a + 4);
			Cnt++;
		}
	}

	public void hardDrop(int cnt) {// ��� ��� ȹ��
		if (cnt == 8) {
			JOptionPane.showMessageDialog(null, "���ĭ�� �� ����\n�� �̻� ��� ȹ���� �Ұ����մϴ�.");
		} else {
			Random r = new Random();
			int a = r.nextInt(5); // +8
			Parts[cnt] = partsTypeElement[a + 8];
			partsDropShow(a + 8);
			partsPutOn(partsTypeElement, a + 8);
			Cnt++;
		}
	}

	public void partsDropShow(int a/* ��� ����� �迭 �� ��ȣ */) { // ��� ȹ��� ȹ���� ��� ���� ���
		String result = "�̸� : " + partsTypeElement[a][0] + "\n���ݷ� : +" + partsTypeElement[a][1] + "\n���� : +"
				+ partsTypeElement[a][2] + "\n�ִ�ü�� : +" + partsTypeElement[a][3];
		result += "\n��� ȹ���ϼ̽��ϴ�!";
		JOptionPane.showMessageDialog(null, result);
	}

	/*
	 * ���� ���� �޼���
	 */
	public void monsterFight(int dungunNumber) {// ���� ����
		lifeCheck = true;
		while (lifeCheck) {
			Random r = new Random();
			int a = r.nextInt(2);
			if (dungunNumber == 1) {
				eazyMonster1[a].setHp(eazyMonster1[a].getMaxHp());// Ŭ���� �迭���� ���� ���� ��ü�� ������
				JOptionPane.showMessageDialog(null,
						eazyMonster1[a].getName() + "\n(��)��� ���Ͱ� �����߽��ϴ�!\n" + "ü�� : " + eazyMonster1[a].getHp() + "/"
								+ eazyMonster1[a].getMaxHp() + "\n���ݷ� : " + eazyMonster1[a].getAtk() + "\n���� : "
								+ eazyMonster1[a].getDfe() + "\nóġ ���� : " + eazyMonster1[a].getMoney() + "��",
						"�ϱ� ���� ����", JOptionPane.PLAIN_MESSAGE, easyMonsterImg[a]);
				fight(eazyMonster1[a], dungunNumber);
			}
		}
	}

	public void fight(Character_Monster_Com a/* �Է� ���� ���� ��ü */, int dungunNumber) {

		while (true) {
			String choice1 = JOptionPane.showInputDialog(null, "�� ü�� : " + getHp() + "/" + getMaxHp() + "\n\n���� ü�� : "
					+ a.getHp() + "/" + a.getMaxHp() + "\n\n1. �����ϱ� \n2. ��������");
			if (Integer.parseInt(choice1) == 1) {

				a.setHp(-getAtk());
				JOptionPane.showMessageDialog(null, getName() + "(��)�� " + a.getName() + "��(��)\n " + getAtk()
						+ "�� ���ݷ����� �����Ͽ�\n "
						+ (getAtk() - a.getDfe() > 0 ? getAtk() - a.getDfe() + "��ŭ�� �������� �������ϴ�" : "0��ŭ�� �������� �������ϴ�."));
				if (a.getHp() == 0) { // ���� �� ���� ü�� 0�� �� �� óġ���� ȹ�� �� ���θ޴� �̵�
					setMoney(a.getMoney());// óġ ���� ȹ��
					partsDrop(dungunNumber);
					JOptionPane.showMessageDialog(null,
							a.getName() + " ���Ͱ� óġ�Ǿ����ϴ�!\nóġ ���� ȹ�� : +" + a.getMoney() + "��");
					int choice = JOptionPane.showOptionDialog(null, "���� �����մϴ�!", "�¸�", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, victory, reGameChoice, null);
					if (choice == 0) {
						JOptionPane.showMessageDialog(null, "������ ������ �մϴ�.");
						break;
					}
					if (choice == 1) {
						JOptionPane.showMessageDialog(null, "���θ޴��� �̵��մϴ�.");
						lifeCheck = false;// ������ ������ �ݺ��� Ż��
						break;
					}
				}
				setHp(-a.getAtk());
				JOptionPane.showMessageDialog(null, a.getName() + "(��)�� " + getName() + "��(��)\n " + a.getAtk()
						+ "�� ���ݷ����� �����Ͽ�\n "
						+ (a.getAtk() - getDfe() > 0 ? a.getAtk() - getDfe() + "��ŭ�� �������� �������ϴ�" : "0��ŭ�� �������� �������ϴ�."));
				if (getHp() == 0) {// ���� ���� �� ü���� 0�� �Ǹ� ���θ޴��� �̵�
					if (getMoney() == 0) {
						JOptionPane.showMessageDialog(null, "���Ϳ��� ����ϼ̽��ϴ�.\n���θ޴��� �̵��մϴ�.", "Death",
								JOptionPane.PLAIN_MESSAGE, death);
						break;
					} else if (getMoney() >= 2000) {// ��� �� ���� ���� 2000�� �̻��� ��� -2000��
						JOptionPane.showMessageDialog(null, "���Ϳ��� ����ϼ̽��ϴ�.\nȸ�� ������� -2000�� �Ǽ̽��ϴ�. \n���θ޴��� �̵��մϴ�.",
								"Death", JOptionPane.PLAIN_MESSAGE, death);
						break;
					}
				}
			}

			if (Integer.parseInt(choice1) == 2) { // ���� ���� �� �������� ���� �� ����Ǵ� �޼���
				JOptionPane.showMessageDialog(null, "�������⸦ �����̽��ϴ�.\n���θ޴��� �̵��մϴ�.", "������", JOptionPane.PLAIN_MESSAGE,
						exit);
				lifeCheck = false;
				break;
			}
		} // while ���
	}

	@Override
	public void ff() { // �������̽����� �޾ƿ� �߻� �޼��带 �̷��� �������̵� �ϸ� �׳�
						// ���� Ŭ�����ȿ��� �����ѰŶ� ���� ����� �Ѵ�. (�׳� �������̽����� �޾ƿ°Ŷ�� ������ �ʿ� ���ٰ� ����)
		System.out.println("�ȳ�");
		// TODO Auto-generated method stub

	}

}
