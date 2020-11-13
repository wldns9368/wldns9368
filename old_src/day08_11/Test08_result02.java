package day08_11;

import java.util.Random;
import java.util.Scanner;

public class Test08_result02 {
	/*
	 * 토토 프로그램
	 * 
	 * 홀 짝 게임 돈이 10000 있음
	 * 
	 * 처음에 게임을 시작할건지 도망갈건지 입력 게임 시작시 홀(1) 짝(2) 선택하고 거기에 금액을 건다. 그리고 랜덤 함수를 사용하여 랜덤으로
	 * 홀 짝 둘중 하나 나오게 해서 이기면 건 금액의 2배 지면 건 금액 뺴기
	 */
	public static void main(String[] args) {
		int mymoney = 10000;
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			if(mymoney==0) {
				System.out.println("0원 그지 안받아");
				break;
			}
			int random = r.nextInt(2);
			System.out.println("1.시작 / 2.도망");
			int choice = s.nextInt();
			
			if (choice == 1) {
				System.out.println("게임이 시작 되었습니다.\n1.홀 / 2.짝");
				int readychoice = s.nextInt();
				System.out.println("금액을 걸어주세요 : ");
				int money = s.nextInt();
				if(mymoney < money) {
					System.out.println("어디서 큰돈으로 도박할려고 ㅡㅡ");
					break;
				}
				
				if(readychoice==random+1) {
					System.out.println("당첨!");
					mymoney=mymoney+money;
					System.out.println("현재 잔액 : "+mymoney);
				}
				else {
					System.out.println("당첨 X");
					mymoney=mymoney-money;
					System.out.println("현재 잔액 : "+mymoney);
				}

			} else {
				System.out.println("도망 또는 오류");
				break;
			}

		}
	}
}
