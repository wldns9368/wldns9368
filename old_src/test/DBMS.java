package test;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DBMS {
	DB d= new DB();
	
	public void start() {
		ImageIcon img = new ImageIcon("src/img/1.gif");
		while (true) {
			String[] menu = { "�Է�", "�˻�", "����", "���","������" };
			int choice = JOptionPane.showOptionDialog(null, "AMS���α׷�", "menu", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, img, menu, null);
			
			if (choice == 0) {
				d.insert();
			} else if (choice == 1) {
				d.select();
			} else if (choice == 2) {
				d.delete();
			} else if (choice == 3) {
				JOptionPane.showMessageDialog(null, d.list());
			} else if(choice == 4) {
				JOptionPane.showMessageDialog(null, "�����⸦ �����ż� �������ϴ�.");
				System.exit(0);
			}
			else {
				//System.out.println("�ݱ�");
				System.exit(0);
			}
			
		}
	}
}
