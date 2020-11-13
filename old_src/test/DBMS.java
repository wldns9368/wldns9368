package test;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DBMS {
	DB d= new DB();
	
	public void start() {
		ImageIcon img = new ImageIcon("src/img/1.gif");
		while (true) {
			String[] menu = { "입력", "검색", "삭제", "목록","나가기" };
			int choice = JOptionPane.showOptionDialog(null, "AMS프로그램", "menu", JOptionPane.DEFAULT_OPTION,
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
				JOptionPane.showMessageDialog(null, "나가기를 누르셔서 나가집니다.");
				System.exit(0);
			}
			else {
				//System.out.println("닫기");
				System.exit(0);
			}
			
		}
	}
}
