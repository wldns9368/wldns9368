package tms;

import javax.swing.JOptionPane;

public class Road {
	
	void view() {
		int money = 20000;
		Bus bus360 = new Bus();
		Subway line2 = new Subway();
		
		String[] arName = {"����", "����ö"};
		String[] result = new String[2];
		
		while(true) {
			int choice = JOptionPane.showOptionDialog(null, "���߱����� �����ϼ���", "TMS",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, arName, null);
			if (choice == -1) break;
			
			int btnIndex = JOptionPane.showOptionDialog(null, "�������� �����ϼ���", "TMS",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, bus360.arStation, null);
			
			if (btnIndex == 0 && choice == 0) {
				JOptionPane.showMessageDialog(null, "�������� ���� ���� ��������� �����մϴ�.");
				continue;
			}
			switch(choice) {
			case 0:
				result = bus360.go(btnIndex, money).split(",");
				if(result[0].equals("�ܾ׺���")) {
					JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�.");
				}else {
					money = Integer.parseInt(result[0]);
					JOptionPane.showMessageDialog(null, "���� �ܾ� : " + money + "��\n" + result[1]);
				}
				break;
				
			case 1:
				result = line2.go(btnIndex, money).split(",");
				if(result[0].equals("�ܾ׺���")) {
					JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�.");
				}else {
					money = Integer.parseInt(result[0]);
					JOptionPane.showMessageDialog(null, "���� �ܾ� : " + money + "��\n" + result[1]);
				}
				break;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new Road().view();
	}
}











