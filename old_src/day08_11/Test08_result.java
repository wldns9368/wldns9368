package day08_11;

import java.util.Random;
import java.util.Scanner;

public class Test08_result {
	/*
	 * 토토 프로그램
	 * 
	 * 홀 짝 게임
	 * 돈이 10000 있음
	 * 
	 * 처음에 게임을 시작할건지 도망갈건지 입력
	 * 게임 시작시 홀(1) 짝(2)
	 * 선택하고 거기에 금액을 건다.
	 * 그리고 랜덤 함수를 사용하여 랜덤으로 홀 짝 둘중 하나 나오게 해서
	 * 이기면 건 금액의 2배
	 * 지면 건 금액 뺴기
	 */
	public static void main(String[] args) {
		int money = 10000;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			int rd = r.nextInt(2);
			System.out.println("1.시작\n2.도망");
			int a1 = s.nextInt();
			if(a1 == 1) {
				System.out.println("현재금액: "+ money);
				System.out.println("1.홀 2.짝");
				int choice1 = s.nextInt();
				System.out.println("금액을 걸어주세요: ");
				int money1 = s.nextInt();
				if(choice1 == 1 && rd == 0) {
					money = money-money1;
				}
				
				else if(choice1 == 1 && rd == 1) {
					money = money+(money1*2);
				}
				
				else if(choice1 == 2 && rd == 0) {
					money = money+(money1*2);
				}
				
				else if(choice1 == 2 && rd == 1) {
					money = money-money1;
				}
				else {
					System.out.println("오류");
				}
				System.out.println("남은 돈:" + money);
			}
			else if(a1 == 2) {
				System.out.println("싱거운 놈");
				break;
			}
		}
	}
	
}
