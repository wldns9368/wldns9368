package day08_13;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		int choice = 0;
		int my_money = 100_000;
		int movie_price = 5000;
		int movie_age = 19;
		String film = "1.�����\n2.�����̴���\n3.��������";
		String food_type = "1.����\n2.�����";
		while (true) {
			boolean movie_check = true;
			String helloMsg = "������� CGV�Դϴ�.\n";
			String menuMsg = "1.�����ϱ�\n2.�����ϱ�\n3.������";
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
			if (choice == 3) {
				JOptionPane.showMessageDialog(null, "�˾� â�� ����˴ϴ�.");
				break;
			}
			if (choice != 1 && choice != 2) {
				JOptionPane.showMessageDialog(null, "�ٽ� �õ����ּ���.");
				continue;
			}
			switch(choice) {
			//�����ϱ� ����
		
			case 1:
				choice = Integer.parseInt(JOptionPane.showInputDialog(film));
				if(choice == 1) {
					JOptionPane.showMessageDialog(null, "����� ��ȭ ���� �Ϸ�Ǿ����ϴ�.\n���� �ݾ�: "+(my_money-movie_price));
				}
				else if(choice == 2) {
					JOptionPane.showMessageDialog(null, "�����̴��� ��ȭ ���� �Ϸ�Ǿ����ϴ�.\n���� �ݾ�: "+(my_money-movie_price));
				}
				else if(choice == 3) {
					int age = Integer.parseInt(JOptionPane.showInputDialog(null, "���̸� �Է����ּ���."));
					if(age >= movie_age) {
					JOptionPane.showMessageDialog(null, "����� ��ȭ ���� �Ϸ�Ǿ����ϴ�.\n���� �ݾ�: "+(my_money-movie_price));
					}
					else if(age < 0){
						JOptionPane.showMessageDialog(null, "�Է� ����.\n ���θ޴��� ���ư��ϴ�.");
						movie_check = false;
					}
					else if(age < movie_age) {
						JOptionPane.showMessageDialog(null, "û�ҳ� ���� �Ұ� ��ȭ�Դϴ�.\n���� �޴��� ���ư��ϴ�.");
						movie_check = false;
						continue;
					}
				}
				if(movie_check) {
					my_money-=movie_price;
					JOptionPane.showMessageDialog(null, "���� �ݾ�: "+my_money);
				}
				break;
			case 2:
				
			}
		}
	}
}
