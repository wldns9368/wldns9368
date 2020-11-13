package TMS;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DBMS {
	/*
	 * 처음에 선택 제이옵션으로 1번 입력 2번 찾기 3번 검색 4번 목록
	 * 입력 값 : 이름, 나이, 성별
	 * DB class 에 값을 저장 불러내는
	 */
	DB db = new DB();

	public void start() {
		ImageIcon img = new ImageIcon("src/img/1.gif");
		String[] menu = {"입력","찾기","검색","목록"};
		int choice = JOptionPane.showOptionDialog(null, 
				"", "menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
				img, menu, null);
		System.out.println(choice);
		if(choice == 0) {
			input();
		}
		else if(choice == 1) {
			
		}
		else if(choice == 2) {
			
		}
		else if(choice == 3) {
	
		}
		else {
			System.out.println("닫기");
			System.exit(0);
		}
		
		
	}
	
	public void input() {
		String age = JOptionPane.showInputDialog("나이를 입력 하세요 : ");
		db.setAge(age);
		String name = JOptionPane.showInputDialog("이름를 입력하세요 : ");
		db.setAge(name);
		String gender = JOptionPane.showInputDialog("성별을 입력하세요 : ");
		db.setGender(gender);
		memory();
		
	}
	
	public void memory() {
		
	}
}
