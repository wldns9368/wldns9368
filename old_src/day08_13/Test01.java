package day08_13;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		int choice = 0;
		int my_money = 100_000;
		int movie_price = 5000;
		int movie_age = 19;
		String film = "1.어벤져스\n2.스파이더맨\n3.옆집누나";
		String food_type = "1.팝콘\n2.음료수";
		while (true) {
			boolean movie_check = true;
			String helloMsg = "어서오세요 CGV입니다.\n";
			String menuMsg = "1.예매하기\n2.구매하기\n3.나가기";
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
			if (choice == 3) {
				JOptionPane.showMessageDialog(null, "팝업 창이 종료됩니다.");
				break;
			}
			if (choice != 1 && choice != 2) {
				JOptionPane.showMessageDialog(null, "다시 시도해주세요.");
				continue;
			}
			switch(choice) {
			//예매하기 영역
		
			case 1:
				choice = Integer.parseInt(JOptionPane.showInputDialog(film));
				if(choice == 1) {
					JOptionPane.showMessageDialog(null, "어벤져스 영화 예매 완료되었습니다.\n남은 금액: "+(my_money-movie_price));
				}
				else if(choice == 2) {
					JOptionPane.showMessageDialog(null, "스파이더맨 영화 예매 완료되었습니다.\n남은 금액: "+(my_money-movie_price));
				}
				else if(choice == 3) {
					int age = Integer.parseInt(JOptionPane.showInputDialog(null, "나이를 입력해주세요."));
					if(age >= movie_age) {
					JOptionPane.showMessageDialog(null, "어벤져스 영화 예매 완료되었습니다.\n남은 금액: "+(my_money-movie_price));
					}
					else if(age < 0){
						JOptionPane.showMessageDialog(null, "입력 오류.\n 메인메뉴로 돌아갑니다.");
						movie_check = false;
					}
					else if(age < movie_age) {
						JOptionPane.showMessageDialog(null, "청소년 관람 불가 영화입니다.\n메인 메뉴로 돌아갑니다.");
						movie_check = false;
						continue;
					}
				}
				if(movie_check) {
					my_money-=movie_price;
					JOptionPane.showMessageDialog(null, "남은 금액: "+my_money);
				}
				break;
			case 2:
				
			}
		}
	}
}
