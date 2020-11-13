package day08_14;//생성자 연습

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignment1_2 {
	
	int My_money;
	String Name;
	public Assignment1_2(){}//기본 생성자 
	public Assignment1_2(int my_money, String name) {
		My_money = my_money;
		Name = name;
		System.out.println(""+Name +My_money);
	}

	Random r = new Random();
	Scanner s = new Scanner(System.in);

	void question() {
		int price = 0;
		int choice1 = 0;
		boolean check_1 = true;
		int random_number = r.nextInt(2);
		while (check_1) {// check_1=true 상태 확인을 통해 홀짝 선택할 때 이상한 값 넣을 시 다시 시도하는 반복문
			choice1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1.홀\n2.짝"));
			if (!(choice1 == 1 || choice1 == 2)) {
				JOptionPane.showMessageDialog(null, "오류입니다.\n다시 시도 해주세요.");
				continue;
			} else {
				check_1 = false;
			}
		}

		while (true) {// 금액 입력시 금액이 0이하 이거나 보유 금액보다 많을 시 다시 시도하는 반복문
			price = Integer.parseInt(JOptionPane.showInputDialog(null, "현재 금액: "+My_money+"\n1.정답 - (+1배)\n2.오답 - (-1배)거실 금액을 입력해주세요."));
			if (price <= 0 || price > My_money) {
				JOptionPane.showMessageDialog(null, "다시 입력 하세요.");
			} else {
				break;
			}
		}

		if (choice1 == (random_number + 1)) {
			My_money += price;
			JOptionPane.showInternalMessageDialog(null, Name+"\n"+"현재 보유 금액: "+My_money);
		} else if (choice1 != (random_number + 1)) {
			My_money -= price;
			JOptionPane.showInternalMessageDialog(null, Name+"\n"+"현재 보유 금액: "+My_money);
		}
	}
}
